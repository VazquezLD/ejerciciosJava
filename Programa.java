import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese edad: "); int edad = input.nextInt();
        while (edad < 0){
            System.out.println("Ingrese edad valida: "); edad = input.nextInt();
        }

        String categoria = (edad >= 18) ? "Mayor" : "Menor";

        switch (categoria){
            case "Mayor" -> System.out.println("Sos mayor de edad.");
            case "Menor" -> System.out.println("Sos menor de edad.");
            default -> System.out.println("Edad ingresada no valida.");
        }

    }
}
