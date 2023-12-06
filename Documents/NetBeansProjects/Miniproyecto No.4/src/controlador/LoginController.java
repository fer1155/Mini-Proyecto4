package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.AdminPrincipalModel;
import modelo.ClientePrincipalModel;
import modelo.CrearUsuarioModel;
import modelo.LoginModel;
import modelo.Usuario;
import vista.AdminPrincipalView;
import vista.ClientePrincipalView;
import vista.CrearUsuarioView;
import vista.LoginView;

public class LoginController {
    private LoginView vista;
    private LoginModel modelo;
    private CrearUsuarioView vistaRegistrarUsuario;
    private CrearUsuarioModel modeloRegistrarUsuario;
    private CrearUsuarioController controladorRegistrarUsuario;
    private ClientePrincipalView vistaPrincipalCliente;
    private ClientePrincipalModel modeloPrincipalCliente;
    private ClientePrincipalController controladorPrincipalCliente;
    private AdminPrincipalView vistaPrincipalAdmin;
    private AdminPrincipalModel modeloPrincipalAdmin;
    private AdminPrincipalController controladorPrincipalAdmin;

    public LoginController(LoginView vista, LoginModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonCrearCuentaListener(new abrirVentana());
        this.vista.addBtonIngresarListener(new abrirVentana());
    }
    
    class abrirVentana implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Registrarse")){
                vistaRegistrarUsuario = new CrearUsuarioView();
                modeloRegistrarUsuario = new CrearUsuarioModel(modelo);
                controladorRegistrarUsuario = new CrearUsuarioController(vistaRegistrarUsuario, modeloRegistrarUsuario);
                vista.dispose();
            }
            if(e.getActionCommand().equalsIgnoreCase("INGRESAR")){
                
                Usuario adminObtenido = modelo.obtenerAdmin(vista.getNombreTextField().getText(), vista.getContrasenaTextField().getText());
                if(adminObtenido != null){
                    vistaPrincipalAdmin = new AdminPrincipalView();
                    modeloPrincipalAdmin = new AdminPrincipalModel();
                    controladorPrincipalAdmin = new AdminPrincipalController(vistaPrincipalAdmin, modeloPrincipalAdmin);
                    vista.dispose();
                }
                
                Usuario usuarioObtenido = modelo.obtenerUsario(vista.getNombreTextField().getText(), vista.getContrasenaTextField().getText());
                if(usuarioObtenido != null){
                    System.out.println("Usuario encontrado");
                    vistaPrincipalCliente = new ClientePrincipalView();
                    modeloPrincipalCliente = new ClientePrincipalModel();
                    controladorPrincipalCliente = new ClientePrincipalController(vistaPrincipalCliente, modeloPrincipalCliente);
                    vista.dispose();
                }
            }
        }
    }
    
}
