package algoritmos.clientes.busqueda;

import code.Cliente;
import java.util.ArrayList;

public class BusquedaBinaria
{
    
    public Cliente binarySearch(ArrayList<Cliente> datos, int elemento)
    {
        
        int primero = 0, ultimo = datos.size() - 1, central, pos = 0;
        
        boolean found = false;
        
        do
        {
            
            central = (primero + ultimo)/2;
            
            if(elemento == datos.get(central).getCodigo())
            {
                
                found = true;
                pos = central;
                
            }
            
            if(elemento < datos.get(central).getCodigo())
            {
                ultimo = central - 1;
            }
            
            if(elemento > datos.get(central).getCodigo())
            {
                primero = central + 1;
            }
            
        }while(!found && primero <= ultimo);
        
        if(found)
        {
            return datos.get(pos);
        }else {
            return null;
        }
        
    }
    
}
