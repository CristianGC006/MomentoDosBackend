package AdminEmpresa540;

public class EmpleadoRegular540 extends Usuario {
    // Constructor que llama al constructor de la superclase
    public EmpleadoRegular540(String nombre, String email) {
        super();
    }

    // Métodos específicos del empleado regular
    public void realizarTarea() {
        System.out.println("Realizando tarea básica...");
    }
    public void detallesReg(EmpleadoRegular540 empleado){
        System.out.println("Soy el empleado"+ getNombre());
    }
}
