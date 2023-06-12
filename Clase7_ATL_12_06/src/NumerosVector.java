import java.util.Scanner;

public class NumerosVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = scanner.nextInt();
        int[] numeros = new int[tamaño];
        System.out.println("Ingrese " + tamaño + " números:");


        llenarVector(numeros, scanner);
        System.out.println("Los números ingresados son:");
        mostrarNumeros(numeros);
        System.out.println("");

        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio de los números es: " + promedio);
    }

    public static void llenarVector(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    public static void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
}
