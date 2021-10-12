/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose Roque
 */
public class DataAccessObject implements InterfaceMetodos {

    //CRUD SQL
//-----Clientes
    @Override
    public void crearClienteNuevo(DataViewObject dvo) {
        Conector c = new Conector();

        try {
            c.connection();
            c.consulta_general("INSERT IGNORE INTO tbl_cliente (nombre, apellido, telefono, nit, direccion, correo)\n"
                    + "VALUES ('" + dvo.getToClientes_nombre() + "', '" + dvo.getToClientes_apellido() + "', " + dvo.getToClientes_telefono() + ", '" + dvo.getToClientes__nit() + "', '" + dvo.getToClientes_direccion() + "', '" + dvo.getToClientes_correo() + "');");
            c.desconectar();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void modificarClienteNuevo(DataViewObject dvo) {

    }

    @Override
    public void eliminarClienteNuevo(DataViewObject dvo) {

    }

    @Override
    public ArrayList<DataViewObject> mostrarClienteNuevo(DataViewObject dvo) {
        Conector c = new Conector();
        ArrayList<DataViewObject> datos = new ArrayList();

        try {
            c.connection();
            ResultSet rs = c.obtener_datos("SELECT nombre, apellido, telefono, direccion, nit, correo FROM tbl_cliente WHERE telefono = " + dvo.getToClientes_telefono() + ";");
            if (rs.next()) {

                do {
                    dvo.setFromCliente_nombre(rs.getString(1));
                    dvo.setFromCliente_apellido(rs.getString(2));
                    dvo.setFromCliente_telefono(rs.getInt(3));
                    dvo.setFromCliente_direccion(rs.getString(4));
                    dvo.setFromCliente_nit(rs.getString(5));
                    dvo.setFromCliente_correo(rs.getString(6));

                    datos.add(dvo);

                } while (rs.next());
            } else {
                System.out.println("Cliente no existe.");
            }

            c.desconectar();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return datos;

    }

//-----Ordenes
    @Override
    public void crearOrden(DataViewObject dvo) {
        Conector c = new Conector();
        try {
            c.connection();
            c.consulta_general("INSERT INTO tbl_ordenes (fecha, producto, precio, telefono, n_orden)\n"
                    + "VALUES ('" + dvo.getToOrdenes_fecha() + "', '" + dvo.getToOrdenes_producto() + "', " + dvo.getToOrdenes_precio() + ", " + dvo.getToOrdenes_telefono() + ", " + dvo.getToOrdenes_NumeroOrden() + ");");
            c.desconectar();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void modificarOrden(DataViewObject dvo) {

    }

    @Override
    public void eliminarProducto(DataViewObject dvo) {
        Conector c = new Conector();
        try {
            c.connection();
            c.consulta_general("DELETE FROM tbl_ordenes WHERE id = " +dvo.getToOrdenes_IdOrden() + ";");
            c.desconectar();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<DataViewObject> mostrarOrden(DataViewObject dvo) {

        Conector c = new Conector();
        ArrayList<DataViewObject> datos = new ArrayList();

        try {

            c.connection();
            ResultSet rs = c.obtener_datos("SELECT id, producto, precio from tbl_ordenes where n_orden = " + dvo.getToOrdenes_NumeroOrden() + ";");

            while (rs.next()) {

                DataViewObject dvo1 = new DataViewObject();
                dvo1.setFromOrdenes_IdOrden(rs.getInt(1));
                dvo1.setFromOrdenes_producto(rs.getString(2));
                dvo1.setFromOrdenes_precio(rs.getDouble(3));
                
                datos.add(dvo1);

            }

            c.desconectar();

        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }

        return datos;

    }

    @Override
    public ArrayList<DataViewObject> numeroOrden(DataViewObject dvo) {
        Conector c = new Conector();
        ArrayList<DataViewObject> datos = new ArrayList();

        try {
            c.connection();
            ResultSet rs = c.obtener_datos("SELECT n_orden from tbl_ordenes order by n_orden DESC limit 1");

            if (rs.next()) {

                do {

                    dvo.setFromOrdenes_NumeroOrden(rs.getInt(1));

                    datos.add(dvo);

                } while (rs.next());

            } else {

                System.out.println("No hay Ordenes Creadas");
            }

            c.desconectar();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return datos;
    }

    @Override
    public ArrayList<DataViewObject> totalOrden(DataViewObject dvo) {
        Conector c = new Conector();
        ArrayList<DataViewObject> datos = new ArrayList();

        try {
            c.connection();
            ResultSet rs = c.obtener_datos("SELECT SUM(precio) AS Total from tbl_ordenes WHERE n_orden = " + +dvo.getToOrdenes_NumeroOrden());

            if (rs.next()) {

                do {

                    dvo.setFromOrdenes_TotalOrden(rs.getDouble(1));

                    datos.add(dvo);

                } while (rs.next());

            } else {

                System.out.println("No Hay Total");
            }

            c.desconectar();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return datos;
    }

}
