using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencias
using BIBLIOTECA_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class EliminarEquipo : Form
    {
        public EliminarEquipo()
        {
            InitializeComponent();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            try { 
                //Capturamos el código del equipo
                int id_equipo = int.Parse(txtCodigo.Value.ToString());

                //Enviamos el código poara eliminar el equipo -> BD
                if (new EquipoDAO().eliminarEquipo(id_equipo))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Equipo eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Equipo no eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al eliminar " + ex.Message);
                
            }
}

        private void EliminarEquipo_Load(object sender, EventArgs e)
        {

        }
    }
}
