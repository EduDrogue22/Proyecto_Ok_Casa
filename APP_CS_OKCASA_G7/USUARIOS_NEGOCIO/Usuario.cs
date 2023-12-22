using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace USUARIOS_NEGOCIO
{
    public class Usuario
    {
        //Atributos
        public int id_usuario { get; set; }
        public String rut { get; set; }
        public String nombre_usuario { get; set; }
        public String nombre_completo { get; set; }
        public String contrasenia_usuario { get; set; }
        public int tipo_usuario { get; set; }

        public Usuario()
        {

        }
    }
}
