package AdminEmpresa540;

public class Usuario {
    public String nombre;
    private String email;
    private String rol;

    // Constructor
    public Usuario() {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    // Getters y setters
    public String getNombre(){
        return nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Rol: " + rol);
    }



}

