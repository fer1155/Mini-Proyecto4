package modelo;

public class CrearUsuarioModel {
    private LoginModel modeloGeneral;
    
    public CrearUsuarioModel(LoginModel modelo) {
        this.modeloGeneral = modelo;
    }
    
    public void registrar(Usuario usuario){
        modeloGeneral.agregarUsuario(usuario);
    }
    
    public LoginModel getLoginModel(){
        return modeloGeneral;
    }
    
    public void setiarUsuarioActual(Usuario usuarioo){
        this.modeloGeneral.setiarUsuarioActual(usuarioo);
    }
    
    public Usuario getUsuarioXContrasena(String usuarioContraseña){
        return this.modeloGeneral.obtenerUsarioXContasena(usuarioContraseña);
    }
}
