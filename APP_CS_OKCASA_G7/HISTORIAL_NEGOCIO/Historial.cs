using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HISTORIAL_NEGOCIO
{
    public class Historial
    {
        //Atributos
        public int id_historial { get; set; }
        public String descripcion { get; set; }
        public DateTime fecha_inspeccion { get; set; }
        public int id_usuario { get; set; }
        public int id_equipo { get; set; }
        public int id_inspeccion { get; set; }

        //Constructor
        public Historial()
        {

        }
    }
}
