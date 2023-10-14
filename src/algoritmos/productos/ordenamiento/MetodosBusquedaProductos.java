package algoritmos.productos.ordenamiento;

import code.Producto;
import java.util.ArrayList;

/**
 *
 * @author Gianny
 */
public class MetodosBusquedaProductos {

    // Método que permite encontrar un Producto según un nombre dado
    public static Producto busquedaSecuencialNombre(ArrayList<Producto> productos, String nombre) {
        boolean found = false;
        int i = 0;
        int pos = 0;
        while (!found && i < productos.size()) {            
            if (productos.get(i).getNombre().equals(nombre)) {
                found = true;
                pos = i;
            }
            
            i++;
        }
        
        if (found) {
            return productos.get(pos);
        }
        
        return null;
    }

    // Método que permite encontrar un Producto según su código
    public static Producto busquedaBinariaCodigo(ArrayList<Producto> productos, int numeroBuscado) {

        int primero = 0;
        int ultimo = productos.size() - 1;
        
        while (primero <= ultimo) {
            // Encontramos la posicion y Producto del medio
            int posicionMedio = (primero + ultimo) / 2;
            Producto productoMedio = productos.get(posicionMedio);

            // Posible encuentro y retorno
            if (numeroBuscado == productoMedio.getCodigo()) {
                return productoMedio;
            }

            // Si el num es menor, movemos el ultimo a -1 del medio
            if (numeroBuscado < productoMedio.getCodigo()) {
                ultimo = posicionMedio - 1;
            } else {
                // De lo contrario, es mayor y movemos el primero a +1 del medio
                primero = posicionMedio + 1;
            }
        }
        
        return null;
    }
}
