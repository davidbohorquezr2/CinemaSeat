public class Pago {
    private double monto;
    private MetodoPago metodoPago;

    public Pago(double monto, MetodoPago metodoPago) {
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public void procesarPago() {

    }
    public void verificarPago() {
        
    }
    
}
