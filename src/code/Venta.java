package code;
public class Venta {
    private String codigo;
    private String codigoCliente;
    private double importe;
    
    public Venta(){
        
    }
    
    public Venta(String codigo, String codigoCliente, double importe) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
