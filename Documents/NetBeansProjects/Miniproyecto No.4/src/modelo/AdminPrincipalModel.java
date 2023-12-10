package modelo;

import java.util.ArrayList;

public class AdminPrincipalModel {
    private LoginModel modeloGeneral;
    
    public AdminPrincipalModel(LoginModel modelo) {
        this.modeloGeneral = modelo;
    }
    
    public ArrayList<Usuario> obtenerClientes(){
        return modeloGeneral.obtenerClientes();
    }
    
    public boolean deleteUsario(int idUsuarioAEliminar){
        return modeloGeneral.eliminarUsuario(idUsuarioAEliminar);
    }
    
    public boolean registrarProducto(Producto producto){
        return modeloGeneral.agregarProducto(producto);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return modeloGeneral.obtenerProductos();
    }
    
    public Producto getProducto(String numSerie){
        return modeloGeneral.obtenerProducto(numSerie);
    }
    
    public LoginModel getLoginModel(){
        return modeloGeneral;
    }
    
    public ArrayList<Compra> obtenerCompras(){
        return modeloGeneral.obtenerArrayCompras();
    }
    
    public boolean registrarProvedor(Provedor provedor){
        return modeloGeneral.agregarProvedor(provedor);
    }
    
    public ArrayList<Provedor> obtenerProvedores(){
        return modeloGeneral.obtenerArrayProvedores();
    }
    
    public boolean registrarPedido(Pedido pedido){
        return modeloGeneral.agregarPedido(pedido);
    }
    
    public ArrayList<Pedido> obtenerPedidos(){
        return modeloGeneral.obtenerArrayPedidos();
    }
    
    public boolean deleteProducto(String numReferencia){
        return modeloGeneral.eliminarProducto(numReferencia);
    }
    
    public void updateProductos(){
        modeloGeneral.actualizarProductos();
    }
    
    public Provedor getProvedor(int id){
        return modeloGeneral.obtenerProvedor(id);
    }
    
    public boolean deleteProveedor(int id){
        return modeloGeneral.eliminarProvedor(id);
    }
    
    public void updateProveedor(){
        modeloGeneral.actualizarProvedores();
    }
    
    public Pedido getPedido(int id, String producto){
        return modeloGeneral.obtenerPedido(id, producto);
    }
    
    public boolean deletePedido(int id, String producto){
        return modeloGeneral.eliminarPedido(id, producto);
    }
    
    public void updatePedido(){
        modeloGeneral.actualizarPedido();
    }
    
    public boolean cargarUsuariostxt(){
        return modeloGeneral.cargarUsuariostxt();
    }
}
