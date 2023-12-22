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
using LISTAPAGOS_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class ListaPagos : Form
    {
        public ListaPagos()
        {
            InitializeComponent();
            try
            {
                mgListado.DataSource = new PagoDAO().listarPago();
            }
            catch (Exception ex)
            {

                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar " + ex.Message);
            }
        }

        private void ListaPagos_Load(object sender, EventArgs e)
        {

        }
    }
}
