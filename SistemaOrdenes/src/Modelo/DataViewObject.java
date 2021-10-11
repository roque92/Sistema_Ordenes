/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose Roque
 */
public class DataViewObject {

    //Datos que vany vienen de la base de datos y se almancenan aqui para 
    //--------------------Datos que viene a la base de datos. 
    
    //-----From clientes
    private String fromCliente_nombre, fromCliente_apellido, fromCliente_direccion, fromCliente_correo, fromCliente_nit;
    private int fromCliente_telefono;

    //----From Ordenes
    private String fromOrdenes_fecha, fromOrdenes_producto;
    private double fromOrdenes_precio, fromOrdenes_TotalOrden;
    private int fromOrdenes_telefono, fromOrdenes_NumeroOrden ;
    
    
    //--------------------Datos que van hacia la base de datos.

    //-----To Cleintes
    private String toClientes_nombre, toClientes_apellido, toClientes_direccion, toClientes_correo, toClientes__nit;
    private int toClientes_telefono;
    
    //----- To Ordenes
    private String toOrdenes_fecha, toOrdenes_producto;
    private double toOrdenes_precio;
    private int toOrdenes_telefono, toOrdenes_NumeroOrden;

    
    // Setter and Getter
    public String getFromCliente_nombre() {
        return fromCliente_nombre;
    }

    public void setFromCliente_nombre(String fromCliente_nombre) {
        this.fromCliente_nombre = fromCliente_nombre;
    }

    public String getFromCliente_apellido() {
        return fromCliente_apellido;
    }

    public void setFromCliente_apellido(String fromCliente_apellido) {
        this.fromCliente_apellido = fromCliente_apellido;
    }

    public String getFromCliente_direccion() {
        return fromCliente_direccion;
    }

    public void setFromCliente_direccion(String fromCliente_direccion) {
        this.fromCliente_direccion = fromCliente_direccion;
    }

    public String getFromCliente_correo() {
        return fromCliente_correo;
    }

    public void setFromCliente_correo(String fromCliente_correo) {
        this.fromCliente_correo = fromCliente_correo;
    }

    public String getFromCliente_nit() {
        return fromCliente_nit;
    }

    public void setFromCliente_nit(String fromCliente_nit) {
        this.fromCliente_nit = fromCliente_nit;
    }

    public int getFromCliente_telefono() {
        return fromCliente_telefono;
    }

    public void setFromCliente_telefono(int fromCliente_telefono) {
        this.fromCliente_telefono = fromCliente_telefono;
    }

    public String getFromOrdenes_fecha() {
        return fromOrdenes_fecha;
    }

    public void setFromOrdenes_fecha(String fromOrdenes_fecha) {
        this.fromOrdenes_fecha = fromOrdenes_fecha;
    }

    public String getFromOrdenes_producto() {
        return fromOrdenes_producto;
    }

    public void setFromOrdenes_producto(String fromOrdenes_producto) {
        this.fromOrdenes_producto = fromOrdenes_producto;
    }

    public double getFromOrdenes_precio() {
        return fromOrdenes_precio;
    }

    public void setFromOrdenes_precio(double fromOrdenes_precio) {
        this.fromOrdenes_precio = fromOrdenes_precio;
    }

    public int getFromOrdenes_telefono() {
        return fromOrdenes_telefono;
    }

    public void setFromOrdenes_telefono(int fromOrdenes_telefono) {
        this.fromOrdenes_telefono = fromOrdenes_telefono;
    }

    public String getToClientes_nombre() {
        return toClientes_nombre;
    }

    public void setToClientes_nombre(String toClientes_nombre) {
        this.toClientes_nombre = toClientes_nombre;
    }

    public String getToClientes_apellido() {
        return toClientes_apellido;
    }

    public void setToClientes_apellido(String toClientes_apellido) {
        this.toClientes_apellido = toClientes_apellido;
    }

    public String getToClientes_direccion() {
        return toClientes_direccion;
    }

    public void setToClientes_direccion(String toClientes_direccion) {
        this.toClientes_direccion = toClientes_direccion;
    }

    public String getToClientes_correo() {
        return toClientes_correo;
    }

    public void setToClientes_correo(String toClientes_correo) {
        this.toClientes_correo = toClientes_correo;
    }

    public String getToClientes__nit() {
        return toClientes__nit;
    }

