public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    
    public Usuario(int idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    public void seleccionarAsiento(Asiento asiento) {

    }
    public void realizarPago(Pago pago) {

    }
    public void recibirNotificacion(String mensaje) {
        
    }
    
}
