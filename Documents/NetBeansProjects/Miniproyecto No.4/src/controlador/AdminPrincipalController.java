package controlador;

import modelo.AdminPrincipalModel;
import vista.AdminPrincipalView;

public class AdminPrincipalController {
    private AdminPrincipalView vista;
    private AdminPrincipalModel modelo;

    public AdminPrincipalController(AdminPrincipalView vista, AdminPrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
    }
}
