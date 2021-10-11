/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.QuitarProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Roque
 */
public class ControllerQuitarProducto{

    QuitarProducto quitarProducto = new QuitarProducto();

    public ControllerQuitarProducto(QuitarProducto qp) {
        this.quitarProducto = qp;
       
    }

    public ControllerQuitarProducto() {
    }
    

    
    
    
    
    public void CerrarQuitarProducto() {
        quitarProducto.dispose();
    }

    public void BuscarQuitarProducto() {
        JOptionPane.showMessageDialog(null, "Accion pendiene de crear");
    }

    public void EliminarProcto() {
        JOptionPane.showMessageDialog(null, "Accion pendiene de crear");
    }


}
