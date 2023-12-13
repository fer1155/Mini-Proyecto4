package miniproyectopkg;

import controlador.LoginController;
import modelo.LoginModel;
import vista.LoginView;

public class Main {

    public static void main(String[] args) {
        LoginView vistaLogin = new LoginView();
        LoginModel modeloLogin = new LoginModel();
        LoginController controladorLogin = new LoginController(vistaLogin, modeloLogin);
        controladorLogin.cargarInfo();

    }
    
}
