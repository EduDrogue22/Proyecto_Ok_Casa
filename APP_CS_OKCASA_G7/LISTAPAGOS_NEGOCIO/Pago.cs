using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LISTAPAGOS_NEGOCIO
{
    public class Pago
    {
        //Atributos
        public int id_pago { get; set; }
        public String nombre_banco { get; set; }
        public int monto { get; set; }
        public int id_usuario { get; set; }

        //Constructor
        public Pago()
        {

        }
    }
}
