public class Reporte {
    private int idReporte;
    private String descripcion;
    private EstadoReporte estadoReporte;
    private Usuario agente;

    

    public Reporte(int idReporte, String descripcion, EstadoReporte estadoReporte, Usuario agente) {
        this.idReporte = idReporte;
        this.descripcion = descripcion;
        this.estadoReporte = estadoReporte;
        this.agente = agente;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstadoReporte(EstadoReporte estadoReporte) {
        this.estadoReporte = estadoReporte;
    }

    public EstadoReporte getEstadoReporte() {
        return estadoReporte;
    }
    public Usuario getAgente() {
        return agente;
    }

    public void escalar() {

    }
    public void cerrar() {

    }
    
}
