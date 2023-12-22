namespace APP_CS_OKCASA_G7
{
    partial class ActualizarSeguimiento
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
            this.metroLabel1 = new MetroFramework.Controls.MetroLabel();
            this.txtCodigo = new System.Windows.Forms.NumericUpDown();
            this.metroLabel2 = new MetroFramework.Controls.MetroLabel();
            this.txtEstado = new MetroFramework.Controls.MetroTextBox();
            this.btnActualizar = new MetroFramework.Controls.MetroButton();
            ((System.ComponentModel.ISupportInitialize)(this.txtCodigo)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("HP Simplified", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(64)))));
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(198, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "Actualizar seguimiento";
            // 
            // metroLabel1
            // 
            this.metroLabel1.AutoSize = true;
            this.metroLabel1.Location = new System.Drawing.Point(128, 47);
            this.metroLabel1.Name = "metroLabel1";
            this.metroLabel1.Size = new System.Drawing.Size(131, 19);
            this.metroLabel1.TabIndex = 1;
            this.metroLabel1.Text = "Código seguimiento:";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Location = new System.Drawing.Point(265, 47);
            this.txtCodigo.Maximum = new decimal(new int[] {
            99999999,
            0,
            0,
            0});
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(120, 20);
            this.txtCodigo.TabIndex = 2;
            // 
            // metroLabel2
            // 
            this.metroLabel2.AutoSize = true;
            this.metroLabel2.Location = new System.Drawing.Point(105, 75);
            this.metroLabel2.Name = "metroLabel2";
            this.metroLabel2.Size = new System.Drawing.Size(154, 19);
            this.metroLabel2.TabIndex = 3;
            this.metroLabel2.Text = "Estado inspección R-P-F:";
            // 
            // txtEstado
            // 
            // 
            // 
            // 
            this.txtEstado.CustomButton.Image = null;
            this.txtEstado.CustomButton.Location = new System.Drawing.Point(98, 1);
            this.txtEstado.CustomButton.Name = "";
            this.txtEstado.CustomButton.Size = new System.Drawing.Size(21, 21);
            this.txtEstado.CustomButton.Style = MetroFramework.MetroColorStyle.Blue;
            this.txtEstado.CustomButton.TabIndex = 1;
            this.txtEstado.CustomButton.Theme = MetroFramework.MetroThemeStyle.Light;
            this.txtEstado.CustomButton.UseSelectable = true;
            this.txtEstado.CustomButton.Visible = false;
            this.txtEstado.Lines = new string[0];
            this.txtEstado.Location = new System.Drawing.Point(265, 75);
            this.txtEstado.MaxLength = 32767;
            this.txtEstado.Name = "txtEstado";
            this.txtEstado.PasswordChar = '\0';
            this.txtEstado.ScrollBars = System.Windows.Forms.ScrollBars.None;
            this.txtEstado.SelectedText = "";
            this.txtEstado.SelectionLength = 0;
            this.txtEstado.SelectionStart = 0;
            this.txtEstado.ShortcutsEnabled = true;
            this.txtEstado.Size = new System.Drawing.Size(120, 23);
            this.txtEstado.TabIndex = 4;
            this.txtEstado.UseSelectable = true;
            this.txtEstado.WaterMarkColor = System.Drawing.Color.FromArgb(((int)(((byte)(109)))), ((int)(((byte)(109)))), ((int)(((byte)(109)))));
            this.txtEstado.WaterMarkFont = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Pixel);
            // 
            // btnActualizar
            // 
            this.btnActualizar.Location = new System.Drawing.Point(284, 126);
            this.btnActualizar.Name = "btnActualizar";
            this.btnActualizar.Size = new System.Drawing.Size(75, 23);
            this.btnActualizar.TabIndex = 5;
            this.btnActualizar.Text = "Actualizar";
            this.btnActualizar.UseSelectable = true;
            this.btnActualizar.Click += new System.EventHandler(this.btnActualizar_Click);
            // 
            // ActualizarSeguimiento
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnActualizar);
            this.Controls.Add(this.txtEstado);
            this.Controls.Add(this.metroLabel2);
            this.Controls.Add(this.txtCodigo);
            this.Controls.Add(this.metroLabel1);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "ActualizarSeguimiento";
            this.Text = "ActualizarSeguimiento";
            ((System.ComponentModel.ISupportInitialize)(this.txtCodigo)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private MetroFramework.Controls.MetroLabel metroLabel1;
        private System.Windows.Forms.NumericUpDown txtCodigo;
        private MetroFramework.Controls.MetroLabel metroLabel2;
        private MetroFramework.Controls.MetroTextBox txtEstado;
        private MetroFramework.Controls.MetroButton btnActualizar;
    }
}