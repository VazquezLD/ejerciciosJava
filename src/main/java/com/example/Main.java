package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        Empleado[] v = new Empleado[0];

        while (opcion != 0){
            Menu.mostrar();
            System.out.println("Ingrese opcion: ");
            opcion = scanner.nextInt();

            while (opcion < 1 || opcion > 4){
                System.out.println("Ingrese un valor valido: ");
                opcion = scanner.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad de empleados a generar:");
                    System.out.println();
                    int cant = scanner.nextInt();
                    scanner.nextLine();

                    while (cant <= 0){
                        System.out.println("Ingrese cantidad valida:");
                        System.out.println();
                        cant = scanner.nextInt();
                        scanner.nextLine();
                    }
                    v = new Empleado[cant];

                    Empleado.generarEmpleados(v, scanner);
                    break;
                case 2:
                    Empleado.mostrarEmpleados(v);
                    break;
                case 3:
                    Empleado.eliminarEmpleado(v, scanner);
                    break;
                case 4:
                    System.out.println("Hasta luego...");
                    return;
                default:
                    break;
            }
        }
    }
}