package algoritmo.pilas;

import javax.swing.JOptionPane;

public class Pila {

    String[] pila;
    int n = 0;
    int tope = -1;

    public int getTope() {
        return tope;
    }
    
    public Pila(int n) {
        this.n = n;
        pila = new String[n];
    }
    
    public boolean push(String valor) {
        int max = n - 1;
        if (tope == max) {
            return false;
        } else {
            tope = tope + 1;
            pila[tope] = valor;
            return true;
        }
    }

    public String pop() {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null, "Pila llena está vacía.");
        } else {
            String dato = pila[tope];
            tope = tope - 1;
            return dato;
        }

        return "";
    }
    
    public String peek(){
        if (tope >= 0) {
            String dato = pila[tope];
            return dato;
        }
        
        return "";
    }
    
    public String mostrarPila(){
        String texto = "";
        for (int i = 0; i <= tope; i++) {
            texto += pila[i];
        }
        
        return texto;
    }
}
