import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.print("Ingrese la edad de su perro: ");
        int edad = leer.nextInt();
        System.out.println("-----------------------------");
        int edadPerro = edad *7;
        System.out.println("La edad de su perro en años de perro es: "+edadPerro);
        System.out.println("-----------------------------");


    }
}