public class AsientoVip extends Asiento {
    public AsientoVip(int idAsiento, EstadoAsiento estadoAsiento, double precio, Sala sala) {
        super(idAsiento, estadoAsiento, precio, sala);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
