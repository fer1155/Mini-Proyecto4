package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
        this.vista.addBtonMostrarPasswordListener(new abrirVentana());
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
                Usuario adminObtenido = modelo.obtenerAdmin(vista.getNombreTextField().getText(), vista.getContrasenaPasswordFiel().getText());
                Usuario usuarioObtenido = modelo.obtenerUsario(vista.getNombreTextField().getText(), vista.getContrasenaPasswordFiel().getText());
                
                if(adminObtenido != null){
                    vistaPrincipalAdmin = new AdminPrincipalView();
                    modeloPrincipalAdmin = new AdminPrincipalModel(modelo);
                    controladorPrincipalAdmin = new AdminPrincipalController(vistaPrincipalAdmin, modeloPrincipalAdmin);
                    vista.dispose();
                }else if(usuarioObtenido != null){
                    modelo.setiarUsuarioActual(usuarioObtenido);
                    vistaPrincipalCliente = new ClientePrincipalView();
                    modeloPrincipalCliente = new ClientePrincipalModel(modelo);
                    controladorPrincipalCliente = new ClientePrincipalController(vistaPrincipalCliente, modeloPrincipalCliente);
                    vista.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Show/Hide")){
                char echoChar = vista.getContrasenaPasswordFiel().getEchoChar();
                if (echoChar == '•') {
                    // Si el carácter de eco es '*', cambia a '\0' (sin eco)
                    vista.getContrasenaPasswordFiel().setEchoChar('\0');
                } else {
                    // Si el carácter de eco no es '*', cambia a '*'
                    vista.getContrasenaPasswordFiel().setEchoChar('•');
                }
            }
        }
    }
    
    public void cargarInfo(){
        modelo.cargarUsuariostxt();
        modelo.cargarProductostxt();
        modelo.cargarComprastxt();
        modelo.cargarProvedorestxt();
        modelo.cargarPedidostxt();
    } 
}
