package modelo;

public class Producto {
    private int numReferencia;
    private String nombre;
    private int unidadesDisponibles;
    private int precio;

    public Producto(int numReferencia, String nombre, int unidadesDisponibles, int precio) {
        this.numReferencia = numReferencia;
        this.nombre = nombre;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /*
    @Override
    public String toString() {
        return "Nombre Completo: " + nombre + " Número de identificación: " + numId + " Correo: " + correo + " Direccion: " + direccion + " Password: " + password;
    }*/
       
}
