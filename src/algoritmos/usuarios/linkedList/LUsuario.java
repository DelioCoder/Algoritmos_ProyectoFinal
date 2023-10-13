package algoritmos.usuarios.linkedList;

import code.Usuario;
import java.util.ArrayList;

public class LUsuario
{
    
    private Nodo cabeza = null;
    
    private int length = 0;
    
    private class Nodo
    {
        public Usuario usuario;
        public Nodo siguiente = null;
    
        public Nodo(Usuario usuario)
        {
            this.usuario = usuario;
        }
        
    }
    
    public void insertFirst(Usuario usuario)
    {
        Nodo nodo = new Nodo(usuario);
        nodo.siguiente  = cabeza;
        cabeza = nodo;
        length++;
    }
    
    public void insertEnd(Usuario usuario)
    {
        Nodo nodo       = new Nodo(usuario);
        Nodo puntero    = cabeza;
        if(cabeza == null)
        {
            cabeza = nodo;
        }else {
            while(puntero.siguiente != null)
            {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
            length++;
        }
    }
    
    public void insertAfter(int n, Usuario usuario)
    {
        Nodo nodo = new Nodo(usuario);
        if(cabeza == null)
        {
            cabeza = nodo;
        }else {
            
            Nodo puntero = cabeza;
            int contador = 0;
            
            while(contador < n && puntero.siguiente != null)
            {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
            
        }
         
    }
    
    public ArrayList<Usuario> showUsuarios()
    {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        if(cabeza == null)
        {
            System.out.println("lista vacía");
        }else {
            Nodo puntero = cabeza;
            
            while(puntero != null)
            {
                usuarios.add(puntero.usuario);
                puntero = puntero.siguiente;
            }
        }
        
        System.out.println(usuarios);
        
        return usuarios;
    }
    
    public Usuario getUsuario(int n)
    {
        if(cabeza == null)
        {
            return null;
        }else {
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null)
            {
                puntero = puntero.siguiente;
                contador++;
            }
            if(contador != n)
            {
                return null;
            }else {
                return puntero.usuario;
            }
        }
    }
    
    public int count()
    {
        return length;
    }
    
    public boolean isEmpty()
    {
        return cabeza == null;
    }
    
    public void deleteFirst()
    {
        if(cabeza != null)
        {
            Nodo first = cabeza;
            cabeza = cabeza.siguiente;
            first.siguiente = null;
            length--;
        }
    }
    
    public void deleteEnd()
    {
        if(cabeza != null)
        {
            if(cabeza.siguiente == null)
            {
                cabeza = null;
            }else {
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente != null)
                {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                length--;
            }
        }
    }
    
    public void deleteUsuario(int n)
    {
        if(cabeza != null)
        {
            if(n == 0)
            {
                Nodo first = cabeza;
                cabeza = cabeza.siguiente;
                first.siguiente = null;
                length--;
            }else if(n < length){
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < (n-1))
                {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente  =temp.siguiente;
                temp.siguiente  = null;
                length--;
            }
        }
    }
    
}
