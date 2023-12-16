/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

package modelo;

public class Provedor {
    private int id;
    private String nombre;
    private int telefono;
    private String direccion;
    private String productoAVender;
    private int valorProductoAVender;

    public Provedor(int id, String nombre, int telefono, String direccion, String productoAVender, int valorProductoAVender) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.productoAVender = productoAVender;
        this.valorProductoAVender = valorProductoAVender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProductoAVender() {
        return productoAVender;
    }

    public void setProductoAVender(String productoAVender) {
        this.productoAVender = productoAVender;
    }

    public int getValorProductoAVender() {
        return valorProductoAVender;
    }

    public void setValorProductoAVender(int valorProductoAVender) {
        this.valorProductoAVender = valorProductoAVender;
    }

    @Override
    public String toString() {
        return " ID: " + id + " / nombre: " + nombre + " / telefono: " + telefono + " / direccion: " + direccion + " / productoAVender: " + productoAVender + " / valorProductoAVender: " + valorProductoAVender;
    }
    
    
}
