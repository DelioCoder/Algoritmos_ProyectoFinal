package code;

public class FacturaProveedor extends Factura {
    private String codigo;
    private String codigoProveedor;
    private String producto;
    private int cantidad;
    private double importe;

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "FacturaProveedor{" + "codigo=" + codigo + ", codigoProveedor=" + codigoProveedor + ", producto=" + producto + ", cantidad=" + cantidad + ", importe=" + importe + '}';
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    

    
}
