package app.ejercicio2_4;

public class UsuarioAtos implements IUsuario{ 
    @Override 
    public void insertaUsuario() { 
        System.out.println("Insertando usuario en Atos"); 
    } 
 
    @Override 
    public void eliminaUsuarioById(int id) { 
        System.out.println("Eliminando usuario en Atos con id: " + id); 
    } 
} 

