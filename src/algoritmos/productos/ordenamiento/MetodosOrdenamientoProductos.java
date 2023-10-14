package algoritmos.productos.ordenamiento;

import code.Producto;
import java.util.ArrayList;

/**
 *
 * @author Gianny
 */
public class MetodosOrdenamientoProductos {

    public static void sortBurbujaCodigos(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size() - 1; i++) {
            for (int j = 0; j < productos.size() - 1; j++) {
                if (productos.get(j).getCodigo() > productos.get(j + 1).getCodigo()) {
                    Producto temp = productos.get(j);
//                    int temp = productos.get(j).getCodigo();
                    productos.set(j, productos.get(j + 1));
//                    datos[j] = datos[j + 1];
                    productos.set(j + 1, temp);
//                    datos[j + 1] = temp;
                }
            }
        }
    }

    public static void sortBurbujaMejoradoStock(ArrayList<Producto> productos) {
        int c = 0;
        boolean centinela;
        int i;
        do {
            centinela = true;

            for (i = 0; i < productos.size() - 1; i++) {
                if (productos.get(i).getStock() > productos.get(i + 1).getStock()) {
                    Producto temp = productos.get(i);
//                    int temp = datos[i];
                    productos.set(i, productos.get(i + 1));
//                    datos[i] = datos[i + 1];
                    productos.set(i + 1, temp);
//                    datos[i + 1] = temp;
                    centinela = false;
                }
            }

            c++;
        } while (!centinela);
    }

    public static void sortInsercionNombre(ArrayList<Producto> productos) {
        for (int i = 1; i < productos.size(); i++) {
            Producto temp = productos.get(i);
            int j = i - 1;

            while (j >= 0 && productos.get(j).getNombre().compareTo(temp.getNombre()) > 0) {
                productos.set(j + 1, productos.get(j));
                j -= 1;
            }

            productos.set(j + 1, temp);
        }
    }

    public static void sortMergeSortPrecio(ArrayList<Producto> productos) {
        int n = productos.size();
        if (n < 2) {
            return; // Arreglo ya esta ordenado
        }

        int medio = n / 2;
        ArrayList<Producto> datosIzq = new ArrayList<>(productos.subList(0, medio));
        ArrayList<Producto> datosDer = new ArrayList<>(productos.subList(medio, productos.size()));

        sortMergeSortPrecio(datosIzq);
        sortMergeSortPrecio(datosDer);
        merge(datosIzq, datosDer, productos);
    }

    private static void merge(ArrayList<Producto> arregloIzq, ArrayList<Producto> arregloDer, ArrayList<Producto> arreglo) {
        int nIzq = arregloIzq.size();
        int nDer = arregloDer.size();

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nIzq && j < nDer) {
            if (arregloIzq.get(i).getPrecio() <= arregloDer.get(j).getPrecio()) {
                arreglo.set(k, arregloIzq.get(i));
                i++;
            } else {
                arreglo.set(k, arregloDer.get(j));
                j++;
            }

            k++;
        }

        // Agregamos elementos restantes al arreglo
        while (i < nIzq) {
            arreglo.set(k, arregloIzq.get(i));
            i++;
            k++;
        }

        // Agregamos elementos restantes al arreglo
        while (j < nDer) {
            arreglo.set(k, arregloDer.get(j));
            j++;
            k++;
        }
    }
}
