/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

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
    
    public ArrayList<Compra> getArrayCompras(){
        return modeloGeneral.obtenerArrayCompras();
    }
    
    public Usuario getUsuarioActual(){
        return modeloGeneral.obtenerUsuarioActual();
    }
    
    public LoginModel getLoginModel(){
        return modeloGeneral;
    }

    public boolean deleteProducto(String numReferencia){
        return modeloGeneral.eliminarProducto(numReferencia);
    }
    
    public Usuario getUsuario(String nombre, String usuarioContraseña){
        return modeloGeneral.obtenerUsario(nombre, usuarioContraseña);
    }
    
    public void updateUsuarios(){
        modeloGeneral.actualizarUsuarios();
    }
}
