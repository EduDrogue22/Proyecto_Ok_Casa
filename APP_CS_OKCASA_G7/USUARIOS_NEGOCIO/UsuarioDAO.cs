using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregamos referencias
using System.Data.OracleClient;
using System.Data;

namespace USUARIOS_NEGOCIO
{
    public class UsuarioDAO
    {
        //Creamos el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        //Constructor
        public UsuarioDAO()
        {

        }

        //Agregar
        public bool agregarUsuario(Usuario us)
        {
            bool centinela = false;
            try
            {
                //Abrimos conexión
                ora.Open();
                //Llamamos al procedimiento
                OracleCommand comando = new OracleCommand("SP_AGREGAR_USUARIO", ora);
                //El comando es un procedimiento almacenado
                comando.CommandType = CommandType.StoredProcedure;
                //Entregamos los datos del usuario
                comando.Parameters.Add("V_RUT", OracleType.VarChar).Value = us.rut;
                comando.Parameters.Add("V_NOMBRE_USUARIO", OracleType.VarChar).Value = us.nombre_usuario;
                comando.Parameters.Add("V_NOMBRE", OracleType.VarChar).Value = us.nombre_completo;
                comando.Parameters.Add("V_CONTRASENA", OracleType.VarChar).Value = us.contrasenia_usuario;
                //Ejecutamos el procedimiento y verificamos si guarda
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al agregar " + ex.Message);
                
            } finally
            {
                //Cerramos conexión
                ora.Close();
            }
            return centinela;
        }

        //Eliminar
        public bool eliminarUsuario(int id_usuario)
        {
            bool centinela = false;
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("DELETE FROM USUARIO WHERE ID_USUARIO = " + id_usuario, ora);
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al eliminar " + ex.Message);
                
            } finally
            {
                ora.Close();
            }
            return centinela;
        }

        //Listar 
        public List<Usuario> listarUsuario()
        {
            List<Usuario> listado = new List<Usuario>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_USUARIO", ora);

                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá los usuarios
                comando.Parameters.Add("USUARIOS", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos los usuarios del dr
                while (dr.Read())
                {
                    Usuario us = new Usuario()
                    {
                        id_usuario = dr.GetInt32(0),
                        rut = dr.GetString(1),
                        nombre_usuario = dr.GetString(2),
                        nombre_completo = dr.GetString(3),
                        contrasenia_usuario = dr.GetString(4),
                        tipo_usuario = dr.GetInt32(5)
                    };
                    listado.Add(us);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al listar " + ex.Message);
                
            } finally
            {
                ora.Close();
            }
            return listado;
        }
    }
}
