using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencia de la biblioteca
using BIBLIOTECA_NEGOCIO;

namespace APP_CS_OKCASA_G7
{
    public partial class AgregarEquipo : Form
    {
        public AgregarEquipo()
        {
            InitializeComponent();
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            try
            {
                //Capturamos los datos del equipo
                Equipo eq = new Equipo()
                {
                    id_equipo = 0,
                    descripcion = txtNombreequipo.Text
                };
                //Enviamos el equipo con los datos del EquipoDAO -> BD
                if(new EquipoDAO().agregarEquipo(eq))
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Equipo registrado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                } else
                {
                    MetroFramework.MetroMessageBox.Show(ActiveForm, "Equipo no registrado", "Notificación", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al agregar " + ex.Message);
                
            }
        }

        private void metroLabel1_Click(object sender, EventArgs e)
        {

        }
    }
}
