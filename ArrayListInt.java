import java.util.Arrays;

/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Lista que almacena los numeros
    private int[] numeros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // Inicializa el array
        numeros = new int[0];
    }

    /**
     * Añade un elemento a la colección al final de la misma.
     */
    public void add(int elemento)
    {
        int[] nuevoArray = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {            
            nuevoArray[i] = numeros[i];
        }
        nuevoArray[numeros.length] = elemento;
        numeros = nuevoArray;
    }
}
