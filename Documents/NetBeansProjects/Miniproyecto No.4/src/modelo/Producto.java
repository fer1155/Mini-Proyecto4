/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

package modelo;

public class Producto {
    private String numReferencia;
    private String nombre;
    private int unidadesDisponibles;
    private int precio;

    public Producto(String numReferencia, String nombre, int unidadesDisponibles, int precio) {
        this.numReferencia = numReferencia;
        this.nombre = nombre;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
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
    
    
    @Override
    public String toString() {
        return "Num referencia: " + numReferencia + " / Nombre: " + nombre + " / Unidades disponibles: " + unidadesDisponibles + " / Precio: " + precio;
    }
       
}
