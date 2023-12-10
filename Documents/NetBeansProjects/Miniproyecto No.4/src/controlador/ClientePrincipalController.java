package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ClientePrincipalModel;
import modelo.Compra;
import modelo.Producto;
import modelo.Usuario;
import vista.ClientePrincipalView;
import vista.LoginView;

public class ClientePrincipalController {
    private ClientePrincipalView vista;
    private ClientePrincipalModel modelo;
    private int filaSeleccionada; 
    private LoginView vistaLogin;
    private LoginController controladorLogin;
    private Usuario usuarioActual;

    public ClientePrincipalController(ClientePrincipalView vista, ClientePrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.mostrarPestanaClientes();
        actualizarTablaProductos();
        vista.addBtonComprarProductoActionListener(new acciones());
        vista.addBtonCerrarSesionActionListener(new acciones());
        vista.addBtonActualizarInfoActionListener(new acciones());
        vista.addBtonVerRegistroActionListener(new acciones());
        vista.addBtonComprarActionListener(new acciones2());
        vista.addBtonCancelarActionListener(new acciones2());
        vista.addBtonActualizarActionListener(new acciones3());
        vista.addBtonCancelarActualizarActionListener(new acciones3());
        vista.addBtonCancelarVerMisComprasActionListener(new acciones4());
    }
    
    public void actualizarTablaProductos(){
        int rowCount = vista.getModelo().getRowCount();

        // Eliminar todas las filas
        for (int i = rowCount - 1; i >= 0; i--) {
            vista.getModelo().removeRow(i);
        }
        
        ArrayList<Producto> productos = modelo.obtenerProductos();

        quitarProductosUnidades0();
        
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

    private boolean quitarProductosUnidades0() {
        ArrayList<Producto> productos = modelo.obtenerProductos();
        
        for(Producto productoARevisar : productos){
            if(productoARevisar.getUnidadesDisponibles() == 0){
                modelo.deleteProducto(productoARevisar.getNumReferencia());
                return true;
            }
        }

        return false;
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
                    vista.getPg3Pnt1().setjSpinner1(0);
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
            
            if(e.getActionCommand().equalsIgnoreCase("Editar Perfil")){
                usuarioActual = modelo.getUsuarioActual();
                vista.getPg3Pnt2().setjTextField1(usuarioActual.getNombre());
                vista.getPg3Pnt2().setjTextField2(usuarioActual.getCorreo());
                vista.getPg3Pnt2().setjTextField3(usuarioActual.getDireccion());
                vista.getPg3Pnt2().setjTextField4(usuarioActual.getPassword());
                vista.mostrarPestanaActualizarInfo();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Registro personal de compras")){
                usuarioActual = modelo.getUsuarioActual();
                ArrayList<Compra> compras = modelo.getArrayCompras();
                String texto = "";
                int num = 1;
                for(Compra compra: compras){
                    if(usuarioActual.getNumId() == compra.getNumId()){
                        texto += num + ") "+ "Producto: " + compra.getProducto()+ " Unidades compradas: " + compra.getUnidadesCompradas() + " Precio total: " + compra.getPrecioTotalComprado() + "\n";
                        num += 1;
                    }
                }
                
                vista.getPg3Pnt3().getjTextAreaRegistroCompras().setText(texto);
                vista.mostrarPestanaRegistroCompras();
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
    
    class acciones3 implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Actualizar")){
                Usuario usarioAActualizar = modelo.getUsuario(usuarioActual.getNombre(), usuarioActual.getPassword());
                usarioAActualizar.setNombre(vista.getPg3Pnt2().getjTextField1().getText());
                usarioAActualizar.setCorreo(vista.getPg3Pnt2().getjTextField2().getText());
                usarioAActualizar.setDireccion(vista.getPg3Pnt2().getjTextField3().getText());
                usarioAActualizar.setPassword(vista.getPg3Pnt2().getjTextField4().getText());
                modelo.updateUsuarios();
                JOptionPane.showMessageDialog(null, "Perfil actualizado con exito", "Info", JOptionPane.INFORMATION_MESSAGE);
                vista.mostrarPestanaClientes();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vista.mostrarPestanaClientes();
                actualizarTablaProductos();
            }
        }
    }
    
    class acciones4 implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Salir")){
                vista.mostrarPestanaClientes();
            }
        }
    }
    
    public int calcularPrecio(){
        int precio = (int) vista.getModelo().getValueAt(filaSeleccionada, 3);
        int valorTotal = vista.getPg3Pnt1().getjSpinnerValue() * precio;
        return valorTotal;
    }
}
