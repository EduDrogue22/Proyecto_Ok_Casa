using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Agregar referencias de equipo
using System.Data.OracleClient;
using System.Data;

namespace BANCOESTADO_NEGOCIO
{
    public class BancoestadoDAO
    {
        //Crear el atributo para la conexión
        OracleConnection ora = new OracleConnection("DATA SOURCE = xe ; PASSWORD = BANCOESTADO ; USER ID = BANCOESTADO");

        //Constructor
        public BancoestadoDAO()
        {

        }

        //Listar
        public List<Bancoestado> listarBancoestado()
        {
            List<Bancoestado> listado = new List<Bancoestado>();
            try
            {
                ora.Open();
                OracleCommand comando = new OracleCommand("SP_LISTAR_CLIENTES", ora);
                comando.CommandType = CommandType.StoredProcedure;
                //Pasamos el cursor que nos devolverá los clientes
                comando.Parameters.Add("Clientes", OracleType.Cursor).Direction = ParameterDirection.Output;
                //Capturamos el cursor
                OracleDataReader dr = comando.ExecuteReader();
                //Sacamos los clientes del dr
                while (dr.Read())
                {
                    Bancoestado be = new Bancoestado()
                    {
                        id_cliente = dr.GetInt32(0),
                        rut = dr.GetString(1),
                        nombre_cliente = dr.GetString(2),
                        credito_hip = dr.GetInt32(3)
                    };
                    listado.Add(be);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error al listar "+ex.Message);
                
            } finally
            {
                ora.Close();
            }
            return listado;
        }
    }
}
