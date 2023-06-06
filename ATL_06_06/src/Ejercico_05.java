import java.util.*;

public class Ejercico_05 {
    /*
        5) Juego de adivinar el número:
        Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.

     */
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        Scanner inData = new Scanner(System.in);
        int num = numAleatorio.nextInt(101);
        System.out.println("------------------------------------");
        System.out.print("Ingrese el numero para adivinar: ");
        int num2 = inData.nextInt();
        if (num == num2){
            System.out.println(" Adivinaste");
            System.out.println(num);
        }else{
            System.out.println("No adivinaste el numero a adivinar era: ");
            System.out.println(num);

        }
        System.out.println("--------------------------------------");


    }
}
