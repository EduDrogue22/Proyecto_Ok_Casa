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
using USUARIOS_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class EliminarUsuario : Form
    {
        public EliminarUsuario()
        {
            InitializeComponent();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            try
            {
                //Capturamos los datos de los usuarios
                int id_usuario = int.Parse(txtCodigo.Value.ToString());

                //Enviamos el codigo con los datos del UsuarioDAO -> BD
                if (new UsuarioDAO().eliminarUsuario(id_usuario))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Usuario eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                } else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Usuario no eliminado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al eliminar " + ex.Message);
                
            }
        }
    }
}
