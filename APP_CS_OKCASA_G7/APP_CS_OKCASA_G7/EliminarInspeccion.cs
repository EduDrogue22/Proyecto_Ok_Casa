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
using INSPECCION_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class EliminarInspeccion : Form
    {
        public EliminarInspeccion()
        {
            InitializeComponent();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            try
            {
                //Capturamos los datos de la inspeccion
                int id_inspeccion = int.Parse(txtCodigo.Value.ToString());

                //Enviamos el codigo con los datos del InspeccionDAO -> BD
                if (new InspeccionDAO().eliminarInspeccion(id_inspeccion))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Inspección eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Inspección no eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al eliminar " + ex.Message);
            }
        }
    }
}