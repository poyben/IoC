package app.ejercicio2_4;

public class UsuarioFactory {
	IUsuario usr; 
	 
    public UsuarioFactory(IUsuario usr) { 
        this.usr = usr; 
    } 
 
    public void getInsertaUsuario() { 
        usr.insertaUsuario(); 
    } 
 
    public void getEliminaUsuario(int id) { 
        usr.eliminaUsuarioById(id); 
    } 
} 

