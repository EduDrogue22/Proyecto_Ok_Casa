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
using SEGUIMIENTO_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class ListaSeguimiento : Form
    {
        public ListaSeguimiento()
        {
            InitializeComponent();
            try
            {
                mgListado.DataSource = new SeguimientoDAO().listarSeguimiento();
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar " + ex.Message);
                
            }
        }
    }
}
