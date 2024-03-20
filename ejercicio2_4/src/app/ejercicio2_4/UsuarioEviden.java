package app.ejercicio2_4;

public class UsuarioEviden  implements IUsuario{ 
    @Override 
    public void insertaUsuario() { 
        System.out.println("Insertando usuario en Eviden"); 
    } 
 
    @Override 
    public void eliminaUsuarioById(int id) { 
        System.out.println("Eliminando usuario de Eviden con id: " + id); 
    } 
} 

