public class Switch {
    public static void main(String[] args) {

        //  Consigna: una pequeña empresa desea calcular los suelod de sus empleados + bono 10%
        // Los puestos son 1-Repositor, 2-Cajero y 3-Supervisor. Los repositores ganan $15.000
        // Los cajeros $25.000 y los supervisores $35.000 que se les descuenta 11% por jubilacion
        //  Se necesita un programa que, dependiendo del tipo de empleado del que se trate calcule y
        //  muestre en pantalla la cantidad de dinero por cada empleado, si el presupuesto total excede el
        //  millón se debe mostrar un mensaje de rechazo + el presupuesto y si el presupuestotal no excede vicecersa.

        double cantRepositor, cantCajero, cantSupervisor, presupRepositor, presupCajero, presupSupervisor, presupTotal;

        cantRepositor=13;
        cantCajero=5;
        cantSupervisor=3;

        presupRepositor = (cantRepositor * 15000) + (cantRepositor * 15000) * 0.1;
        presupCajero = (cantCajero * 25000);
        presupSupervisor = (cantSupervisor * 35000) - (cantSupervisor * 35000) * 0.11;

        presupTotal = presupCajero + presupRepositor + presupSupervisor;

        if (presupTotal > 1000000){
            System.out.println("Se debe recortar personal, monto total: " + (int)presupTotal);
        }else {
            System.out.println("El presupuesto está dentro del rango: " + (int)presupTotal);
        }
    }
}
