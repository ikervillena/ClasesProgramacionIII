package RepositorioClases.JUnit.Ejercicio3;

public class OperacionesConArray {

    public static void sumarAPosicion(int[] array, int posicion, int numero) {
        array[posicion] += numero;
    }
    public static int sumarPosiciones(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

}
