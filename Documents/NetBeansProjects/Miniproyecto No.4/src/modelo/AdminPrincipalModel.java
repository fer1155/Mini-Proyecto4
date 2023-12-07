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
    
    public boolean registrarProducto(Producto producto){
        return modeloGeneral.agregarProducto(producto);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return modeloGeneral.obtenerProductos();
    }
}
