package controlador;

import modelo.ClientePrincipalModel;
import vista.ClientePrincipalView;

public class ClientePrincipalController {
    private ClientePrincipalView vista;
    private ClientePrincipalModel modelo;

    public ClientePrincipalController(ClientePrincipalView vista, ClientePrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
    }
}
