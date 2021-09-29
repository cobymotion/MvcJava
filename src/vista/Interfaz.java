package vista;

import java.util.List;
import java.util.Scanner;
import modelo.Cliente;

public class Interfaz {
    
    
    public int menu() {
        int opc = 0; 
        System.out.println("MENU Opciones");
        System.out.println("1) Agregar cliente:");
        System.out.println("2) Mostrar cliente");
        System.out.println("3) Salir");
        System.out.println("Opcion: ");
        
        opc = new Scanner(System.in).nextInt(); 
        
        return opc; 
        
    }
    
    public Cliente lecturaCliente(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Dame un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dame un Telefono: ");
        String telefono = sc.nextLine();        
        return new Cliente(nombre, telefono);        
    }
    
    public void mostrarClientes(List<Cliente> clientes){
        System.out.println("Datos de los clientes ");
        for(Cliente cliente: clientes)
        {
            System.out.println(cliente);
        }
    }
    
    public void msg(String text){
        
        System.out.println(text);
        
    }
    
}
