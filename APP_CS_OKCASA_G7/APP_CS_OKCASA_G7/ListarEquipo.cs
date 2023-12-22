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
using BIBLIOTECA_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class ListarEquipo : Form
    {
        public ListarEquipo()
        {
            InitializeComponent();
            try
            {
                mgListado.DataSource = new EquipoDAO().listarEquipo();
            }
            catch (Exception ex)
            {

                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar" + ex.Message);
            }
        }
    }
}
