﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace APP_CS_OKCASA_G7.WSBANCOESTADO {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://ws/", ConfigurationName="WSBANCOESTADO.WSOperaciones")]
    public interface WSOperaciones {
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/helloRequest", ReplyAction="http://ws/WSOperaciones/helloResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse hello(APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/helloRequest", ReplyAction="http://ws/WSOperaciones/helloResponse")]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse> helloAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/ListarRequest", ReplyAction="http://ws/WSOperaciones/ListarResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse Listar(APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/ListarRequest", ReplyAction="http://ws/WSOperaciones/ListarResponse")]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse> ListarAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/ProcesarPagoRequest", ReplyAction="http://ws/WSOperaciones/ProcesarPagoResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse ProcesarPago(APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://ws/WSOperaciones/ProcesarPagoRequest", ReplyAction="http://ws/WSOperaciones/ProcesarPagoResponse")]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse> ProcesarPagoAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="hello", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class helloRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string name;
        
        public helloRequest() {
        }
        
        public helloRequest(string name) {
            this.name = name;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="helloResponse", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class helloResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string @return;
        
        public helloResponse() {
        }
        
        public helloResponse(string @return) {
            this.@return = @return;
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.8.4161.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://ws/")]
    public partial class cliente : object, System.ComponentModel.INotifyPropertyChanged {
        
        private int creditoField;
        
        private int id_clienteField;
        
        private string nombreField;
        
        private string rutField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public int credito {
            get {
                return this.creditoField;
            }
            set {
                this.creditoField = value;
                this.RaisePropertyChanged("credito");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public int id_cliente {
            get {
                return this.id_clienteField;
            }
            set {
                this.id_clienteField = value;
                this.RaisePropertyChanged("id_cliente");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string nombre {
            get {
                return this.nombreField;
            }
            set {
                this.nombreField = value;
                this.RaisePropertyChanged("nombre");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=3)]
        public string rut {
            get {
                return this.rutField;
            }
            set {
                this.rutField = value;
                this.RaisePropertyChanged("rut");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="Listar", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class ListarRequest {
        
        public ListarRequest() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="ListarResponse", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class ListarResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public APP_CS_OKCASA_G7.WSBANCOESTADO.cliente[] @return;
        
        public ListarResponse() {
        }
        
        public ListarResponse(APP_CS_OKCASA_G7.WSBANCOESTADO.cliente[] @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="ProcesarPago", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class ProcesarPagoRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int total;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=1)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int pago;
        
        public ProcesarPagoRequest() {
        }
        
        public ProcesarPagoRequest(int total, int pago) {
            this.total = total;
            this.pago = pago;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="ProcesarPagoResponse", WrapperNamespace="http://ws/", IsWrapped=true)]
    public partial class ProcesarPagoResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://ws/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int @return;
        
        public ProcesarPagoResponse() {
        }
        
        public ProcesarPagoResponse(int @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface WSOperacionesChannel : APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class WSOperacionesClient : System.ServiceModel.ClientBase<APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones>, APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones {
        
        public WSOperacionesClient() {
        }
        
        public WSOperacionesClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public WSOperacionesClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public WSOperacionesClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public WSOperacionesClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }

        public WSOperacionesClient(cliente[] cliente)
        {
        }

        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.hello(APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest request) {
            return base.Channel.hello(request);
        }
        
        public string hello(string name) {
            APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest();
            inValue.name = name;
            APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse retVal = ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).hello(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse> APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.helloAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest request) {
            return base.Channel.helloAsync(request);
        }
        
        public System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.helloResponse> helloAsync(string name) {
            APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.helloRequest();
            inValue.name = name;
            return ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).helloAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.Listar(APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest request) {
            return base.Channel.Listar(request);
        }
        
        public APP_CS_OKCASA_G7.WSBANCOESTADO.cliente[] Listar() {
            APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest();
            APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse retVal = ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).Listar(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse> APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.ListarAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest request) {
            return base.Channel.ListarAsync(request);
        }
        
        public System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ListarResponse> ListarAsync() {
            APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.ListarRequest();
            return ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).ListarAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.ProcesarPago(APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest request) {
            return base.Channel.ProcesarPago(request);
        }
        
        public int ProcesarPago(int total, int pago) {
            APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest();
            inValue.total = total;
            inValue.pago = pago;
            APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse retVal = ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).ProcesarPago(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse> APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones.ProcesarPagoAsync(APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest request) {
            return base.Channel.ProcesarPagoAsync(request);
        }
        
        public System.Threading.Tasks.Task<APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoResponse> ProcesarPagoAsync(int total, int pago) {
            APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest inValue = new APP_CS_OKCASA_G7.WSBANCOESTADO.ProcesarPagoRequest();
            inValue.total = total;
            inValue.pago = pago;
            return ((APP_CS_OKCASA_G7.WSBANCOESTADO.WSOperaciones)(this)).ProcesarPagoAsync(inValue);
        }
    }
}
