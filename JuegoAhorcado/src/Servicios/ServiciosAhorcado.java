package Servicios;

import Entidad.Ahorcado;

import java.util.Scanner;

/*
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.

 */
public class ServiciosAhorcado {
    private Ahorcado ahorcado;
    private int jugadasMaximas;
    public ServiciosAhorcado() {
    }

    public void juego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = leer.nextLine();

        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        jugadasMaximas = leer.nextInt();

        ahorcado = new Ahorcado(palabra, jugadasMaximas);

        System.out.println("----------------------------------------------");
        System.out.println("Juego del Ahorcado");
        System.out.println("La palabra tiene una longitud de: " + ahorcado.getPalabra().length);

        while (this.jugadasMaximas > 0 && ahorcado.getEncontradas() < ahorcado.getPalabra().length) {
            System.out.println("Ingrese una letra: ");
            char letra = leer.next().charAt(0);

            buscar(letra);
            encontradas(letra);
            intentos();

            System.out.println("----------------------------------------------");
        }

        if (this.jugadasMaximas == 0) {
            System.out.println("Lo siento, te has quedado sin intentos. La palabra era: " + String.valueOf(ahorcado.getPalabra()));
        } else {
            System.out.println("¡Felicidades! Has descubierto la palabra: " + String.valueOf(ahorcado.getPalabra()));
        }

        leer.close();
    }

    /*
     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
     Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(char letra) {
        boolean encontrada = false;
        for (char c : ahorcado.getPalabra()) {
            if (c == letra) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            jugadasMaximas--;
        }
    }

    public void encontradas(char letra) {
        int encontradas = 0;
        for (char c : ahorcado.getPalabra()) {
            if (c == letra) {
                encontradas++;
            }
        }
        ahorcado.encontradas += encontradas;
        int faltantes = ahorcado.getPalabra().length - ahorcado.getEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getEncontradas() + "," + faltantes + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + jugadasMaximas);
    }
}