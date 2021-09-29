package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    
    private List<Cliente> datos = new ArrayList<>(); 
    
    public boolean agregarCliente(Cliente cliente){
        datos.add(cliente); 
        return true; 
    }
    
    
    public List<Cliente> obtenerClientes(){
        return datos; 
    }
    
    
}
