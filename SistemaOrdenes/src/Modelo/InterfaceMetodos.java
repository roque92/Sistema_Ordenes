/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jose Roque
 */
public interface InterfaceMetodos {

//----------Registro Cliente
    //-----Insertar
    public void crearClienteNuevo(DataViewObject dvo);

    //-----Modificar
    public void modificarClienteNuevo(DataViewObject dvo);

    //-----Eliminar
    public void eliminarClienteNuevo(DataViewObject dvo);

    //----Mostrar
    public ArrayList<DataViewObject> mostrarClienteNuevo(DataViewObject dvo);

//----------Registro Orden
    //-----Insertar
    public void crearOrden(DataViewObject dvo);

    //-----Modificar
    public void modificarOrden(DataViewObject dvo);

    //-----Eliminar
    public void eliminarProducto(DataViewObject dvo);

    //-----Mostrar
    public ArrayList<DataViewObject> mostrarOrden(DataViewObject dvo);

    //----------Numero Orden
    public ArrayList<DataViewObject> numeroOrden(DataViewObject dvo);

    //----------Obtener Total Orden
    public ArrayList<DataViewObject> totalOrden(DataViewObject dvo);

}
