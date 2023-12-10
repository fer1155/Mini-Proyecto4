package modelo;

public class Usuario {
    private String nombre;
    private int numId;
    private String correo;
    private String direccion;
    private String password;
    private boolean serAdmin;

    public Usuario(String nombre, int numId, String correo, String direccion, String password, boolean serAdmin) {
        this.nombre = nombre;
        this.numId = numId;
        this.correo = correo;
        this.direccion = direccion;
        this.password = password;
        this.serAdmin = serAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Nombre de usuario: " + nombre + " / Número de identificación: " + numId + " / Correo: " + correo + " / Direccion: " + direccion + " / Password: " + password;
    }
}
