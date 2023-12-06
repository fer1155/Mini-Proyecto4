package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import modelo.CrearUsuarioModel;
import modelo.LoginModel;
import modelo.Usuario;
import vista.CrearUsuarioView;
import vista.LoginView;

public class CrearUsuarioController {
    private CrearUsuarioView vista;
    private CrearUsuarioModel modelo;
    private LoginView vistaLogin;
    private LoginModel modeloLogin;
    private LoginController controladorLogin;

    public CrearUsuarioController(CrearUsuarioView vista, CrearUsuarioModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonRegistrarListener(new abrirVentana());
        this.vista.addBtonCancelarListener(new abrirVentana());
    }
    
    class abrirVentana implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Registrar")){
                Usuario usuario = new Usuario(vista.getNombreTextField().getText(), parseInt(vista.getNumIdTextField().getText()), vista.getCorreoTextField().getText(),vista.getDireccionTextField().getText(), vista.getContrasenaTextField().getText(), false);
                modelo.registrar(usuario);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vistaLogin = new LoginView();
                //modeloLogin = new LoginModel();
                controladorLogin = new LoginController(vistaLogin, modelo.getLoginModel());
                vista.dispose();
            }
        }
    }
}
