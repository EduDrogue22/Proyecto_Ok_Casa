using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregar las referencias de la inspeccion
using System.Data.OracleClient;
using System.Data;

namespace INSPECCION_NEGOCIO
{
    public class InspeccionDAO
    {
        //Crear el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        //Constructor
        public InspeccionDAO()
        {

        }

        //Agregar
        public bool agregarInspeccion(Inspeccion ins)
        {
            bool centinela = false;
            try
            {
                //Abrimos conexión
                ora.Open();
                //Llamamos al procedimiento
                OracleCommand comando = new OracleCommand("SP_AGREGAR_INSPECCION", ora);
                //El comando es un procedimiento almacenado
                comando.CommandType = CommandType.StoredProcedure;
                //Entrgamos los datos de la inspeccion
                comando.Parameters.Add("V_NOMBRE_INSPECCION", OracleType.VarChar).Value = ins.nombre_inspeccion;
                comando.Parameters.Add("V_PRECIO", OracleType.Number).Value = ins.precio;
                //Ejecutamos el procedimiento y verificamos si guarda
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al agregar "+ex.Message);

            }
            finally
            {
                //Cerramos conexión
                ora.Close();
            }
            return centinela;
        }

        //Eliminar
        public bool eliminarInspeccion(int id_inspeccion)
        {
            bool centinela = false;
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("DELETE FROM INSPECCION WHERE ID_INSPECCION = " + id_inspeccion, ora);
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al elminar "+ex.Message);
            }
            finally
            {
                ora.Close();
            }
            return centinela;
        }

        //Listar
        public List<Inspeccion> listarInspeccion()
        {
            List<Inspeccion> listado = new List<Inspeccion>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_INSPECCION", ora);

                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá las inspeccion
                comando.Parameters.Add("INSPECCION", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos los inspeccion del dr
                while (dr.Read())
                {
                    Inspeccion ins = new Inspeccion()
                    {
                        id_inspeccion = dr.GetInt32(0),
                        nombre_inspeccion = dr.GetString(1),
                        precio = dr.GetInt32(2)
                    };
                    listado.Add(ins);
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
