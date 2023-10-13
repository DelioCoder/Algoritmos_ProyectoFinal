package code;

public class Cliente {
    private Integer codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private String sexo;
    private int edad;
    
    public Cliente(){ };
    
    public Cliente(Integer codigo, String nombre, String apellidos, String dni, String telefono, String direccion, String sexo, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    public int compareTo(Cliente otroCliente) {
        // Compara los clientes según su edad
        return Integer.compare(this.edad, otroCliente.edad);
    }
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
      // </editor-fold>   
}
