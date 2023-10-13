package algoritmos.clientes.ordenamiento;

import code.Cliente;
import java.util.ArrayList;

public class MetodoSeleccion
{
    
    public void selectionSort(ArrayList<Cliente> datos)
    {
        
        int menor;
        Cliente aux;
        
        for (int i = 0; i < datos.size(); i++)
        {
            
            menor   = i;
            aux     = datos.get(menor);
            
            for (int j = i + 1; j < datos.size(); j++)
            {
                if(datos.get(j).getNombre().compareTo(aux.getNombre()) < 0)
                {
                    menor   = j;
                    aux     = datos.get(j);
                }
            }
            
            datos.set(menor, datos.get(i));
            datos.set(i, aux);
            
        }
        
    }
    
}
