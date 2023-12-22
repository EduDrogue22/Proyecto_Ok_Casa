using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace APP_CS_OKCASA_G7
{
    public partial class Menu : MetroFramework.Forms.MetroForm
    {
        public Menu()
        {
            InitializeComponent();
        }

        //Metodo para cargar formulario en el panel contenedor
        private void agregarFormulario(object formulario)
        {
            //Limpiar el panel contenedor
            this.panelContenedor.Controls.Clear();
            //Capturar el formulario
            Form f = formulario as Form;
            //Ordenamos el formulario
            f.TopLevel = false;
            f.Dock = DockStyle.Fill;
            //Agregamos el formulario al panel
            this.panelContenedor.Controls.Add(f);
            this.panelContenedor.Tag = f;
            f.Show();
        }

        private void Menu_Load(object sender, EventArgs e)
        {
   
        }

        private void metroTile1_Click(object sender, EventArgs e)
        {

        }

        private void metroTextBox1_Click(object sender, EventArgs e)
        {

        }

        private void metroLabel1_Click(object sender, EventArgs e)
        {

        }

        private void btnListaclientes_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListaclienteBE());
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            agregarFormulario(new ListaInspeccion());
        }

        private void btnAgregarinspeccion_Click(object sender, EventArgs e)
        {
            agregarFormulario(new AgregarInspeccion());
        }

        private void btnEliminarinspeccion_Click(object sender, EventArgs e)
        {
            agregarFormulario(new EliminarInspeccion());
        }

        private void btnAgregarequipo_Click(object sender, EventArgs e)
        {
            agregarFormulario(new AgregarEquipo());
        }

        private void btnEliminarequipo_Click(object sender, EventArgs e)
        {
            agregarFormulario(new EliminarEquipo());
        }

        private void button1_Click_2(object sender, EventArgs e)
        {
            agregarFormulario(new ListarEquipo());
        }

        private void btnPago_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListaPagos());
        }

        private void btnAgregarUsuario_Click(object sender, EventArgs e)
        {
            agregarFormulario(new AgregarUsuario());
        }

        private void btnEliminarUsuario_Click(object sender, EventArgs e)
        {
            agregarFormulario(new EliminarUsuario());
        }

        private void btnListarUsuarios_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListarUsuario());
        }

        private void btnListaHistorial_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListaHistorial());
        }

        private void btnListaSeguimiento_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListaSeguimiento());
        }

        private void btnListaHisto_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ListaHistorial());
        }

        private void btnActualizar_Click(object sender, EventArgs e)
        {
            agregarFormulario(new ActualizarSeguimiento());
        }
    }
}
