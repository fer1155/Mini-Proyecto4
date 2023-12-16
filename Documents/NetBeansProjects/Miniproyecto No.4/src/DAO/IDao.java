/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

package DAO;

import java.util.ArrayList;
import modelo.Compra;
import modelo.Pedido;
import modelo.Producto;
import modelo.Provedor;
import modelo.Usuario;

public interface IDao {
    public boolean addUsuario(Usuario usuario);
    public Usuario getUsario(String usuarioNombre, String usuarioContraseña);
    public ArrayList<Usuario> getArrayClientes();
    public boolean deleteUsario(int idUsuarioAEliminar);
    public Usuario getUsuarioXContrasena(String usuarioContraseña);
    public Usuario getAdmin(String adminNombre, String adminContraseña);
    public Usuario getUsuarioActual();
    public void updateUsuarios();
    public void setUsuarioActual(Usuario usuarioActual);
    
    public boolean addProducto(Producto producto);
    public ArrayList<Producto> getArrayProductos();
    public Producto getProducto(String numSerie);
    public void updateProductos();
    public boolean deleteProducto(String numReferencia);
    
    public boolean addCompra(Compra registroCompra);
    public ArrayList<Compra> getArrayCompras();
    
    public boolean addProvedor(Provedor provedor);
    public ArrayList<Provedor> getArrayProvedores();
    public Provedor getProvedor(int id);
    public void updateProveedor();
    public boolean deleteProveedor(int id);
    
    
    public boolean addPedido(Pedido pedido);
    public ArrayList<Pedido> getArrayPedidos();
    public Pedido getPedido(int id, String producto);
    public boolean deletePedido(int id, String producto);
    public void updatePedido();
    
    public boolean registrarUsuariostxt();
    public boolean cargarUsuariostxt();
    public boolean registrarProductostxt();
    public boolean cargarProductostxt();
    public boolean registrarComprastxt();
    public boolean cargarComprastxt();
    public boolean registrarProveedortxt();
    public boolean cargarProveedortxt();
    public boolean registrarPedidotxt();
    public boolean cargarPedidotxt();
}
