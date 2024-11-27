package AdminEmpresa540;

public class Administrador540 extends Usuario{

    // Constructor que llama al constructor de la superclase
    public Administrador540(String nombre, String email) {
        super();
    }


    // Métodos específicos del administrador
    public void crearUsuario(Usuario usuario) {
        System.out.println("Creando usuario: " + usuario.getNombre());
    }
    public void eliminarUsuario(Usuario usuario){
        System.out.println("Eliminando Usuario...");
    }

    public void agregrarUsuario(){
        System.out.println("Se agrego un usuario");
    }
    public void mostrarDetalles(Administrador540 admin){
        System.out.println("soy el administrador" +getNombre());
    }
}
