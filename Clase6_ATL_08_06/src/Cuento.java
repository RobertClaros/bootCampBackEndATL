import java.util.Scanner;

public class Cuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("El misterio del bosque encantado");
        System.out.println("---------------------------------");
        System.out.println("Eres un intrépido explorador que se adentra en un bosque misterioso.");
        System.out.println("A medida que avanzas, notas que el aire se vuelve más denso y una bruma espesa comienza a rodearte.");

        System.out.println("De repente, te encuentras frente a un camino dividido.");
        System.out.println("1. Sigues el camino iluminado por las luciérnagas.");
        System.out.println("2. Te aventuras por el camino cubierto de sombras oscuras.");
        int decision1 = scanner.nextInt();

        if (decision1 == 1) {
            System.out.println("Sigues el camino iluminado por las luciérnagas.");
            System.out.println("Avanzas con cautela mientras disfrutas de su cálido brillo.");
            System.out.println("Después de un rato, llegas a un claro en el bosque, donde descubres un antiguo altar rodeado de mariposas multicolores.");

            System.out.println("¿Qué decides hacer?");
            System.out.println("1. Observas el altar con respeto y sigues adelante.");
            System.out.println("2. Te acercas al altar y tocas uno de los símbolos tallados.");
            int decision2 = scanner.nextInt();

            if (decision2 == 1) {
                System.out.println("Observas el altar con respeto y sigues adelante.");
                System.out.println("Continúas tu camino y descubres más maravillas en el bosque encantado.");
                // Continuar la historia...
            } else if (decision2 == 2) {
                System.out.println("Te acercas al altar y tocas uno de los símbolos tallados.");
                System.out.println("Sientes una ráfaga de viento y, de repente, te encuentras rodeado de una luz brillante.");
                System.out.println("Cuando tus ojos se acostumbran, te das cuenta de que has sido transportado a un reino mágico.");
                // Continuar la historia...
            } else {
                System.out.println("Opción inválida.");
            }

        } else if (decision1 == 2) {
            System.out.println("Te aventuras por el camino cubierto de sombras oscuras.");
            System.out.println("Avanzas con precaución mientras te adentras en la oscuridad.");
            System.out.println("Después de un tiempo, encuentras un puente antiguo que cruza un río rugiente.");

            System.out.println("¿Qué decides hacer?");
            System.out.println("1. Cruzas el puente con cuidado.");
            System.out.println("2. Buscas una manera de rodear el río.");
            int decision3 = scanner.nextInt();

            if (decision3 == 1) {
                System.out.println("Cruzas el puente con cuidado.");
                System.out.println("Logras atravesarlo sin problemas y continúas tu camino por el bosque.");
                // Continuar la historia...
            } else if (decision3 == 2) {
                System.out.println("Buscas una manera de rodear el río.");
                System.out.println("Exploras los alrededores y descubres un camino oculto que te lleva a través de un desfiladero estrecho y peligroso.");
                System.out.println("Después de superar varios desafíos, finalmente llegas al otro lado del río.");
                System.out.println("Continúas tu aventura en el bosque encantado.");

                System.out.println("A medida que avanzas, te encuentras con una misteriosa criatura que te bloquea el camino.");
                System.out.println("¿Qué decides hacer?");
                System.out.println("1. Intentas comunicarte pacíficamente con la criatura.");
                System.out.println("2. Te preparas para el combate y enfrentas a la criatura.");

                int decision4 = scanner.nextInt();

                if (decision4 == 1) {
                    System.out.println("Intentas comunicarte pacíficamente con la criatura.");
                    System.out.println("Con habilidad y empatía, logras establecer una conexión con ella.");
                    System.out.println("La criatura se convierte en tu amiga y te guía a través del bosque, revelándote secretos y tesoros ocultos.");
                    System.out.println("Juntos, vivís grandes aventuras y creáis una relación duradera.");
                    // Fin feliz de la historia...
                } else if (decision4 == 2) {
                    System.out.println("Te preparas para el combate y enfrentas a la criatura.");
                    System.out.println("La batalla es feroz y desafiante, pero logras derrotar a la criatura con tu valentía y habilidad.");
                    System.out.println("Sin embargo, al vencerla, una profunda tristeza invade tu corazón.");
                    System.out.println("Te das cuenta de que la criatura solo estaba protegiendo su hogar y su intención no era hacerte daño.");
                    System.out.println("Lamentas tu decisión y continúas tu viaje con un peso en el corazón.");
                    // Fin triste de la historia...
                } else {
                    System.out.println("Opción inválida.");
                }

                scanner.close();


            }
        }
    }
}

