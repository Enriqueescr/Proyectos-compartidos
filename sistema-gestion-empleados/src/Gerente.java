public class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, int edad, double salarioBase){
        super(nombre, edad, salarioBase);
    }

    @Override
    double calcularSalario() {
        // TODO Auto-generated method stub
        double salarioTotal = salarioBase + bono;
          return salarioTotal ; 
    }








}
