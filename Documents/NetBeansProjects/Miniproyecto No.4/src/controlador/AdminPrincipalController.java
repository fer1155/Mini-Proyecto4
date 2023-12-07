package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import modelo.AdminPrincipalModel;
import modelo.Producto;
import modelo.Usuario;
import vista.AdminPrincipalView;

public class AdminPrincipalController {
    private AdminPrincipalView vista;
    private AdminPrincipalModel modelo;

    public AdminPrincipalController(AdminPrincipalView vista, AdminPrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        this.vista.addBtonClienteListener(new accionesMouseBton1());
        this.vista.addBtonProductoListener(new accionesMouseBton2());
        this.vista.addBtonbton3Listener(new accionesMouseBton3());
        this.vista.addBtonbton4Listener(new accionesMouseBton4());
        this.vista.addBtonClienteActionListener(new acciones());
        this.vista.addBtonProductoActionListener(new acciones());
        this.vista.addBtonAgregarProductoActionListener(new acciones2());
        this.vista.addBtonaddProductoActionListener(new acciones2());
        this.vista.addBtonCerrarPage2Pnt1ActionListener(new acciones2());
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
                ArrayList<Usuario> clientes = modelo.obtenerClientes();
                String texto = "";
                int num = 1;
                for(Usuario cliente : clientes){
                    texto += num + ") "+ cliente.toString() + "\n";
                    num += 1;
                }
                
                vista.mostrarPestanaClientes();
                vista.setTextClientes(texto);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Productos")){
                vista.mostrarPestana2();
            }
        }
    }
    
    class acciones2 implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR PRODUCTO")){
                vista.mostrarPestanaSubirProductos();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                Producto productoAIngresar = new Producto(vista.getPage2Pnt1().getjTextField1().getText(), vista.getPage2Pnt1().getjTextField2().getText(),(int) vista.getPage2Pnt1().getjSpinner1().getValue(), parseInt(vista.getPage2Pnt1().getjTextField4().getText()));
                modelo.registrarProducto(productoAIngresar);
                actualizarTablaProductos();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("CERRAR")){
                vista.mostrarPestana2();
            }
        }
    }
    
    
    public void actualizarTablaProductos(){
        int rowCount = vista.getModeloTablaPg2().getRowCount();

        // Eliminar todas las filas
        for (int i = rowCount - 1; i >= 0; i--) {
            vista.getModeloTablaPg2().removeRow(i);
        }
        
        ArrayList<Producto> productos = modelo.obtenerProductos();
                
        for(Producto productoAIngresar : productos){
            agregarFilaATabla(productoAIngresar);
        }
    }
    
    
    public void agregarFilaATabla(Producto producto){
        Object[] fila = {
            producto.getNumReferencia(),
            producto.getNombre(),
            producto.getUnidadesDisponibles(),
            producto.getPrecio(),
        };
        
        vista.getModeloTablaPg2().addRow(fila);
    }
}
