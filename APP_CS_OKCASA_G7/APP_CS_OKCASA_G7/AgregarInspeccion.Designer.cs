namespace APP_CS_OKCASA_G7
{
    partial class AgregarInspeccion
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtNombreinspeccion = new MetroFramework.Controls.MetroTextBox();
            this.metroLabel1 = new MetroFramework.Controls.MetroLabel();
            this.txtPrecio = new System.Windows.Forms.NumericUpDown();
            this.metroLabel2 = new MetroFramework.Controls.MetroLabel();
            this.btnAgregar = new MetroFramework.Controls.MetroButton();
            ((System.ComponentModel.ISupportInitialize)(this.txtPrecio)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("HP Simplified Hans", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(64)))));
            this.label1.Location = new System.Drawing.Point(12, 19);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(180, 22);
            this.label1.TabIndex = 0;
            this.label1.Text = "Agregar inspeccion";
            // 
            // txtNombreinspeccion
            // 
            // 
            // 
            // 
            this.txtNombreinspeccion.CustomButton.Image = null;
            this.txtNombreinspeccion.CustomButton.Location = new System.Drawing.Point(197, 1);
            this.txtNombreinspeccion.CustomButton.Name = "";
            this.txtNombreinspeccion.CustomButton.Size = new System.Drawing.Size(21, 21);
            this.txtNombreinspeccion.CustomButton.Style = MetroFramework.MetroColorStyle.Blue;
            this.txtNombreinspeccion.CustomButton.TabIndex = 1;
            this.txtNombreinspeccion.CustomButton.Theme = MetroFramework.MetroThemeStyle.Light;
            this.txtNombreinspeccion.CustomButton.UseSelectable = true;
            this.txtNombreinspeccion.CustomButton.Visible = false;
            this.txtNombreinspeccion.Lines = new string[0];
            this.txtNombreinspeccion.Location = new System.Drawing.Point(216, 74);
            this.txtNombreinspeccion.MaxLength = 32767;
            this.txtNombreinspeccion.Name = "txtNombreinspeccion";
            this.txtNombreinspeccion.PasswordChar = '\0';
            this.txtNombreinspeccion.ScrollBars = System.Windows.Forms.ScrollBars.None;
            this.txtNombreinspeccion.SelectedText = "";
            this.txtNombreinspeccion.SelectionLength = 0;
            this.txtNombreinspeccion.SelectionStart = 0;
            this.txtNombreinspeccion.ShortcutsEnabled = true;
            this.txtNombreinspeccion.Size = new System.Drawing.Size(219, 23);
            this.txtNombreinspeccion.TabIndex = 1;
            this.txtNombreinspeccion.UseSelectable = true;
            this.txtNombreinspeccion.WaterMarkColor = System.Drawing.Color.FromArgb(((int)(((byte)(109)))), ((int)(((byte)(109)))), ((int)(((byte)(109)))));
            this.txtNombreinspeccion.WaterMarkFont = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Pixel);
            // 
            // metroLabel1
            // 
            this.metroLabel1.AutoSize = true;
            this.metroLabel1.Location = new System.Drawing.Point(87, 74);
            this.metroLabel1.Name = "metroLabel1";
            this.metroLabel1.Size = new System.Drawing.Size(126, 19);
            this.metroLabel1.TabIndex = 2;
            this.metroLabel1.Text = "Nombre inspección:";
            // 
            // txtPrecio
            // 
            this.txtPrecio.Location = new System.Drawing.Point(216, 113);
            this.txtPrecio.Maximum = new decimal(new int[] {
            276447231,
            23283,
            0,
            0});
            this.txtPrecio.Name = "txtPrecio";
            this.txtPrecio.Size = new System.Drawing.Size(219, 20);
            this.txtPrecio.TabIndex = 3;
            // 
            // metroLabel2
            // 
            this.metroLabel2.AutoSize = true;
            this.metroLabel2.Location = new System.Drawing.Point(161, 114);
            this.metroLabel2.Name = "metroLabel2";
            this.metroLabel2.Size = new System.Drawing.Size(49, 19);
            this.metroLabel2.TabIndex = 4;
            this.metroLabel2.Text = "Precio:";
            // 
            // btnAgregar
            // 
            this.btnAgregar.Location = new System.Drawing.Point(283, 166);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(75, 23);
            this.btnAgregar.TabIndex = 5;
            this.btnAgregar.Text = "Agregar";
            this.btnAgregar.UseSelectable = true;
            this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
            // 
            // AgregarInspeccion
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnAgregar);
            this.Controls.Add(this.metroLabel2);
            this.Controls.Add(this.txtPrecio);
            this.Controls.Add(this.metroLabel1);
            this.Controls.Add(this.txtNombreinspeccion);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "AgregarInspeccion";
            this.Text = "AgregarInspeccion";
            ((System.ComponentModel.ISupportInitialize)(this.txtPrecio)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private MetroFramework.Controls.MetroTextBox txtNombreinspeccion;
        private MetroFramework.Controls.MetroLabel metroLabel1;
        private System.Windows.Forms.NumericUpDown txtPrecio;
        private MetroFramework.Controls.MetroLabel metroLabel2;
        private MetroFramework.Controls.MetroButton btnAgregar;
    }
}