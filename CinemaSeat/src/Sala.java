import java.util.List;

public class Sala {
    private int idSala;
    private String nombre;
    private List<Asiento> asientos;
    private Funcion funcion;

    public Sala(int idSala, String nombre, Funcion funcion) {
        this.idSala = idSala;
        this.nombre = nombre;
        this.funcion = funcion;
    }

    
    public int getIdSala() {
        return idSala;
    }


    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Asiento> getAsientos() {
        return asientos;
    }


    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }


    public Funcion getFuncion() {
        return funcion;
    }


    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }


    public void mostrarMapaAsientos() {

    }
    public void obtenerDisponibilidad() {

    }
}
