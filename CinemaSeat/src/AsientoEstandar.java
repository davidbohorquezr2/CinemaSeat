public class AsientoEstandar extends Asiento {
    public AsientoEstandar(int idAsiento, EstadoAsiento estadoAsiento, double precio, Sala sala) {
        super(idAsiento, estadoAsiento, precio, sala);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
