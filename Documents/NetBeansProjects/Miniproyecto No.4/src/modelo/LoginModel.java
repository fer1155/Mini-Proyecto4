package modelo;

import DAO.IDao;
import DAO.IDaoImplementation;
import java.util.ArrayList;

public class LoginModel {
    private IDao Dao;

    public LoginModel() {
        this.Dao = new IDaoImplementation();
    }
    
    public boolean agregarUsuario(Usuario usuarioAIngresar){
        return this.Dao.addUsuario(usuarioAIngresar);
    }
    
    public Usuario obtenerUsario(String nombre, String usuarioContraseña){
        return this.Dao.getUsario(nombre, usuarioContraseña);
    }
    
    public boolean eliminarUsuario(int id){
        return this.Dao.deleteUsario(id);
    }
    
    public ArrayList<Usuario> obtenerClientes(){
        return this.Dao.getArrayClientes();
    }
    
    public Usuario obtenerAdmin(String nombre, String adminContraseña){
        return this.Dao.getAdmin(nombre, adminContraseña);
    }
    
    public boolean agregarProducto(Producto productoAIngresar){
        return this.Dao.addProducto(productoAIngresar);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return this.Dao.getArrayProductos();
    }
    
    public Producto obtenerProducto(String numeroSerie){
        return this.Dao.getProducto(numeroSerie);
    }
    
    public boolean agregarCompra(Compra compra){
        return this.Dao.addCompra(compra);
    }
    
    public ArrayList<Compra> obtenerArrayCompras(){
        return this.Dao.getArrayCompras();
    }

    public Usuario obtenerUsuarioActual(){
        return this.Dao.getUsuarioActual();
    }
    
    public void setiarUsuarioActual(Usuario usuario){
        this.Dao.setUsuarioActual(usuario);
    }
    
    public boolean agregarProvedor(Provedor provedorAIngresar){
        return this.Dao.addProvedor(provedorAIngresar);
    }
    
    public ArrayList<Provedor> obtenerArrayProvedores(){
        return this.Dao.getArrayProvedores();
    }
    
    public boolean agregarPedido(Pedido pedidoAIngresar){
        return this.Dao.addPedido(pedidoAIngresar);
    }
    
    public ArrayList<Pedido> obtenerArrayPedidos(){
        return this.Dao.getArrayPedidos();
    }
    
    public Usuario obtenerUsarioXContasena(String usuarioContraseña){
        return this.Dao.getUsuarioXContrasena(usuarioContraseña);
    }
    
    public boolean eliminarProducto(String numReferenciaProducto){
        return this.Dao.deleteProducto(numReferenciaProducto);
    }
    
    public void actualizarUsuarios(){
        this.Dao.updateUsuarios();
    }
    
    public void actualizarProductos(){
        this.Dao.updateProductos();
    }
    
    public Provedor obtenerProvedor(int id){
        return this.Dao.getProvedor(id);
    }
    
    public boolean eliminarProvedor(int id){
        return this.Dao.deleteProveedor(id);
    }
    
    public void actualizarProvedores(){
        this.Dao.updateProveedor();
    }
    
    public Pedido obtenerPedido(int id, String producto){
        return this.Dao.getPedido(id, producto);
    }
    
    public boolean eliminarPedido(int id, String producto){
        return this.Dao.deletePedido(id, producto);
    }
    
    public void actualizarPedido(){
        this.Dao.updatePedido();
    }
    
    public boolean cargarUsuariostxt(){
        return this.Dao.cargarUsuariostxt();
    }
    
    public boolean cargarProductostxt(){
        return this.Dao.cargarProductostxt();
    }
    
    public boolean cargarComprastxt(){
        return this.Dao.cargarComprastxt();
    }
    
    public boolean cargarProvedorestxt(){
        return this.Dao.cargarProveedortxt();
    }
    
    public boolean cargarPedidostxt(){
        return this.Dao.cargarPedidotxt();
    }
}
