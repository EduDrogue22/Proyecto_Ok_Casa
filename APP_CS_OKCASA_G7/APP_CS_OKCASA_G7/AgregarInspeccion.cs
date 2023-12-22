using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencia de las inspecciones
using INSPECCION_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class AgregarInspeccion : Form
    {
        public AgregarInspeccion()
        {
            InitializeComponent();
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            try
            {
                //Capturamos los datos de la inspeccion
                Inspeccion ins = new Inspeccion()
                {
                    id_inspeccion = 0,
                    nombre_inspeccion = txtNombreinspeccion.Text,
                    precio = int.Parse(txtPrecio.Value.ToString())
                };
                //Enviamos las inspecciones con los datos de InspeccionDAO -> BD
                if (new InspeccionDAO().agregarInspeccion(ins))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Inspección registrado", "Notificación",MessageBoxButtons.OK, MessageBoxIcon.Information);
                } else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Inspección no registrado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al agregar "+ex.Message);
            }
        }

    }
}