using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BANCOESTADO_NEGOCIO
{
    public class Bancoestado
    {
        //Atributos
        public int id_cliente { get; set; }
        public String rut { get; set; }
        public String nombre_cliente { get; set; }
        public int credito_hip { get; set; }

        //Contructor
        public Bancoestado()
        {

        }

    }
}
