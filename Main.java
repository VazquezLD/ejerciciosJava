
public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("Programa en Java!");
        System.out.println("Ejercicios");
        System.out.println("-----------------------------");

        int num1, num2, resultado;

        num1=35;
        num2=20;


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