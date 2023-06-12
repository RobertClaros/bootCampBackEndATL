
    import java.util.Scanner;

    public class PiedraPapelTijera {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido a Piedra, Papel y Tijera");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");

            int opcionUsuario = scanner.nextInt();
            int opcionComputadora = (int) (Math.random() * 3) + 1;

            String eleccionUsuario = obtenerEleccion(opcionUsuario);
            String eleccionComputadora = obtenerEleccion(opcionComputadora);

            System.out.println("Has seleccionado: " + eleccionUsuario);
            System.out.println("La computadora seleccionó: " + eleccionComputadora);

            String resultado = obtenerResultado(opcionUsuario, opcionComputadora);
            System.out.println(resultado);
        }

        public static String obtenerEleccion(int opcion) {
            switch (opcion) {
                case 1:
                    return "Piedra";
                case 2:
                    return "Papel";
                case 3:
                    return "Tijera";
                default:
                    return "Opción inválida";
            }
        }

        public static String obtenerResultado(int opcionUsuario, int opcionComputadora) {
            if (opcionUsuario == opcionComputadora) {
                return "Es un empate";
            } else if ((opcionUsuario == 1 && opcionComputadora == 3) ||
                    (opcionUsuario == 2 && opcionComputadora == 1) ||
                    (opcionUsuario == 3 && opcionComputadora == 2)) {
                return "¡Ganaste!";
            } else {
                return "Perdiste. Intenta de nuevo.";
            }
        }
    }


