/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Roque
 */
public class Conector {
    
    private final String inicioCadena = "jdbc:mysql://";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String server = "127.0.0.1";
    private final String user = "root";
    private final String pass = "";
    private final String baseDatos = "db_querico";
    private String cadena,error;
    
    Connection con;
    Statement st;
    
   //--------------------Inicio de la coneccion
    public void connection(){
        this.cadena= this.inicioCadena + this.server + "/" + this.baseDatos;
        
        try {
            Class.forName(this.driver).newInstance();
            this.con = (Connection) DriverManager.getConnection(this.cadena,this.user,this.pass);
            //JOptionPane.showMessageDialog(null, "Conectado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //--------------------Metodo para Obtener los datos de la Base de Datos
    public ResultSet obtener_datos (String consultaSQL){
       try {
           this.connection();
           this.st = (Statement) this.con.createStatement();
           ResultSet respuesta = null;
           respuesta = st.executeQuery(consultaSQL);
           return respuesta;
       } catch (SQLException e) {
           error = e.getMessage();
       }
       return null;
   }
    
    //--------------------Metodos para consultas a la Base de Datos ( Insertar Borrar Modificar)
    public int consulta_general (String consultaSQL){
       int resultado = 0;
       
       try {
           this.connection();
           this.st = (Statement) this.con.createStatement();
           resultado = this.st.executeUpdate(consultaSQL);
       } catch (SQLException e) {
           error = e.getMessage();
           return 0;
       }
       
       return resultado;
   }
    
    //--------------------Desconectar de la Base de Datos
    public void desconectar(){
       try {
           con.close();
       } catch (SQLException e) {
           error = e.getMessage();
       }
   }
    
    //--------------------------------

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
}
