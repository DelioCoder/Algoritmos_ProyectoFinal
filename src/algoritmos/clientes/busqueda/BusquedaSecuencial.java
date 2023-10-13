package algoritmos.clientes.busqueda;

import code.Cliente;
import java.util.ArrayList;

public class BusquedaSecuencial
{
    
    public Cliente sequentialSearch(ArrayList<Cliente> datos, String nombre)
    {
   
        boolean found   = false;
        int i           = 0;
        int pos         = 0;
        
        while(!found && i < datos.size())
        {
            
            if(datos.get(i).getNombre().equalsIgnoreCase(nombre))
            {
                found = true;
                pos = i;
            }
            
            if(datos.get(i).getNombre().compareToIgnoreCase(nombre) > 0)
            {
                break;
            }
            
            i++;
            
        }
        
        if(found)
        {
            return datos.get(pos);
            //System.out.println("Elemento encontrado y en la posición: " + pos);
        }else{
            // System.out.println("Elemento no encontrado ");
            return null;
        }
        
    }
    
}
