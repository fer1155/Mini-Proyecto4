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
}
