import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("Programa en Java!");
        System.out.println("Ejercicios");
        System.out.println("-----------------------------");

        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese numero 2: ");
        int num2 = sc.nextInt();


        if (num1 > num2){
            resultado = num1 - num2;
            num1 = num1 - resultado;
            num2 = num2 + resultado;
        } else{
            resultado = num2 - num1;
            num1 = num1 + resultado;
            num2 = num2 - resultado;
        }
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
    }
}