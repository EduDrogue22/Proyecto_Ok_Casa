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
    public partial class ListaInspeccion : Form
    {
        public ListaInspeccion()
        {
            InitializeComponent();
            try
            {
                mgListadp.DataSource = new InspeccionDAO().listarInspeccion();
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar "+ex.Message);
            }
        }

        private void ListaInspeccion_Load(object sender, EventArgs e)
        {

        }
    }
}
