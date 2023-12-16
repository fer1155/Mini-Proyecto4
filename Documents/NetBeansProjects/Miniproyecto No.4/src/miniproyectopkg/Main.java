/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

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
