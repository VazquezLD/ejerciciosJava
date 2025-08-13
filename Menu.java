import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int op = -1;
        String nombre, apellido, provincia;

        do{
            System.out.println("--- Ingrese opción elegida ---");
            System.out.println("1- Crear perfil.");
            System.out.println("2- Salir");
            op = input.nextInt();

            while (op < 1 || op > 2){
                System.out.println("Ingrese valor válido: ");
                op = input.nextInt();
            }
            input.nextLine();

            if (op == 1){
                System.out.println("Ingrese nombre: "); nombre = input.nextLine();

                System.out.println("Ingrese apellido: "); apellido = input.nextLine();

                System.out.println("Ingrese provincia: "); provincia = input.nextLine();

                System.out.println("Usuario creado ->" + nombre + apellido + provincia);
            } else{
                System.out.println("Hasta luego...");
                break;
            }

        }
        while(op != 2);
    }
}
