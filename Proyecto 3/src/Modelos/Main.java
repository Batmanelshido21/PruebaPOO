package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner lector = new Scanner(System.in);
    ArrayList<Empleado> empleados = new ArrayList();
    String nombre = "";
    String apellido = "";
    int salarioMensual = 0;
    int bandera = 0;

    while (bandera < 4) {
      System.out.println(
          "Introduce la opción a realizar\n 0:Registrar empleado \n 1:Mostrar salario anual\n 2:Mostrar empleados\n 3:aumentar Salario mensual\n");
      bandera = lector.nextInt();
      switch (bandera) {
        case 0:
          System.out.println("Introduce el nombre del empleado");
          nombre = lector.nextLine();
          nombre = lector.nextLine();
          System.out.println("Introduce el apellido del empleado");
          apellido = lector.nextLine();
          System.out.println("Introduce el salario mensual");
          salarioMensual = lector.nextInt();
          Empleado empleado = new Empleado(nombre, apellido, salarioMensual);
          empleados.add(empleado);
          break;
        case 1:
          System.out.println("Introduce el nombre de la persona a conocer su salario");
          nombre = lector.nextLine();
          nombre = lector.nextLine();
          for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
              System.out.println("El salario anual de " + empleados.get(i).getNombre() + " es de "
                  + empleados.get(i).getSalarioMensual() * 12);
            }
          }
          break;
        case 2:
          for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i).toString());
          }
          break;
        case 3:
          System.out.println("Introduce el nombre de la persona para aumentar su salario");
          nombre = lector.nextLine();
          nombre = lector.nextLine();
          for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
              System.out.println("El salario mensual de la persona seleccionada es de "
                  + empleados.get(i).aumentarSalario());
            }
          }
          break;
      }
    }
  }

}
