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
    public partial class ListarUsuario : Form
    {
        public ListarUsuario()
        {
            InitializeComponent();
            try
            {
                mgListar.DataSource = new UsuarioDAO().listarUsuario();
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar " + ex.Message);
                
            }
        }
    }
}
