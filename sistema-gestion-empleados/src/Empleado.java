public abstract class Empleado {

  //Escribo los atributos de mi clase abstracta
  private String nombre;
  private int edad;
  private double salarioBase;

  //A continuación escribo el constructor de la clase Empleado
  public Empleado(String nombre, int edad, int salarioBase){
    this.nombre = nombre;
    this.edad = edad;
    this.salarioBase = salarioBase;
    if(edad <= 18){
      System.err.println("No tienes edad para trabajar en esta empresa");
    }
  }

  //Escribiendo los getters y setters
  public void getNombre(){
    System.out.println("El nombre del empleado es: " + nombre);
  }
  public String setNombre(String nombre){
    return this.nombre = nombre;
  }

  



}