    public void setToClientes__nit(String toClientes__nit) {
        this.toClientes__nit = toClientes__nit;
    }

    public int getToClientes_telefono() {
        return toClientes_telefono;
    }

    public void setToClientes_telefono(int toClientes_telefono) {
        this.toClientes_telefono = toClientes_telefono;
    }

    public String getToOrdenes_fecha() {
        return toOrdenes_fecha;
    }

    public void setToOrdenes_fecha(String toOrdenes_fecha) {
        this.toOrdenes_fecha = toOrdenes_fecha;
    }

    public String getToOrdenes_producto() {
        return toOrdenes_producto;
    }

    public void setToOrdenes_producto(String toOrdenes_producto) {
        this.toOrdenes_producto = toOrdenes_producto;
    }

    public double getToOrdenes_precio() {
        return toOrdenes_precio;
    }

    public void setToOrdenes_precio(double toOrdenes_precio) {
        this.toOrdenes_precio = toOrdenes_precio;
    }

    public int getToOrdenes_telefono() {
        return toOrdenes_telefono;
    }

    public void setToOrdenes_telefono(int toOrdenes_telefono) {
        this.toOrdenes_telefono = toOrdenes_telefono;
    }

    public int getFromOrdenes_NumeroOrden() {
        return fromOrdenes_NumeroOrden;
    }

    public void setFromOrdenes_NumeroOrden(int fromOrdenes_NumeroOrden) {
        this.fromOrdenes_NumeroOrden = fromOrdenes_NumeroOrden;
    }

    public int getToOrdenes_NumeroOrden() {
        return toOrdenes_NumeroOrden;
    }

    public void setToOrdenes_NumeroOrden(int toOrdenes_NumeroOrden) {
        this.toOrdenes_NumeroOrden = toOrdenes_NumeroOrden;
    }

    public double getFromOrdenes_TotalOrden() {
        return fromOrdenes_TotalOrden;
    }

    public void setFromOrdenes_TotalOrden(double fromOrdenes_TotalOrden) {
        this.fromOrdenes_TotalOrden = fromOrdenes_TotalOrden;
    }

    public DataViewObject(String fromCliente_nombre, String fromCliente_apellido, String fromCliente_direccion, String fromCliente_correo, String fromCliente_nit, int fromCliente_telefono, String fromOrdenes_fecha, String fromOrdenes_producto, double fromOrdenes_precio, double fromOrdenes_TotalOrden, int fromOrdenes_telefono, int fromOrdenes_NumeroOrden, String toClientes_nombre, String toClientes_apellido, String toClientes_direccion, String toClientes_correo, String toClientes__nit, int toClientes_telefono, String toOrdenes_fecha, String toOrdenes_producto, double toOrdenes_precio, int toOrdenes_telefono, int toOrdenes_NumeroOrden) {
        this.fromCliente_nombre = fromCliente_nombre;
        this.fromCliente_apellido = fromCliente_apellido;
        this.fromCliente_direccion = fromCliente_direccion;
        this.fromCliente_correo = fromCliente_correo;
        this.fromCliente_nit = fromCliente_nit;
        this.fromCliente_telefono = fromCliente_telefono;
        this.fromOrdenes_fecha = fromOrdenes_fecha;
        this.fromOrdenes_producto = fromOrdenes_producto;
        this.fromOrdenes_precio = fromOrdenes_precio;
        this.fromOrdenes_TotalOrden = fromOrdenes_TotalOrden;
        this.fromOrdenes_telefono = fromOrdenes_telefono;
        this.fromOrdenes_NumeroOrden = fromOrdenes_NumeroOrden;
        this.toClientes_nombre = toClientes_nombre;
        this.toClientes_apellido = toClientes_apellido;
        this.toClientes_direccion = toClientes_direccion;
        this.toClientes_correo = toClientes_correo;
        this.toClientes__nit = toClientes__nit;
        this.toClientes_telefono = toClientes_telefono;
        this.toOrdenes_fecha = toOrdenes_fecha;
        this.toOrdenes_producto = toOrdenes_producto;
        this.toOrdenes_precio = toOrdenes_precio;
        this.toOrdenes_telefono = toOrdenes_telefono;
        this.toOrdenes_NumeroOrden = toOrdenes_NumeroOrden;
    }
    
    

    
    

    public DataViewObject() {
    }
    
    
}
