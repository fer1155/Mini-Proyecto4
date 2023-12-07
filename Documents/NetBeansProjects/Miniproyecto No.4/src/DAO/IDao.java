package DAO;

import java.util.ArrayList;
import modelo.Producto;
import modelo.Usuario;

public interface IDao {
    public boolean addUsuario(Usuario usuario);
    public Usuario getUsario(String usuarioNombre, String usuarioContraseña);
    public ArrayList<Usuario> getArrayClientes();
    public Usuario getAdmin(String adminNombre, String adminContraseña);
    public boolean addProducto(Producto producto);
    public ArrayList<Producto> getArrayProductos();
    public boolean updateUsuario(Usuario personaConDatosActualizados);
    public boolean deleteUsario(String idUsuarioAEliminar);
}
