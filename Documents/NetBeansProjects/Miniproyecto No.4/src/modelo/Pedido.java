package modelo;

public class Pedido {
    private String nombreProvedor;
    private int idProvedor;
    private String producto;
    private int precioProducto;
    private int cantidadPedido;
    private int precioTotalPedido;

    public Pedido(String nombreProvedor, int idProvedor, String producto, int precioProducto, int cantidadPedido, int precioTotalPedido) {
        this.nombreProvedor = nombreProvedor;
        this.idProvedor = idProvedor;
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.cantidadPedido = cantidadPedido;
        this.precioTotalPedido = precioTotalPedido;
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public int getPrecioTotalPedido() {
        return precioTotalPedido;
    }

    public void setPrecioTotalPedido(int precioTotalPedido) {
        this.precioTotalPedido = precioTotalPedido;
    }

    @Override
    public String toString() {
        return "nombreProvedor: " + nombreProvedor + " / idProvedor: " + idProvedor + " / producto: " + producto + " / precioProducto: " + precioProducto + " / cantidadPedido: " + cantidadPedido + " / precioTotalPedido: " + precioTotalPedido;
    }
    
    
}
