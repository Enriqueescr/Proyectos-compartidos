public abstract class Empleado {

  //Escribo los atributos de mi clase abstracta
  private String nombre;
  private int edad;
  protected double salarioBase;

  //A continuación escribo el constructor de la clase Empleado
  public Empleado(String nombre, int edad, double salarioBase){
    this.nombre = nombre;
    this.edad = edad;
    this.salarioBase = salarioBase;
    try{
      if(edad < 18){
        throw new IllegalArgumentException("No tienes edad para trabajar en esta empresa");
      }
    }catch (IllegalArgumentException e){
      System.out.println("Excepción capturada " + e.getMessage());
    }
    
    try {
      if(salarioBase < 1000){
        throw new IllegalArgumentException("El salario no puede ser menor a 1000€");
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Excepción capturada: " + e.getMessage());
    }
  }

  //Escribiendo los getters y setters
  public void getNombre(){
    System.out.println("El nombre del empleado es: " + nombre);
  }
  public String setNombre(String nombre){
    return this.nombre = nombre;
  }

  public void getEdad(){
    System.out.println("La edad del empleado es: " + edad);
  }
  public int setEdad(int edad){
    return this.edad = edad;
  }

  public void getSalarioBase(){
    System.out.println("El salario base es: " + salarioBase);
  }
  public double setSalarioBase(double salarioBase){
    return this.salarioBase = salarioBase;
  }

  abstract double calcularSalario();

  public void mostrarInfo(){
    System.out.println("La info de este empleado es: nombre = " + nombre + " edad = " + edad + " salario base = " + salarioBase);
  }




}
