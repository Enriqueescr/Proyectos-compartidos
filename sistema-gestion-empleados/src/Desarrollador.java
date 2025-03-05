public class Desarrollador extends Empleado {

double horasExtra=30;

public Desarrollador(String nombre, int edad, double salarioBase){
    super(nombre, edad, salarioBase);
}


@Override
double calcularSalario() {
    // TODO Auto-generated method stub
    double salarioTotal = salarioBase + (horasExtra*20);
      return salarioTotal ; 
}






}
