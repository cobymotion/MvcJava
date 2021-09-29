package controlador;

import java.util.List;
import modelo.BaseDatos;
import modelo.Cliente;
import vista.Interfaz;

public class Coordinador {
    
    public static void main(String[] args) {
        
        Interfaz vista = new Interfaz(); 
        BaseDatos bd = new BaseDatos(); 
        int opc = 0; 
        do{            
            opc = vista.menu(); 
            switch(opc)
            {
                case 1: 
                    Cliente cliente = vista.lecturaCliente();
                    bd.agregarCliente(cliente);
                    vista.msg("Se grabo correctamente");
                    break; 
                case 2:
                    List<Cliente> datos = bd.obtenerClientes(); 
                    vista.mostrarClientes(datos);
                    break; 
                case 3:
                    vista.msg("Salir de la aplicación ");
                    break;
                default:
                    vista.msg("Opción incorrecta");
            }
                        
        }while(opc!=3);
        
        
    }
    
    
}
