package modelo;

import java.util.ArrayList;

public class ClientePrincipalModel {
    private LoginModel modeloGeneral;
    
    public ClientePrincipalModel(LoginModel modelo) {
        this.modeloGeneral = modelo;
    }
    public ArrayList<Producto> obtenerProductos(){
        return modeloGeneral.obtenerProductos();
    }
    
    public Producto getProducto(String numSerie){
        return modeloGeneral.obtenerProducto(numSerie);
    }
    
    public boolean addCompra(Compra registroCompra){
        return modeloGeneral.agregarCompra(registroCompra);
    }
    
    public Usuario getUsuarioActual(){
        return modeloGeneral.obtenerUsuarioActual();
    }
    
    public LoginModel getLoginModel(){
        return modeloGeneral;
    }
}
