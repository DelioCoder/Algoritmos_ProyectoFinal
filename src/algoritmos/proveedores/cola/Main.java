package algoritmos.proveedores.cola;

import code.Proveedor;

public class Main {

    public static void main(String[] args)
    {
        LCola list = new LCola();
        
        list.setTope(3);
        
        list.insertInCola(new Proveedor(0, "FASDFSD", "DASDASASD", "dsadasdsasd@gmail.com"));
        
        list.insertInCola(new Proveedor(1, "FASDFSD", "DASDASASD", "dsadasdsasd@gmail.com"));
        
        list.insertInCola(new Proveedor(2, "FASDFSD", "DASDASASD", "dsadasdsasd@gmail.com"));
        
        list.deleteFromCola();
        
        list.showElements();
        
    }
    
}
