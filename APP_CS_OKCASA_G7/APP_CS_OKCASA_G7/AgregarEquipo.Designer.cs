namespace APP_CS_OKCASA_G7
{
    partial class AgregarEquipo
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
            this.txtNombreequipo = new MetroFramework.Controls.MetroTextBox();
            this.btnAgregar = new MetroFramework.Controls.MetroButton();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("HP Simplified Hans", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(147, 22);
            this.label1.TabIndex = 0;
            this.label1.Text = "Agregar equipo";
            // 
            // metroLabel1
            // 
            this.metroLabel1.AutoSize = true;
            this.metroLabel1.Location = new System.Drawing.Point(154, 68);
            this.metroLabel1.Name = "metroLabel1";
            this.metroLabel1.Size = new System.Drawing.Size(129, 19);
            this.metroLabel1.TabIndex = 1;
            this.metroLabel1.Text = "Nombre del equipo:";
            this.metroLabel1.Click += new System.EventHandler(this.metroLabel1_Click);
            // 
            // txtNombreequipo
            // 
            // 
            // 
            // 
            this.txtNombreequipo.CustomButton.Image = null;
            this.txtNombreequipo.CustomButton.Location = new System.Drawing.Point(191, 1);
            this.txtNombreequipo.CustomButton.Name = "";
            this.txtNombreequipo.CustomButton.Size = new System.Drawing.Size(21, 21);
            this.txtNombreequipo.CustomButton.Style = MetroFramework.MetroColorStyle.Blue;
            this.txtNombreequipo.CustomButton.TabIndex = 1;
            this.txtNombreequipo.CustomButton.Theme = MetroFramework.MetroThemeStyle.Light;
            this.txtNombreequipo.CustomButton.UseSelectable = true;
            this.txtNombreequipo.CustomButton.Visible = false;
            this.txtNombreequipo.Lines = new string[0];
            this.txtNombreequipo.Location = new System.Drawing.Point(286, 68);
            this.txtNombreequipo.MaxLength = 32767;
            this.txtNombreequipo.Name = "txtNombreequipo";
            this.txtNombreequipo.PasswordChar = '\0';
            this.txtNombreequipo.ScrollBars = System.Windows.Forms.ScrollBars.None;
            this.txtNombreequipo.SelectedText = "";
            this.txtNombreequipo.SelectionLength = 0;
            this.txtNombreequipo.SelectionStart = 0;
            this.txtNombreequipo.ShortcutsEnabled = true;
            this.txtNombreequipo.Size = new System.Drawing.Size(213, 23);
            this.txtNombreequipo.TabIndex = 2;
            this.txtNombreequipo.UseSelectable = true;
            this.txtNombreequipo.WaterMarkColor = System.Drawing.Color.FromArgb(((int)(((byte)(109)))), ((int)(((byte)(109)))), ((int)(((byte)(109)))));
            this.txtNombreequipo.WaterMarkFont = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Pixel);
            // 
            // btnAgregar
            // 
            this.btnAgregar.Location = new System.Drawing.Point(355, 122);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(75, 23);
            this.btnAgregar.TabIndex = 3;
            this.btnAgregar.Text = "Agregar";
            this.btnAgregar.UseSelectable = true;
            this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
            // 
            // AgregarEquipo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnAgregar);
            this.Controls.Add(this.txtNombreequipo);
            this.Controls.Add(this.metroLabel1);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "AgregarEquipo";
            this.Text = "AgregarEquipo";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private MetroFramework.Controls.MetroLabel metroLabel1;
        private MetroFramework.Controls.MetroTextBox txtNombreequipo;
        private MetroFramework.Controls.MetroButton btnAgregar;
    }
}