import java.util.Scanner;
/*

3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.

 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = dataInput.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = dataInput.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100);
        System.out.println("El precio final es: " + precioFinal);
        System.out.println("----------------------------------");
        dataInput.close();

    }
}
