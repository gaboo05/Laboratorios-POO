import java.util.ArrayList;
import java.util.List;

public class User {

    // Atributos de User
    private String username;
    private String password;
    private Plan plan;
    private List<Reunion> reuniones;
    private List<String> historialContactos;
    private boolean sesionIniciada;

    // Constructor de User
    public User(String username, String password, Plan plan) {
        this.username = username;
        this.password = password;
        this.plan = plan;
        this.reuniones = new ArrayList<>();
        this.historialContactos = new ArrayList<>();
        this.sesionIniciada = false;
    }

    // Métodos de User
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String nueva) {
        this.password = nueva;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void agregarReunion(Reunion r) {
        reuniones.add(r);
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }

    public void agregarContacto(String contacto) {
        historialContactos.add(contacto);
    }

    public List<String> getHistorialContactos() {
        return historialContactos;
    }

    public void iniciarSesion() {
        this.sesionIniciada = true;
    }

    public void cerrarSesion() {
        this.sesionIniciada = false;
    }

    public boolean estaAutenticado() {
        return sesionIniciada;
    }
}
