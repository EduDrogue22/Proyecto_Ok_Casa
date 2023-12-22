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
using SEGUIMIENTO_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class ActualizarSeguimiento : Form
    {
        public ActualizarSeguimiento()
        {
            InitializeComponent();
        }

        private void btnActualizar_Click(object sender, EventArgs e)
        {
            try
            {
                Seguimiento seg = new Seguimiento()
                {
                    id_seguimiento = int.Parse(txtCodigo.Value.ToString()),
                    estado_seguimiento = txtEstado.Text
                };
                if (new SeguimientoDAO().actualizarSeguimiento(seg))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Seguimiento actualizado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                } else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Seguimiento no actualizado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al actualizar " + ex.Message);
              
            }
        }
    }
}
