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
    
    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro index.
     * Si el valor de index no es válido, entonces no hace nada.
     * Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        int[] nuevoArray = new int [numeros.length + 1];
        int i = 0;
        int iNuevo = 0;
        while (i < numeros.length) {
            if (index == i) {
                nuevoArray[i] = elemento;
                iNuevo++;
            }
            else {
                nuevoArray[iNuevo] = numeros[i];
                iNuevo++;
            }
            i++;
        }
        numeros = nuevoArray;
    }
    
    /**
     * Vacia la colecion
     */
    public void clear()
    {
        numeros = new int[0];
    }
    
    /**
     * Devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public boolean contains(int elemento)
    {
        boolean contieneElemento = false;
        int i = 0;
        while (i < numeros.length && !contieneElemento) {
            if (numeros[i] == elemento) {
                contieneElemento = true;
            }
            i++;
        }
        return contieneElemento;
    }
    
    /**
     * Devuelve el elemento existente en la posición indicada.
     * Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index)
    {
        int elemento = -1;
        if (index >= 0 && index < numeros.length) {
            elemento = numeros[index];
        } 
        return elemento;
    }
    
    /**
     * Reemplaza el elemento en la posición index con el valor de element.
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        if (index < numeros.length && index >= 0) {
            numeros[index] = element;
        }        
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        int indice = -1;
        int i = 1;
        boolean elementoEncontrado = false;
        while (i < numeros.length && !elementoEncontrado) {
            if (elemento == numeros[i]) {
                indice = i;
                elementoEncontrado = true;
            }
        }
        return indice;
    }
    
    /**
     * Devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty() 
    {
        boolean listaVacia = true;
        if (numeros.length > 0) {
            listaVacia = false;
        }
        return listaVacia;
    }
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int i = 0;
        boolean elementoEncontrado = false;
        int borrado = -1;
        while (i < numeros.length && !elementoEncontrado) {
            if (index == numeros[i]) {
                int[] nuevoArray = new int[numeros.length - 1];
                borrado = numeros[i];
            }
            i++;
        }
        return borrado;
    }
    
    /**
     * Devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return numeros.length;
    }
}
