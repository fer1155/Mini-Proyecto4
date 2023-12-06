package DAO;

import modelo.Usuario;

public interface IDao {
    public boolean addUsuario(Usuario usuario);
    public Usuario getUsario(String usuarioNombre, String usuarioContraseña);
    public Usuario getAdmin(String adminNombre, String adminContraseña);
    public boolean updateUsuario(Usuario personaConDatosActualizados);
    public boolean deleteUsario(String idUsuarioAEliminar);
}
