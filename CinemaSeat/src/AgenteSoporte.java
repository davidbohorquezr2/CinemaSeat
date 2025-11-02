import java.util.ArrayList;
import java.util.List;

public class AgenteSoporte extends Usuario {
    List<Reporte> reportes ;

    public AgenteSoporte(int idUsuario, String nombre, String email ) {
        super(idUsuario, nombre, email);
        reportes = new ArrayList<>();
    }

    public void atenderReporte(Reporte reporte) {
        
    }
    public void escalarReporte(Reporte reporte, Administrador admin) {

    }

}
