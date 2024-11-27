package AdminEmpresa540;


public class main540{
    public static void main(String[] args) {
        EmpleadoRegular540 empleado = new EmpleadoRegular540("Juan Pérez", "juan@example.com");
        Supervisor540 supervisor = new Supervisor540("Ana López", "ana@example.com");
        Administrador540 admin = new Administrador540("Carlos García", "carlos@example.com");

        // Mostrar detalles de los usuarios
        empleado.mostrarDetalles();
        empleado.realizarTarea();


        supervisor.mostrarDetalles();
        supervisor.supervisarEmpleado(empleado);


        admin.mostrarDetalles();
        admin.crearUsuario(empleado);
        admin.mostrarDetalles(admin);
        supervisor.detallesSup(supervisor);
        empleado.detallesReg(empleado);



    }
}
