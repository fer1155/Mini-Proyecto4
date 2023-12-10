package modelo;

public class Compra {
    private Usuario usuario;
    private String nombreDelComprador;
    private int numId;
    private String producto;
    private int unidadesCompradas;
    private int precioTotalComprado;

    public Compra(Usuario usuario, String producto, int unidadesCompradas, int precioTotalComprado) {
        nombreDelComprador = usuario.getNombre();
        numId = usuario.getNumId();
        this.producto = producto;
        this.unidadesCompradas = unidadesCompradas;
        this.precioTotalComprado = precioTotalComprado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreDelComprador() {
        return nombreDelComprador;
    }

    public void setNombreDelComprador(String nombreDelComprador) {
        this.nombreDelComprador = nombreDelComprador;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }

    public int getPrecioTotalComprado() {
        return precioTotalComprado;
    }

    public void setPrecioTotalComprado(int precioTotalComprado) {
        this.precioTotalComprado = precioTotalComprado;
    }

    @Override
    public String toString() {
        return "NombreDelComprador: " + nombreDelComprador + " / numId: " + numId + " / producto: " + producto + " / unidadesCompradas: " + unidadesCompradas + " / precioTotalComprado: " + precioTotalComprado;
    }
    
    
}
