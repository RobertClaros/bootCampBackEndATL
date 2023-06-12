import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Pais que desea buscar:  ");
        String pais = leer.next();
        System.out.println("Pais: https://www.google.com/maps/search/"+ pais);
        System.out.print("Ingrese el nombre de una celebridad: ");
        String celebridad = leer.next();
        System.out.println("Twitt de su celebridad: https://twitter.com/search?q="+celebridad);
        System.out.print("Ingresa un numero de telefono: ");
        String numeroTelefono = leer.next();
        System.out.println("Haga click para enviar un mensaje: https://api.whatsapp.com/send?phone="+numeroTelefono);

    }
}