package algoritmos.clientes.ordenamiento;

import code.Cliente;
import java.util.ArrayList;

public class MetodoQuickSort
{
    
    public void quickSort(ArrayList<Cliente> clientes, int primero, int ultimo)
    {
        int i, j;
        
        i = primero;
        j = ultimo;
        int iP = (primero + ultimo)/2;
        //int pivot = lista.get(indexPivot);
        Cliente pivot = clientes.get(iP);
        
        do
        {
            //
            while(clientes.get(i).compareTo(pivot) < 0)
            {
                i++;
            }
            
            while(clientes.get(j).compareTo(pivot) > 0)
            {
                j--;
            }
            
            if(i <= j)
            {
                Cliente aux = clientes.get(i);
                clientes.set(i, clientes.get(j));
                clientes.set(j, aux);
                
                i++;
                j--;
            }
            
        }while(i <= j);
        
        if(primero < j)
        {
            quickSort(clientes, primero, j);
        }
        
        if(i < ultimo)
        {
            quickSort(clientes, i, ultimo);
        }
        
    }
    
}
