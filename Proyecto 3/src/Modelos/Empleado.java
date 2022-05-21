package Modelos;

public class Empleado {

  private String nombre;

  private String apellido;

  private double salarioMensual;

  public Empleado(String nombre, String apellido, double salarioMensual) {
    super();
    this.nombre = nombre;
    this.apellido = apellido;
    this.salarioMensual = salarioMensual;
  }

  public double aumentarSalario() {
    double porcentaje = (salarioMensual / 100) * (10);
    salarioMensual = salarioMensual + porcentaje;
    return salarioMensual;
  }

  public String getNombre() {
    return nombre;
  }

  public double getSalarioMensual() {
    return salarioMensual;
  }

  @Override
  public String toString() {
    return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salarioMensual="
        + salarioMensual + "]";
  }


}
