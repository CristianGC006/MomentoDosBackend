package AdminEmpresa540;

public class Supervisor540 extends Usuario {

        public Supervisor540(String nombre, String email) {
            super();
        }

        // Métodos específicos del supervisor

        public void supervisarEmpleado(EmpleadoRegular540 empleado) {
            System.out.println("Supervisando a " + empleado.getNombre());
        }
    public void detallesSup(Supervisor540 supervisor){
        System.out.println("Soy el Supervisor"+ getNombre());
    }
    }

