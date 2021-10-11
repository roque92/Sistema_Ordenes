/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DataAccessObject;
import Modelo.DataViewObject;
import Vistas.Inicio;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jose Roque
 */
public class ControllerProducto {

    String fecha;
    int year;
    int month;
    int day;

    DataViewObject dataViewObject = new DataViewObject();
    DataAccessObject dataAccessObject = new DataAccessObject();
    Inicio inicio = new Inicio();
    ControllerInicio controllerInicio = new ControllerInicio();
    GregorianCalendar gCalendar = new GregorianCalendar();

    public ControllerProducto(DataViewObject dvo, DataAccessObject dao, Inicio inicio, ControllerInicio controllerInicio) {
        this.dataViewObject = dvo;
        this.dataAccessObject = dao;
        this.inicio = inicio;
        this.controllerInicio = controllerInicio;
    }

    public ControllerProducto() {
    }

    void Hamburguesa() {

        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Hamburguesa Rellena");
        dataViewObject.setToOrdenes_precio(40.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void Baguette() {

        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Baguette Carne Queso");
        dataViewObject.setToOrdenes_precio(40.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void Torito() {

        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Torito Clasico");
        dataViewObject.setToOrdenes_precio(35.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void CornDog() {

        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Menu CornDog");
        dataViewObject.setToOrdenes_precio(35.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void Nacho() {

        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Nachos Fiesteros");
        dataViewObject.setToOrdenes_precio(30.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void Salchipapa() {
        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Salchipapa");
        dataViewObject.setToOrdenes_precio(25.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

    void Rollito() {
        year = gCalendar.get(Calendar.YEAR);
        month = gCalendar.get(Calendar.MONTH) + 1;
        day = gCalendar.get(Calendar.DATE);

        fecha = year + "-" + month + "-" + day;

        dataViewObject.setToOrdenes_fecha(fecha);
        dataViewObject.setToOrdenes_producto("Rollitos Rellenos");
        dataViewObject.setToOrdenes_precio(25.00);
        dataViewObject.setToOrdenes_telefono(Integer.parseInt(inicio.Inicio_TXT_Telefono.getText()));
        dataViewObject.setToOrdenes_NumeroOrden(dataViewObject.getFromOrdenes_NumeroOrden() + 1);
        
        dataAccessObject.crearOrden(dataViewObject);
        controllerInicio.TotalOrden();

    }

}
