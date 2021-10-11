/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DataAccessObject;
import Modelo.DataViewObject;
import Vistas.Inicio;
import Vistas.RegistroCliente;
import javax.swing.JOptionPane;
import org.apache.commons.lang.NumberUtils;

/**
 *
 * @author Jose Roque
 */
public class ControllerInicio {

    int n_orden;

    Inicio inicio = new Inicio();
    RegistroCliente registroCliente = new RegistroCliente();
    DataViewObject dataViewObject = new DataViewObject();
    DataAccessObject dataAccessObject = new DataAccessObject();

    public ControllerInicio(Inicio i, RegistroCliente rc, DataViewObject dvo, DataAccessObject dao) {
        this.inicio = i;
        this.registroCliente = rc;
        this.dataViewObject = dvo;
        this.dataAccessObject = dao;

    }

    ControllerInicio() {

    }

    public void BuscarTelefono() {
        if (inicio.Inicio_TXT_Telefono.getText().length() < 8 || inicio.Inicio_TXT_Telefono.getText().length() > 8
                || !NumberUtils.isNumber(inicio.Inicio_TXT_Telefono.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor ingresar un número de teléfono");
        } else {
            dataViewObject.setToClientes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
            dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
            dataAccessObject.mostrarClienteNuevo(dataViewObject);
            if (Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()) != dataViewObject.getFromCliente_telefono()) {
                JOptionPane.showMessageDialog(null, "Cliente no Existe");
            } else {
                dataAccessObject.numeroOrden(dataViewObject);
                NuevaOrden();
                MostrarDetalleOrden();
                HabilitarBotones();
            }

        }
    }

    public void QuitarProducto() {
        JOptionPane.showMessageDialog(null, "Accion Pendiente");
    }

    public void ConfirmarOrden() {
        JOptionPane.showMessageDialog(null, "Accion Pendiente");
    }
    
    public void ModificarCliente() {
        JOptionPane.showMessageDialog(null, "Accion Pendiente");
    }

    public void MostrarDetalleOrden() {

        inicio.Inicio_TXT_DetalleOrden.setText("*----- DETALLE DE ENTREGA -----* \n\n"
                + "*Entregar a:* " + dataViewObject.getFromCliente_nombre() + " " + dataViewObject.getFromCliente_apellido() + "\n"
                + "*Teléfono:* " + dataViewObject.getFromCliente_telefono() + "\n"
                + "*Direccion:* " + dataViewObject.getFromCliente_direccion() + "\n"
                + "*Nit:* " + dataViewObject.getFromCliente_nit() + "\n"
                + "*Correo Electronico:* " + dataViewObject.getFromCliente_correo() + "\n"
                + "*Orden Numero:* QR-" + n_orden + "\n"
                + "");
    }

    public void TotalOrden() {
        dataAccessObject.totalOrden(dataViewObject);
        inicio.Inicio_LBL_TotalCompra.setText("Q " + String.valueOf(dataViewObject.getFromOrdenes_TotalOrden()));
    }

    void CancelarOrden() {
        inicio.Inicio_TXT_Telefono.setText("");
        inicio.Inicio_TXT_DetalleOrden.setText("");
        DeshabilitarBotonoes();

    }

    private void NuevaOrden() {
        n_orden = dataViewObject.getFromOrdenes_NumeroOrden();
        n_orden++;
    }
    
        public void RegistroCliente() {
        registroCliente.setVisible(true);
    }

    public void HabilitarBotones() {
        inicio.Inicio_BTN_Hamburguesa.setEnabled(true);
        inicio.Inicio_BTN_Baguette.setEnabled(true);
        inicio.Inicio_BTN_Torito.setEnabled(true);
        inicio.Inicio_BTN_CornDog.setEnabled(true);
        inicio.Inicio_BTN_Nachos.setEnabled(true);
        inicio.Inicio_BTN_Salchipapa.setEnabled(true);
        inicio.Inicio_BTN_Rollitos.setEnabled(true);
        inicio.Inicio_BTN_ConfirmarOrden.setVisible(true);
        inicio.Inicio_BTN_ModificarCliente.setVisible(true);
        inicio.Inicio_TXT_DetalleOrden.setVisible(true);
        inicio.Inicio_TBL_DetalleOrden.setVisible(true);
        inicio.Inicio.setEnabled(true);
    }

    public void DeshabilitarBotonoes() {
        inicio.Inicio_BTN_Hamburguesa.setEnabled(false);
        inicio.Inicio_BTN_Baguette.setEnabled(false);
        inicio.Inicio_BTN_Torito.setEnabled(false);
        inicio.Inicio_BTN_CornDog.setEnabled(false);
        inicio.Inicio_BTN_Nachos.setEnabled(false);
        inicio.Inicio_BTN_Salchipapa.setEnabled(false);
        inicio.Inicio_BTN_Rollitos.setEnabled(false);
        inicio.Inicio_BTN_ConfirmarOrden.setVisible(false);
        inicio.Inicio_BTN_QuitarProducto.setVisible(false);
        inicio.Inicio_BTN_ModificarCliente.setVisible(false);
        inicio.Inicio_TXT_DetalleOrden.setVisible(false);
        inicio.Inicio_TBL_DetalleOrden.setVisible(false);
        inicio.Inicio.setEnabled(false);
    }

    

}
