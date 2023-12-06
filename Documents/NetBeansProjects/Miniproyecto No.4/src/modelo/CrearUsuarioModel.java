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
}
