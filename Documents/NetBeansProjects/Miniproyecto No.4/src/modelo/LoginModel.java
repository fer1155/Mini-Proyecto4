package modelo;

import DAO.IDao;
import DAO.IDaoImplementation;

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
    
    public Usuario obtenerAdmin(String nombre, String adminContraseña){
        return this.Dao.getAdmin(nombre, adminContraseña);
    }
}
