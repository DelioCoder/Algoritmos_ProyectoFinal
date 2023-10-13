package algoritmos.clientes.ordenamiento;

import code.Cliente;
import java.util.ArrayList;

public class ShellSort
{
    
    public void shellSort(ArrayList<Cliente> datos)
    {
        
        int i, j, k, salto;
        
        Cliente tem;
        
        salto = datos.size()/2;
        
        while(salto > 0)
        {
            
            for(i = salto; i < datos.size(); i++)
            {
                j = i - salto;
                
                while(j >= 0)
                {
                    k = j + salto;
                    
                    if(datos.get(j).getCodigo() >= datos.get(k).getCodigo())
                    {
                        tem = datos.get(j);
                        datos.set(j, datos.get(k));
                        datos.set(k, tem);
                        j-=salto;
                    }else{
                        j=-1;
                    }
                    
                }
                
            }
            
            salto = salto / 2;
            
        }
        
        //System.out.println(datos);
        
    }
}
