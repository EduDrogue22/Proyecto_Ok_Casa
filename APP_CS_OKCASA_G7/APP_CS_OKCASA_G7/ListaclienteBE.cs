using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Agregamos referencias del WS
using APP_CS_OKCASA_G7.WSBANCOESTADO;

namespace APP_CS_OKCASA_G7
{
    public partial class ListaclienteBE : Form
    {
        public ListaclienteBE()
        {
            InitializeComponent();
            try
            {
                //Creamos la lista del WS
                WSOperacionesClient lista = new WSOperacionesClient();

                List<ClienteBE> lista2 = new List<ClienteBE>();
                foreach (var c in lista.Listar())
                {
                    ClienteBE ce = new ClienteBE()
                    {
                        id = c.id_cliente,
                        rut = c.rut,
                        nombre = c.nombre,
                        credito = c.credito
                    };
                    lista2.Add(ce);
                }
                //Entregamos la lista del WS
                mgList.DataSource = lista2;
            }
            catch (Exception ex)
            {
                MetroFramework.MetroMessageBox.Show(ActiveForm, "Error al listar " + ex.Message);
            }
        }

        private void mgList_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void ListaclienteBE_Load(object sender, EventArgs e)
        {

        }
    }
}
