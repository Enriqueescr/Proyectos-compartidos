import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
  
       ArrayList <Empleado> listaEmpleados = new ArrayList<>();
        Desarrollador desarrollador2 = new Desarrollador("Dario", 20, 12000);
        Gerente gerente2 = new Gerente("Enrique", 20, 1999);
        DesarrolladorRemoto desarrolladorRemoto2 = new DesarrolladorRemoto("Jaun", 20, 99999);

         listaEmpleados.add(0, desarrollador2);
         listaEmpleados.add(1, gerente2 );
         listaEmpleados.add(2, desarrolladorRemoto2);

         for (Empleado empleado : listaEmpleados) {
            empleado.mostrarInfo(); 
        }


        

        }
    }

    



