/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que.rico.hamburguesas;

import Controlador.Controles;
import Controlador.ControllerInicio;
import Controlador.ControllerProducto;
import Controlador.ControllerQuitarProducto;
import Controlador.ControllerRegistroCliente;
import Modelo.DataAccessObject;
import Modelo.DataViewObject;
import Vistas.Inicio;
import Vistas.QuitarProducto;
import Vistas.RegistroCliente;

/**
 *
 * @author Jose Roque
 */
public class QueRicoHamburguesas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Inicio inicio = new Inicio();
        RegistroCliente registroClientes = new RegistroCliente();
        QuitarProducto quitarProducto = new QuitarProducto();
        DataViewObject dataViewObject = new DataViewObject();
        DataAccessObject dataAccessObject = new DataAccessObject();
        
        
        ControllerInicio controllerInicio = new ControllerInicio(inicio, registroClientes, quitarProducto, dataViewObject, dataAccessObject);
        ControllerRegistroCliente controllerRegistroCliente = new ControllerRegistroCliente(registroClientes, dataViewObject, dataAccessObject, inicio, controllerInicio);
        ControllerQuitarProducto controllerQuitarProducto = new ControllerQuitarProducto(quitarProducto);
        ControllerProducto controllerProducto = new ControllerProducto(dataViewObject, dataAccessObject, inicio, controllerInicio);
        Controles controles = new Controles(inicio, registroClientes, quitarProducto, dataViewObject, controllerInicio, controllerRegistroCliente, controllerQuitarProducto, controllerProducto);

        
        
        
        inicio.setVisible(true);
        controllerInicio.DeshabilitarBotonoes();
        
    }
    
}
