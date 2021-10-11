/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DataViewObject;
import Vistas.Inicio;
import Vistas.RegistroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose Roque
 */
public class Controles implements ActionListener {

    Inicio inicio = new Inicio();
    RegistroCliente registroCliente = new RegistroCliente();
    DataViewObject dataViewObject = new DataViewObject();
    ControllerInicio controllerInicio = new ControllerInicio();
    ControllerRegistroCliente controllerRegistroCliente = new ControllerRegistroCliente();
    ControllerProducto controllerProducto = new ControllerProducto();

    public Controles(Inicio i, RegistroCliente rc, DataViewObject dvo, ControllerInicio ci,
            ControllerRegistroCliente crc, ControllerProducto cp) {
        this.inicio = i;
        this.registroCliente = rc;

        this.dataViewObject = dvo;
        this.controllerInicio = ci;
        this.controllerRegistroCliente = crc;
        this.controllerProducto = cp;

        //Inicio
        this.inicio.Inicio_BTN_RegistroCliente.addActionListener(this);
        this.inicio.Inicio_BTN_Buscar.addActionListener(this);
        this.inicio.Inicio_BTN_QuitarProducto.addActionListener(this);
        this.inicio.Inicio_BTN_ConfirmarOrden.addActionListener(this);
        this.inicio.Inicio_BTN_Cancelar.addActionListener(this);
        this.inicio.Inicio_BTN_ModificarCliente.addActionListener(this);

        //Agregar Cliente
        this.registroCliente.Registro_BTN_Cancelar.addActionListener(this);
        this.registroCliente.Registro_BTN_CrearNuevo.addActionListener(this);

        //Productos
        this.inicio.Inicio_BTN_Hamburguesa.addActionListener(this);
        this.inicio.Inicio_BTN_Baguette.addActionListener(this);
        this.inicio.Inicio_BTN_Torito.addActionListener(this);
        this.inicio.Inicio_BTN_CornDog.addActionListener(this);
        this.inicio.Inicio_BTN_Nachos.addActionListener(this);
        this.inicio.Inicio_BTN_Salchipapa.addActionListener(this);
        this.inicio.Inicio_BTN_Rollitos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Inicio
        if (e.getSource() == inicio.Inicio_BTN_RegistroCliente) {
            controllerInicio.RegistroCliente();
        }
        if (e.getSource() == inicio.Inicio_BTN_Buscar) {
            controllerInicio.BuscarTelefono();
        }
        if (e.getSource() == inicio.Inicio_BTN_QuitarProducto) {
            controllerInicio.QuitarProducto();
        }
        if (e.getSource() == inicio.Inicio_BTN_ConfirmarOrden) {
            controllerInicio.ConfirmarOrden();
        }
        if (e.getSource() == inicio.Inicio_BTN_Cancelar) {
            controllerInicio.CancelarOrden();
        }

        if (e.getSource() == inicio.Inicio_BTN_ModificarCliente) {
            controllerInicio.ModificarCliente();
        }

        //Registro Clientes 
        if (e.getSource() == registroCliente.Registro_BTN_Cancelar) {
            controllerRegistroCliente.CloseREgistroCliente();
        }
        if (e.getSource() == registroCliente.Registro_BTN_CrearNuevo) {
            controllerRegistroCliente.CrearClienteNuevo();
        }

        //Producto
        if (e.getSource() == inicio.Inicio_BTN_Hamburguesa) {
            controllerProducto.Hamburguesa();
        }
        if (e.getSource() == inicio.Inicio_BTN_Baguette) {
            controllerProducto.Baguette();
        }
        if (e.getSource() == inicio.Inicio_BTN_Torito) {
            controllerProducto.Torito();
        }
        if (e.getSource() == inicio.Inicio_BTN_CornDog) {
            controllerProducto.CornDog();
        }
        if (e.getSource() == inicio.Inicio_BTN_Nachos) {
            controllerProducto.Nacho();
        }
        if (e.getSource() == inicio.Inicio_BTN_Salchipapa) {
            controllerProducto.Salchipapa();
        }
        if (e.getSource() == inicio.Inicio_BTN_Rollitos) {
            controllerProducto.Rollito();
        }

    }

}
