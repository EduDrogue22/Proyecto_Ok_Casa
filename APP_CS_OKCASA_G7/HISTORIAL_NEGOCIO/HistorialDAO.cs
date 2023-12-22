using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregar las referencias de la inspeccion
using System.Data.OracleClient;
using System.Data;

namespace HISTORIAL_NEGOCIO
{
    public class HistorialDAO
    {
        //Crear el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE =  xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        //Constructor
        public HistorialDAO()
        {

        }

        //Listar
        public List<Historial> listarHistorial()
        {
            List<Historial> listado = new List<Historial>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_HISTORIAL", ora);

                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá el historial
                comando.Parameters.Add("HISTOR", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos el historial del dr
                while (dr.Read())
                {
                    Historial his = new Historial()
                    {
                        id_historial = dr.GetInt32(0),
                        descripcion = dr.GetString(1),
                        fecha_inspeccion = dr.GetDateTime(2),
                        id_usuario = dr.GetInt32(3),
                        id_equipo = dr.GetInt32(4),
                        id_inspeccion = dr.GetInt32(5)
                    };
                    listado.Add(his);
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
