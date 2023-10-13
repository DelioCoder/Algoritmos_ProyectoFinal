package code;
public class DetalleVenta {
    private String codigoDetalleVenta;
    private String codigoVenta;
    private String codigoProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private double importe;

    public DetalleVenta(){
        
    }
    
    public DetalleVenta(String codigoDetalleVenta, String codigoVenta, String codigoProducto, String nombre, int cantidad, double precio, double importe) {
        this.codigoDetalleVenta = codigoDetalleVenta;
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

    public String getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(String codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

     public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}