/*
Miniproyecto No. 3

Fernando Cardona - 2241381
Oscar Mario Muñoz - 2242481
Santiago Alzate   - 2242274

Grupo de FPOE: 80
*/

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import modelo.ClientePrincipalModel;
import modelo.CrearUsuarioModel;
import modelo.LoginModel;
import modelo.Usuario;
import vista.ClientePrincipalView;
import vista.CrearUsuarioView;
import vista.LoginView;

public class CrearUsuarioController {
    private CrearUsuarioView vista;
    private CrearUsuarioModel modelo;
    private LoginView vistaLogin;
    private LoginModel modeloLogin;
    private LoginController controladorLogin;
    private ClientePrincipalView vistaCliente;
    private ClientePrincipalController controladorCliente;
    private ClientePrincipalModel modeloCliente;

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
                if(verificarCamposVacios() == false){
                    try{
                        int id = parseInt(vista.getNumIdTextField().getText());
                        if(verificarContrasenaRepetida() == null){
                            Usuario usuario = new Usuario(vista.getNombreTextField().getText(), id, vista.getCorreoTextField().getText(),vista.getDireccionTextField().getText(), vista.getContrasenaTextField().getText(), false);
                            modelo.registrar(usuario);
                            modelo.setiarUsuarioActual(usuario);
                            vistaCliente = new ClientePrincipalView();
                            modeloCliente = new ClientePrincipalModel(modelo.getLoginModel());
                            controladorCliente = new ClientePrincipalController(vistaCliente, modeloCliente);
                            vista.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "La Contraseña registrada ya esta en uso, intente con una nueva", "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }catch(NumberFormatException exc){
                        JOptionPane.showMessageDialog(null, "El ID suministrado contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                    } 
                }   
            }
          
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vistaLogin = new LoginView();
                controladorLogin = new LoginController(vistaLogin, modelo.getLoginModel());
                vista.dispose();
            }
        }
    }
    
    public boolean verificarCamposVacios(){
        if("".equals(vista.getNombreTextField().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar su nombre, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getNumIdTextField().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar su ID, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getCorreoTextField().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar su correo, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getDireccionTextField().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar su direccion, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getContrasenaTextField().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar su contraseña, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    public Usuario verificarContrasenaRepetida(){
        return modelo.getUsuarioXContrasena(vista.getContrasenaTextField().getText());
    }
}
