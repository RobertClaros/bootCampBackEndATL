package Entidad;

/*
6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
public class Ahorcado {
    private char[] palabra;
    public int encontradas;

    public Ahorcado(String palabra, int encontradas) {
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }


}

