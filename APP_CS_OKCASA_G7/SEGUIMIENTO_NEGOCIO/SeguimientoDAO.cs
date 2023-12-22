using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregamos referencias
using System.Data.OracleClient;
using System.Data;

namespace SEGUIMIENTO_NEGOCIO
{
    public class SeguimientoDAO
    {
        //Creamos el atributo para la conexión 
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        public SeguimientoDAO()
        {

        }

        //Actualizar 
        public bool actualizarSeguimiento(Seguimiento seg)
        {
            bool centinela = false;
            try
            {
                //Abrimos la conexión
                ora.Open();
                //Llamamos al procedimiento
                OracleCommand comando = new OracleCommand("SP_CAMBIAR_ESTADO", ora);
                //El comando es un procedimiento almacenado
                comando.CommandType = CommandType.StoredProcedure;
                //Entregamos los datos del seguimiento
                comando.Parameters.Add("V_ID", OracleType.Number).Value = seg.id_seguimiento;
                comando.Parameters.Add("V_ESTADO", OracleType.VarChar).Value = seg.estado_seguimiento;
                //Ejecutamos el procedimiento y verificamos si cambia
                if (comando.ExecuteNonQuery() > 0)
                {
                    centinela = true;
                }

            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al actualizar " + ex.Message);
                
            } finally
            {
                //Cerramos conexión
                ora.Close();
            }
            return centinela;
        }

        //Listar
        public List<Seguimiento> listarSeguimiento()
        {
            List<Seguimiento> listado = new List<Seguimiento>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_SEGUIMIENTO", ora);

                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá el seguimiento
                comando.Parameters.Add("SEG", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos el seguimiento del dr
                while (dr.Read())
                {
                    Seguimiento seg = new Seguimiento()
                    {
                        id_seguimiento = dr.GetInt32(0),
                        estado_seguimiento = dr.GetString(1),
                        id_historial = dr.GetInt32(2)
                    };
                    listado.Add(seg);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al listar " + ex.Message);

            }
            finally
            {
                ora.Close();
            }
            return listado;
        }
    }
}
