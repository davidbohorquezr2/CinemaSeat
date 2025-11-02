public abstract class Asiento {
    private int idAsiento;
    private EstadoAsiento estadoAsiento;
    private double precio;
    private Sala sala;

    public Asiento(int idAsiento, EstadoAsiento estadoAsiento, double precio, Sala sala) {
        this.idAsiento = idAsiento;
        this.estadoAsiento = estadoAsiento;
        this.precio = precio;
        this.sala = sala;
    }

    
    public int getIdAsiento() {
        return idAsiento;
    }


    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }


    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }


    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Sala getSala() {
        return sala;
    }


    public void setSala(Sala sala) {
        this.sala = sala;
    }


    public void reservar() {

    }
    public void liberar() {

    }
    public abstract double calcularPrecio();

}
