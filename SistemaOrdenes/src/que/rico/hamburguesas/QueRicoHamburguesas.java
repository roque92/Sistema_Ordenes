/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que.rico.hamburguesas;

import Controlador.Controles;
import Controlador.ControllerInicio;
import Controlador.ControllerProducto;
import Controlador.ControllerRegistroCliente;
import Modelo.DataAccessObject;
import Modelo.DataViewObject;
import Vistas.Inicio;
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
        DataViewObject dataViewObject = new DataViewObject();
        DataAccessObject dataAccessObject = new DataAccessObject();
        
        ControllerInicio controllerInicio = new ControllerInicio(inicio, registroClientes, dataViewObject, dataAccessObject);
        ControllerProducto controllerProducto = new ControllerProducto(dataViewObject, dataAccessObject, inicio, controllerInicio);
        ControllerRegistroCliente controllerRegistroCliente = new ControllerRegistroCliente(registroClientes, dataViewObject, dataAccessObject, inicio, controllerInicio);
        
        Controles controles = new Controles(inicio, registroClientes, dataViewObject, controllerInicio, controllerRegistroCliente, controllerProducto);

        
        
        
        inicio.setVisible(true);
        controllerInicio.DeshabilitarBotonoes();
        
    }
    
}
