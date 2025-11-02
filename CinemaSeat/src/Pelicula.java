import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private int idPelicula;
    private String titulo;
    private int duracion;
    private List<Funcion> funciones;

    

    public Pelicula(int idPelicula, String titulo, int duracion) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        funciones = new ArrayList<>();
    }
    
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void obtenerInfo() {

    }
    public void actualizarDetalles() {

    }
}
