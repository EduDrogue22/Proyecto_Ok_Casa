using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SEGUIMIENTO_NEGOCIO
{
    public class Seguimiento
    {
        public int id_seguimiento { get; set; }
        public String estado_seguimiento { get; set; }
        public int id_historial { get; set; }

        public Seguimiento()
        {

        }
    }
}
