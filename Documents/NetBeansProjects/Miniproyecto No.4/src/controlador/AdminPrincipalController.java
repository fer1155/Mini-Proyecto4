package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.AdminPrincipalModel;
import vista.AdminPrincipalView;

public class AdminPrincipalController {
    private AdminPrincipalView vista;
    private AdminPrincipalModel modelo;

    public AdminPrincipalController(AdminPrincipalView vista, AdminPrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonClienteListener(new accionesMouseBton1());
        this.vista.addBtonbton2Listener(new accionesMouseBton2());
        this.vista.addBtonbton3Listener(new accionesMouseBton3());
        this.vista.addBtonbton4Listener(new accionesMouseBton4());
        this.vista.addBtonClienteActionListener(new acciones());
        this.vista.addBtonBton2ClienteActionListener(new acciones());
    }
    
    class accionesMouseBton1 extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.setButtonBoder(vista.getjButton1());
        }
    }
    
    class accionesMouseBton2 extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.setButtonBoder(vista.getjButton2());
        }
    }
    
    class accionesMouseBton3 extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.setButtonBoder(vista.getjButton4());
        }
    }
    
    class accionesMouseBton4 extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.setButtonBoder(vista.getjButton5());
        }
    }
    
    class acciones implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Clientes")){
                System.out.println("Hola");
                vista.mostrarPestanaClientes();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("#2")){
                System.out.println("Hola 2");
                vista.mostrarPestana2();
            }
        }
    }
}
