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
}
