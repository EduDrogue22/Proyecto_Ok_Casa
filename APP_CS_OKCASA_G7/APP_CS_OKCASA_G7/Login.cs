using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencia
using APP_CS_OKCASA_G7.WSINICIARSESION;

namespace APP_CS_OKCASA_G7
{
    public partial class Login : MetroFramework.Forms.MetroForm
    {
        public Login()
        {
            InitializeComponent();
        }

        private void metroLabel2_Click(object sender, EventArgs e)
        {

        }

        private void Login_Load(object sender, EventArgs e)
        {

        }

        private void metroButton1_Click(object sender, EventArgs e)
        {
            try
            {
                //Capturar usuario y contraseña
                String user = txtUsuario.Text;
                String pass = txtContrasena.Text;

                //Creamos el cliente del WS
                WSINICIARSESION.WSLOGINClient cliente = new WSLOGINClient();

                //Entregamos las credenciales del WS
                if(cliente.Login(user,pass)==1) //Solo entra el admin
                {
                    //Instalamos el menú
                    Menu m = new Menu();
                    //Se oculta el login
                    this.Hide();
                    //Se muestra el menú
                    m.ShowDialog();
                    //Se cierra el login si cierra el menú
                    this.Close();
                } else
                {
                    MetroFramework.MetroMessageBox.Show(this, "Credenciales incorrectas", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(this, "Credenciales incorrectas", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }

        private void txtUsuario_Click(object sender, EventArgs e)
        {

        }

        private void txtContrasena_Click(object sender, EventArgs e)
        {

        }
    }
}
