package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ClientePrincipalModel;
import modelo.Compra;
import modelo.Producto;
import vista.ClientePrincipalView;
import vista.LoginView;

public class ClientePrincipalController {
    private ClientePrincipalView vista;
    private ClientePrincipalModel modelo;
    private int filaSeleccionada; 
    private LoginView vistaLogin;
    private LoginController controladorLogin;

    public ClientePrincipalController(ClientePrincipalView vista, ClientePrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.mostrarPestanaClientes();
        actualizarTablaProductos();
        vista.addBtonComprarProductoActionListener(new acciones());
        vista.addBtonCerrarSesionActionListener(new acciones());
        vista.addBtonComprarActionListener(new acciones2());
        vista.addBtonCancelarActionListener(new acciones2());
    }
    
    public void actualizarTablaProductos(){
        int rowCount = vista.getModelo().getRowCount();

        // Eliminar todas las filas
        for (int i = rowCount - 1; i >= 0; i--) {
            vista.getModelo().removeRow(i);
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
        
        vista.getModelo().addRow(fila);
    }
    
    class acciones implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Comprar Producto")){
                filaSeleccionada = vista.getjTable1().getSelectedRow();
                if (filaSeleccionada != -1) {
                    String nombre = (String) vista.getModelo().getValueAt(filaSeleccionada, 1);
                    String numReferencia = (String) vista.getModelo().getValueAt(filaSeleccionada, 0);
                    int unidadesDisponibles = (int) vista.getModelo().getValueAt(filaSeleccionada, 2);
                    int precio = (int) vista.getModelo().getValueAt(filaSeleccionada, 3);
                    vista.getPg3Pnt1().setjLabel2(nombre);
                    vista.getPg3Pnt1().setjLabel4(numReferencia);
                    vista.getPg3Pnt1().setjLabel6(valueOf(precio));
                    vista.getPg3Pnt1().setjLabel8(valueOf(unidadesDisponibles));
                    vista.mostrarPestanaComprarProductos();
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(e.getActionCommand().equalsIgnoreCase("Cerrar sesion")){
                vistaLogin = new LoginView();
                controladorLogin = new LoginController(vistaLogin, modelo.getLoginModel());
                vista.dispose();
            }
            
        }
    }
    
    class acciones2 implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Comprar")){
                int unidadesDisponibles = (int) vista.getModelo().getValueAt(filaSeleccionada, 2);
                if(vista.getPg3Pnt1().getjSpinnerValue() <= unidadesDisponibles){
                    String numReferencia = (String) vista.getModelo().getValueAt(filaSeleccionada, 0);
                    Producto productoComprado = modelo.getProducto(numReferencia);
                    productoComprado.setUnidadesDisponibles(unidadesDisponibles - vista.getPg3Pnt1().getjSpinnerValue());
                    JOptionPane.showMessageDialog(null, "¡Compra realizada con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    String nombre = (String) vista.getModelo().getValueAt(filaSeleccionada, 1);
                    Compra registroCompra = new Compra(modelo.getUsuarioActual(), nombre, vista.getPg3Pnt1().getjSpinnerValue(), calcularPrecio());
                    System.out.println(registroCompra.toString());
                    modelo.addCompra(registroCompra);
                    vista.mostrarPestanaClientes();
                    actualizarTablaProductos();
                }else{
                    JOptionPane.showMessageDialog(null, "No contamos con la cantidad suministrada que desea comprar, intente nuevamente con menor numero de productos ", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                }
   
            }
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vista.mostrarPestanaClientes();
                actualizarTablaProductos();
            } 
        }
    }
    
    public int calcularPrecio(){
        int precio = (int) vista.getModelo().getValueAt(filaSeleccionada, 3);
        int valorTotal = vista.getPg3Pnt1().getjSpinnerValue() * precio;
        return valorTotal;
    }
}
