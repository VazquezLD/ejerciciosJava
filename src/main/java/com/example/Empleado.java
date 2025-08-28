package com.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Scanner;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Empleado {
    
    private String nombre;
    private String apellido;
    private String pais;
    private String cargo;
    private int edad;
    private int dni;

    public static void generarEmpleados(Empleado vec[], Scanner scanner){

        for (int i=0 ; i < vec.length; i++){
            System.out.println();
            System.out.println("Ingrese nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese pais:");
            String pais = scanner.nextLine();
            System.out.println("Ingrese cargo:");
            String cargo = scanner.nextLine();
            System.out.println("Ingrese edad:");
            int edad = scanner.nextInt();
            System.out.println("Ingrese dni:");
            int dni = scanner.nextInt();

            vec[i] = new Empleado(nombre, apellido, pais, cargo, edad, dni);
            scanner.nextLine();
        }
        System.out.println("\nLos" + vec.length + " empleados fueron generados.");
    }

    public static void mostrarEmpleados(Empleado vec[]){

        if (vec.length <= 0 || vec[0] == null){
            System.out.println("\n No existen empleados, primero crealos.");
            return;
        }

        for (int i=0; i < vec.length; i++){
            System.out.println(vec[i]);
        }
    }

    public static void eliminarEmpleado(Empleado vec[], Scanner scanner){

        System.out.println("\nIngrese dni del empleado a eliminar:");
        int dniAEliminar = scanner.nextInt();
        
        for (int i =0; i < vec.length; i++){
            if (vec[i].dni == dniAEliminar){
                System.out.println("\nEmpleado encontrado y eliminado.");
                vec[i] = null;
                return;
            }
        System.out.println("\nNo se econtró el empleado con dni" + dniAEliminar+ "...");
        return;
        }   
    }
}
