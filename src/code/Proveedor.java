package code;
public class Proveedor {
    private int codigo;
    private String nombre;
    private String telefono;
    private String email;

    public Proveedor() {
    }
    
    public Proveedor(int codigo, String nombre, String telefono, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    //Metodos Get y Set
    public void setCodigo(int codigo) {    
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
}
