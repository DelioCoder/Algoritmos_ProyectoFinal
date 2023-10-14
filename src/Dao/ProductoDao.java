package Dao;

import java.util.ArrayList;
import code.Producto;
import java.util.function.Predicate;

/**
 * @author Gianny
 */
public class ProductoDao {

    private static ArrayList<Producto> productos = new ArrayList<>();
    private static int nProductos = 1;

    static {
        productos.add(new Producto(nProductos++, "Oreo", "Galleta Oreo rellena de Vainilla", 35, 1.5, "Galletas"));
        productos.add(new Producto(nProductos++, "Rellenitas Fresa", "Galleta Rellenita rellena de Fresa", 30, 1.00, "Galletas"));
        productos.add(new Producto(nProductos++, "Rellenitas Vainilla", "Galleta Rellenita rellena de Vainilla", 20, 1.20, "Galletas"));
        productos.add(new Producto(nProductos++, "Coronita", "Galleta Coronita rellena de Chocolate", 40, 2.50, "Galletas"));
        productos.add(new Producto(nProductos++, "Picaras", "Galleta Picaras mitad Chocolate", 15, 3.90, "Galletas"));
        productos.add(new Producto(nProductos++, "Chips Chocolate", "Galleta Chips con chipas de Chocolate", 60, 5.80, "Galletas"));
        productos.add(new Producto(nProductos++, "Margarita", "Galleta Margarita", 20, 3.20, "Galletas"));
        productos.add(new Producto(nProductos++, "ChocoSoda", "Galleta ChocoSoda bañada en Chocolate", 20, 4.00, "Galletas"));
        productos.add(new Producto(nProductos++, "Fanta", "Bebida Fanta 500ml", 20, 2.40, "Bebidas"));
        productos.add(new Producto(nProductos++, "Sprite", "Bebida Sprite 450ml", 30, 2.50, "Bebidas"));
        productos.add(new Producto(nProductos++, "Cielo", "Bebida Cielo 625ml", 40, 2.50, "Bebidas"));
        productos.add(new Producto(nProductos++, "San Mateo", "Bebida San Mateo 625ml", 18, 4.00, "Bebidas"));
        productos.add(new Producto(nProductos++, "San Luis", "Bebida San Luis 625ml", 20, 3.20, "Bebidas"));
        productos.add(new Producto(nProductos++, "Inca Kola", "Bebida Inca Kola 450ml", 80, 2.50, "Bebidas"));
        productos.add(new Producto(nProductos++, "Aceite V. Primor", "Aceite Vegetal Primor Premium 900ml", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Fideo Spaghetti", "Fideo Spaghetti Don Vittorio 950g", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Mayonesa AlaCena", "Mayonesa AlaCena 850g", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Arroz Costeño", "Arroz Extra Costeño 5kg", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Atun Primor T.", "Atun en Trozos Primor 140g", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Atun Primor F.", "Atun Filete Primor 140g", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Salsa Tomate Pomarola", "Salsa Tomate Pomarola 145g", 20, 3.99, "Abarrates"));
        productos.add(new Producto(nProductos++, "Lenteja Costeño", "Lenteja Costeño 500g", 20, 3.99, "Abarrates"));

    }

    public static ArrayList<Producto> obtenerProductos() {
        return productos;
    }

    
    public static void agregarProducto(Producto producto){
        producto.setCodigo(nProductos++);
        productos.add(producto);
    }
    
    public static int obtenerStockProducto(String nombre){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                return productos.get(i).getStock();
            }
        }
        
        return 0;
    }
    
    public static void actualizarStockProducto(String nombre, int nuevoStock){
        if (existeProducto(nombre)) {
            Predicate<? super Producto> precidate = producto -> producto.getNombre().equals(nombre);
            Producto p = productos.stream().filter(precidate).findFirst().orElse(null);
            p.setStock(nuevoStock);
        }
    }
    
    public static boolean existeProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (nombre.equals(productos.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }
}
