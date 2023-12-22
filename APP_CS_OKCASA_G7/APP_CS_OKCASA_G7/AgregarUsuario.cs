using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencias de los usuarios
using USUARIOS_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class AgregarUsuario : Form
    {
        public AgregarUsuario()
        {
            InitializeComponent();
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            try
            {
                Usuario us = new Usuario()
                {
                    id_usuario = 0,
                    rut = txtRut.Text,
                    nombre_usuario = txtNombreUsuario.Text,
                    nombre_completo = txtNombreCompleto.Text,
                    contrasenia_usuario = txtContrasena.Text,
                    tipo_usuario = 0
                };
                //Enviamos los usuarios con los datos de UsuarioDAO -> BD
                if (new UsuarioDAO().agregarUsuario(us))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Usuario registrado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                } else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Usuario no registrado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch ( Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al agregar " + ex.Message);
                
            }
        }
    }
}
