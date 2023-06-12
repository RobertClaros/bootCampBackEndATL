
import java.util.Scanner;

public class Ejercicio_04 {
    /*
    4) Calculadora de propinas:
        Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

     */
    public static void main(String[] args) {
        Scanner inData = new Scanner(System.in);
        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta = inData.nextDouble();
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = inData.nextDouble();
        double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El monto de la propina es: " + propina);
        inData.close();

    }
}
