package app.ejercicio2_4;

public class App { 
    public static void main(String[] args) { 
        UsuarioFactory obj = new UsuarioFactory(new UsuarioAtos()); //Se puede cambiar por UsuarioEviden
        obj.getInsertaUsuario(); 
        obj.getEliminaUsuario(1); 
    } 
}