public class Asiento4D extends Asiento {

    public Asiento4D(int idAsiento, EstadoAsiento estadoAsiento, double precio, Sala sala) {
        super(idAsiento, estadoAsiento, precio, sala);
    }
    
    @Override
    public double calcularPrecio() {
        return 0;
    }
}
