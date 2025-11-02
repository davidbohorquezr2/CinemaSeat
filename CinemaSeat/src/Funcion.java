public class Funcion {
    private int idFuncion;
    private Pelicula peliculaFuncion;
    private Sala salaFuncion;

    public Funcion(int idFuncion, Pelicula peliculaFuncion, Sala salaFuncion) {
        this.idFuncion = idFuncion;
        this.peliculaFuncion = peliculaFuncion;
        this.salaFuncion = salaFuncion;
    }

    
    public int getIdFuncion() {
        return idFuncion;
    }


    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }


    public Pelicula getPeliculaFuncion() {
        return peliculaFuncion;
    }


    public void setPeliculaFuncion(Pelicula peliculaFuncion) {
        this.peliculaFuncion = peliculaFuncion;
    }


    public Sala getSalaFuncion() {
        return salaFuncion;
    }


    public void setSalaFuncion(Sala salaFuncion) {
        this.salaFuncion = salaFuncion;
    }


    public void iniciarFuncion() {
        
    }
    public void cancelarFuncion() {

    }

}
