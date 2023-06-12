
    import java.util.Scanner;

    public class NumerosOperaciones {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Ingrese el tercer número: ");
            double numero3 = scanner.nextDouble();

            double promedio = (numero1 + numero2 + numero3) / 3;
            System.out.println("El número promedio es: " + promedio);

            double mayor = Math.max(numero1, Math.max(numero2, numero3));
            double menor = Math.min(numero1, Math.min(numero2, numero3));

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        }
    }


