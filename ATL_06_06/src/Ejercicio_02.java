import java.util.Scanner;

public class Ejercicio_02
{
    public static void main(String[] args)
        {
            Scanner dataIn = new Scanner(System.in);
            System.out.print("Introduce a distance in miles: ");
            double distance = dataIn.nextDouble();
            double kilometer = distance*1.60934;
            System.out.println("Distance in kilometers: " + kilometer);
            dataIn.close();
        }
}
