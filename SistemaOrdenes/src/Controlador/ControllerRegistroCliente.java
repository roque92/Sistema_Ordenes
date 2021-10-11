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
public class ControllerRegistroCliente {

    RegistroCliente registroCliente = new RegistroCliente();
    DataViewObject dataViewObject = new DataViewObject();
    DataAccessObject dataAccessObject = new DataAccessObject();
    Inicio inicio = new Inicio();
    ControllerInicio controllerInicio = new ControllerInicio();

    public ControllerRegistroCliente(RegistroCliente rc, DataViewObject dvo, DataAccessObject dao, Inicio inicio, ControllerInicio controllerInicio) {
        this.registroCliente = rc;
        this.dataViewObject = dvo;
        this.dataAccessObject = dao;
        this.inicio = inicio;
        this.controllerInicio = controllerInicio;
    }

    public ControllerRegistroCliente() {
    }

    //---------- Registro Cliente
    public void CloseREgistroCliente() {
        registroCliente.dispose();
    }

    public void CrearClienteNuevo() {

        if (registroCliente.Registro_TXT_Telefono.getText().length() < 8 || registroCliente.Registro_TXT_Telefono.getText().length() > 8
                || !NumberUtils.isNumber(registroCliente.Registro_TXT_Telefono.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor ingresar un numero telefonico valido");

        } else if (registroCliente.Registro_TXT_Nombre.getText().isEmpty() || registroCliente.Registro_TXT_Apellido.getText().isEmpty() || registroCliente.Registro_TXT_Telefono.getText().isEmpty()
                || registroCliente.Registro_TXR_Nit.getText().isEmpty() || registroCliente.Registro_TXT_Direccion.getText().isEmpty() || registroCliente.Registro_TXT_Correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor de llenar todos los datos solicitados");

        } else {

            dataViewObject.setToClientes_nombre(registroCliente.Registro_TXT_Nombre.getText());
            dataViewObject.setToClientes_apellido(registroCliente.Registro_TXT_Apellido.getText());
            dataViewObject.setToClientes_telefono(Integer.parseInt(registroCliente.Registro_TXT_Telefono.getText()));
            dataViewObject.setToClientes__nit(registroCliente.Registro_TXR_Nit.getText());
            dataViewObject.setToClientes_direccion(registroCliente.Registro_TXT_Direccion.getText());
            dataViewObject.setToClientes_correo(registroCliente.Registro_TXT_Correo.getText());
            
            dataAccessObject.crearClienteNuevo(dataViewObject);

            JOptionPane.showMessageDialog(null, "Cliente Creado exitosamente");
            inicio.Inicio_TXT_Telefono.setText(registroCliente.Registro_TXT_Telefono.getText());
            Limpiar();
            CloseREgistroCliente();
            controllerInicio.BuscarTelefono();
        }

    }

    void Limpiar() {
        registroCliente.Registro_TXT_Nombre.setText("");
        registroCliente.Registro_TXT_Apellido.setText("");
        registroCliente.Registro_TXT_Telefono.setText("");
        registroCliente.Registro_TXR_Nit.setText("");
        registroCliente.Registro_TXT_Direccion.setText("");
        registroCliente.Registro_TXT_Correo.setText("");
    }

}
