using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregar las referencias del pago
using System.Data.OracleClient;
using System.Data;

namespace LISTAPAGOS_NEGOCIO
{
    public class PagoDAO
    {
        //Creamos el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = OKCASA1 ; USER ID = OKCASA");

        //Constructor
        public PagoDAO()
        {

        }

        //Listar
        public List<Pago> listarPago()
        {
            List<Pago> listado = new List<Pago>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_PAGO", ora);
                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá los pagos
                comando.Parameters.Add("PAGOS", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos los equipos del dr
                while (dr.Read())
                {
                    Pago pg = new Pago()
                    {
                        id_pago = dr.GetInt32(0),
                        nombre_banco = dr.GetString(1),
                        monto = dr.GetInt32(2),
                        id_usuario = dr.GetInt32(3)
                    };
                    listado.Add(pg);
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
