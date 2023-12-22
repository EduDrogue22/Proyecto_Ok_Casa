using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregar referencias de equipo
using System.Data.OracleClient;
using System.Data;

namespace BIBLIOTECA_NEGOCIO
{
    public class EquipoDAO
    {
        //Crear el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        //Constructor
        public EquipoDAO()
        {

        }

        //Agregar
        public bool agregarEquipo(Equipo eq)
        {
            bool centinela = false;
            try
            {
                //Abrimos conexión
                ora.Open();
                //Llamamos al procedimiento
                OracleCommand comando = new OracleCommand("SP_AGREGAR_EQUIPO",ora);
                //El comando es un procedimiento almacenado
                comando.CommandType = CommandType.StoredProcedure;
                //Entrgar datos del equipo
                comando.Parameters.Add("V_NOMBRE", OracleType.VarChar).Value = eq.descripcion;
                //Ejecutamos el procedimiento y verificamos si guarda
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }

            }
            catch (Exception ex)
            {

                Console.WriteLine("Error al agregar"+ex.Message);
            }
            finally
            {
                //Cerramos conexión
                ora.Close();
            }
            return centinela;
        }

        //Eliminar
        public bool eliminarEquipo(int id_equipo)
        {
            bool centinela = false;
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("DELETE FROM EQUIPO WHERE ID_EQUIPO = "+id_equipo, ora);
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }

            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al eliminar" + ex.Message);
            }
            finally
            {
                ora.Close();
            }
            return centinela;
        }

        //Listar
        public List<Equipo> listarEquipo()
        {
            List<Equipo> listado = new List<Equipo>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_EQUIPO", ora);
                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el curosr que nos devolverá los equipos
                comando.Parameters.Add("EQUIPOS", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos los equipos del dr
                while (dr.Read())
                {
                    Equipo eq = new Equipo()
                    {
                        id_equipo = dr.GetInt32(0),
                        descripcion = dr.GetString(1)
                    };
                    listado.Add(eq);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al listar "+ex.Message);
                
            }
            finally
            {
                ora.Close();
            }
            return listado;
        }
    }
}
