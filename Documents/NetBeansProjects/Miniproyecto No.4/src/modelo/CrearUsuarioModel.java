/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

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
