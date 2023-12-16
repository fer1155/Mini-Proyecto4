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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.AdminPrincipalModel;
import modelo.Compra;
import modelo.LoginModel;
import modelo.Pedido;
import modelo.Producto;
import modelo.Provedor;
import modelo.Usuario;
import vista.AdminPrincipalView;
import vista.LoginView;

public class AdminPrincipalController {
    private AdminPrincipalView vista;
    private AdminPrincipalModel modelo;
    private LoginView vistaLogin;
    private LoginModel modeloLogin;
    private LoginController controladorLogin;
    private int filaSeleccionadaPedido;
    private int filaSeleccionadaActualizarProducto;
    private int filaSeleccionadaEliminarProducto;
    private int filaSeleccionadaActualizarProveedor;
    private int filaSeleccionadaEliminarProveedor;
    private int filaSeleccionadaActualizarPedido;
    private boolean cargoInfo = false;

    public AdminPrincipalController(AdminPrincipalView vista, AdminPrincipalModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        actualizarTablaProductos();
        actualizarTablaProvedores();
        actualizarTablaPedidos();
        this.vista.addBtonClienteListener(new accionesMouseBton1());
        this.vista.addBtonProductoListener(new accionesMouseBton2());
        this.vista.addBtonCompraListener(new accionesMouseBton3());
        this.vista.addBtonProvedoresListener(new accionesMouseBton4());
        this.vista.addBtonPedidosListener(new accionesMouseBton5());
        this.vista.addBtonClienteActionListener(new acciones());
        this.vista.addBtonProductoActionListener(new acciones());
        this.vista.addBtonComprasActionListener(new acciones());
        this.vista.addBtonProvedoresActionListener(new acciones());
        this.vista.addBtonPedidosActionListener(new acciones());
        this.vista.addBtonCerrarSesionActionListener(new acciones());
        this.vista.addBtonEliminarUsuarioActionListener(new acciones4());
        this.vista.addBtonEliminarActionListener(new acciones4());
        this.vista.addBtonCancelarEliminarActionListener(new acciones4());
        this.vista.addBtonAgregarProductoActionListener(new acciones2());
        this.vista.addBtonActualizarProductoActionListener(new acciones2());
        this.vista.addBtonEliminarProductoActionListener(new acciones2());
        this.vista.addBtonaddProductoActionListener(new acciones2());
        this.vista.addBtonCerrarPage2Pnt1ActionListener(new acciones2());
        this.vista.addBtonActualizarActionListener(new acciones2());
        this.vista.addBtonCerrarActualizarActionListener(new acciones2());
        this.vista.addBtonAgregarProvedorActionListener(new acciones3());
        this.vista.addBtonaddProvedorActionListener(new acciones3());
        this.vista.addBtonCerrarPage4Pnt2ActionListener(new acciones3());
        this.vista.addBtonCrearPedidoActionListener(new acciones3());
        this.vista.addBtonSolicitarPedidoActionListener(new acciones3());
        this.vista.addBtonCancelarSolicitarPedidoActionListener(new acciones3());
        this.vista.addBtonActualizarProvedorActionListener(new acciones3());
        this.vista.addBtonActualizarProveedorActionListener(new acciones3());
        this.vista.addBtonCancelarActualizarProveedorActionListener(new acciones3());
        this.vista.addBtonEliminarProvedorActionListener(new acciones3());
        this.vista.addBtonActualizarPedidoActionListener(new acciones5());
        this.vista.addBtonActualizarPediActionListener(new acciones5());
        this.vista.addBtonCancelarActualizarPediActionListener(new acciones5());
        this.vista.addBtonEliminarPediActionListener(new acciones5());
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
    
    class accionesMouseBton5 extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            vista.setButtonBoder(vista.getjButton6());
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
            
            if(e.getActionCommand().equalsIgnoreCase("Compras")){
                ArrayList<Compra> compras = modelo.obtenerCompras();
                String texto = "";
                int num = 1;
                for(Compra compra : compras){
                    texto += num + ") "+ compra.toString() + "\n";
                    num += 1;
                }
                
                texto += "\n Ganancias totales: " + calcularGanancias();
                vista.mostrarPestanaComprasPrincipal();
                vista.setTextCompras(texto);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Proveedores")){
                vista.mostrarPestanaProvedoresPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Pedidos")){
                vista.mostrarPestanaPedidosPrincipal();
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
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR PRODUCTO")){
                vista.getPage2Pnt1().setjTextField1("");
                vista.getPage2Pnt1().setjTextField2("");
                vista.getPage2Pnt1().setjTextField4("");
                vista.getPage2Pnt1().setjSpinner1(0);
                vista.mostrarPestanaSubirProductos();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                if(verificarCamposVaciosIngresarProducto() == false){
                    try{
                        int precio = parseInt(vista.getPage2Pnt1().getjTextField4().getText());
                        Producto productoAIngresar = new Producto(vista.getPage2Pnt1().getjTextField1().getText(), vista.getPage2Pnt1().getjTextField2().getText(),(int) vista.getPage2Pnt1().getjSpinner1().getValue(), precio);
                        modelo.registrarProducto(productoAIngresar);
                        JOptionPane.showMessageDialog(null, "¡Producto agregado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        actualizarTablaProductos();
                        vista.mostrarPestana2();   
                    }catch(NumberFormatException exc){
                        JOptionPane.showMessageDialog(null, "El precio suministrado contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                    } 
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("CERRAR")){
                vista.mostrarPestana2();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("ACTUALIZAR PRODUCTO")){
                filaSeleccionadaActualizarProducto = vista.getPage2().getjTable2().getSelectedRow();
                if (filaSeleccionadaActualizarProducto != -1) {
                    String nombre = (String) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaActualizarProducto, 1);
                    String numReferencia = (String) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaActualizarProducto, 0);
                    int unidadesDisponibles = (int) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaActualizarProducto, 2);
                    int precio = (int) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaActualizarProducto, 3);
                    vista.getPg2Pnt2().setjTextField1(numReferencia);
                    vista.getPg2Pnt2().setjTextField2(nombre);
                    vista.getPg2Pnt2().setjTextField4(valueOf(precio));
                    vista.getPg2Pnt2().setjSpinner1(unidadesDisponibles);
                    vista.mostrarPestanaActualizarProductos();
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("ACTUALIZAR")){
                try{
                    int precio = parseInt(vista.getPg2Pnt2().getjTextField4().getText());
                    String numReferencia = (String) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaActualizarProducto, 0);
                    Producto productoAActualizar = modelo.getProducto(numReferencia);
                    productoAActualizar.setNombre(vista.getPg2Pnt2().getjTextField2().getText());
                    productoAActualizar.setNumReferencia(vista.getPg2Pnt2().getjTextField1().getText());
                    productoAActualizar.setPrecio(precio);
                    productoAActualizar.setUnidadesDisponibles((int) vista.getPg2Pnt2().getjSpinner1().getValue());
                    modelo.updateProductos();
                    actualizarTablaProductos();
                    JOptionPane.showMessageDialog(null, "Producto actualizado con exito", "Info", JOptionPane.INFORMATION_MESSAGE);
                    vista.mostrarPestana2();  
                }catch(NumberFormatException exc){
                    JOptionPane.showMessageDialog(null, "El precio suministrado contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                } 
            }
            
            if(e.getActionCommand().equalsIgnoreCase("CANCELAR ACTUALIZACION")){
                vista.mostrarPestana2();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR PRODUCTO")){
                filaSeleccionadaEliminarProducto = vista.getPage2().getjTable2().getSelectedRow();                
                if (filaSeleccionadaEliminarProducto != -1) {
                    String nombre = (String) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaEliminarProducto, 1);
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Esta segur@ de eliminar el producto " + nombre + "?", "Pregunta", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {   
                        String numReferencia = (String) vista.getModeloTablaPg2().getValueAt(filaSeleccionadaEliminarProducto, 0);
                        modelo.deleteProducto(numReferencia);
                        JOptionPane.showMessageDialog(null, "¡Producto Eliminado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        actualizarTablaProductos();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    
    class acciones3 implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR PROVEEDOR")){
                vista.getPg4Pnt2().getjTextField1().setText("");
                vista.getPg4Pnt2().getjTextField2().setText("");
                vista.getPg4Pnt2().getjTextField3().setText("");
                vista.getPg4Pnt2().getjTextField4().setText("");
                vista.getPg4Pnt2().getjTextField5().setText("");
                vista.getPg4Pnt2().getjTextField6().setText("");
                vista.mostrarPestanaProvedoresPgn2();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                if(verificarCamposVaciosIngresarProvedor() == false){
                    try{
                        int id = parseInt(vista.getPg4Pnt2().getjTextField1().getText());
                        int telefono = parseInt(vista.getPg4Pnt2().getjTextField3().getText());
                        int precioProducto = parseInt(vista.getPg4Pnt2().getjTextField6().getText());
                        Provedor provedorAIngresar = new Provedor(id, vista.getPg4Pnt2().getjTextField2().getText(), telefono, vista.getPg4Pnt2().getjTextField4().getText(), vista.getPg4Pnt2().getjTextField5().getText(),precioProducto);
                        modelo.registrarProvedor(provedorAIngresar);
                        JOptionPane.showMessageDialog(null, "¡Proveedor agregado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        actualizarTablaProvedores();
                        vista.mostrarPestanaProvedoresPrincipal();
                    }catch(NumberFormatException exc){
                        JOptionPane.showMessageDialog(null, "El ID, Telefono o valorDeProducto suministrados contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                        //System.out.println(exc);
                    } 
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vista.mostrarPestanaProvedoresPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Crear Pedido")){
                filaSeleccionadaPedido = vista.getjTableProvedores().getSelectedRow();
                if (filaSeleccionadaPedido != -1) {
                    int id = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,0);
                    String nombreProvedor = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,1);
                    String productoAVender = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,4);
                    int valorProductoAVender = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,5);
                    vista.getPg4Pnt3().setjLabel2(nombreProvedor);
                    vista.getPg4Pnt3().setjLabel4(valueOf(id));
                    vista.getPg4Pnt3().setjLabel6(productoAVender);
                    vista.getPg4Pnt3().setjLabel8(valueOf(valorProductoAVender));
                    vista.getPg4Pnt3().getjSpinner1().setValue(0);

                    vista.mostrarPestanaProvedoresPgn3();
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Solicitar Pedido")){
                String nombreProvedor = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,1);
                int id = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,0);
                String productoAVender = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,4);
                int valorProductoAVender = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaPedido,5);
                int cantidad = (int) vista.getPg4Pnt3().getjSpinner1().getValue();
                Pedido pedidoAIngreaar = new Pedido(nombreProvedor, id, productoAVender, valorProductoAVender, cantidad, cantidad*valorProductoAVender);
                modelo.registrarPedido(pedidoAIngreaar);
                JOptionPane.showMessageDialog(null, "¡Pedido exitoso!, el proveedor pronto enviara el producto solicitado", "Info", JOptionPane.INFORMATION_MESSAGE);
                vista.mostrarPestanaProvedoresPrincipal();
                actualizarTablaPedidos();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar Pedido")){
                vista.mostrarPestanaProvedoresPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Actualizar info proveedor")){
                filaSeleccionadaActualizarProveedor = vista.getjTableProvedores().getSelectedRow();
                if (filaSeleccionadaActualizarProveedor != -1) {
                    String nombre = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 1);
                    int id = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 0);
                    int telefono = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 2);
                    String direccion = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 3);
                    String producto = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 4);
                    int valorProducto = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 5);
                    vista.getPg4Pnt4().setjTextField1(valueOf(id));
                    vista.getPg4Pnt4().setjTextField2(nombre);
                    vista.getPg4Pnt4().setjTextField3(valueOf(telefono));
                    vista.getPg4Pnt4().setjTextField4(direccion);
                    vista.getPg4Pnt4().setjTextField5(producto);
                    vista.getPg4Pnt4().setjTextField6(valueOf(valorProducto));
                    
                    vista.mostrarPestanaProvedoresPgn4();
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Actualizar")){
                try{
                    int id = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaActualizarProveedor, 0);
                    Provedor provedor = modelo.getProvedor(id);
                    int idNuevo = parseInt(vista.getPg4Pnt4().getjTextField1().getText());
                    int telefono = parseInt(vista.getPg4Pnt4().getjTextField3().getText());
                    int valorProducto = parseInt(vista.getPg4Pnt4().getjTextField6().getText());
                    provedor.setId(idNuevo);
                    provedor.setNombre(vista.getPg4Pnt4().getjTextField2().getText());
                    provedor.setTelefono(telefono);
                    provedor.setDireccion(vista.getPg4Pnt4().getjTextField4().getText());
                    provedor.setProductoAVender(vista.getPg4Pnt4().getjTextField5().getText());
                    provedor.setValorProductoAVender(valorProducto);
                    modelo.updateProveedor();
                    actualizarTablaProvedores();
                    JOptionPane.showMessageDialog(null, "Proveedor actualizado con exito", "Info", JOptionPane.INFORMATION_MESSAGE);
                    vista.mostrarPestanaProvedoresPrincipal();
                }catch(NumberFormatException exc){
                    JOptionPane.showMessageDialog(null, "El ID, Telefono o valorDelProducto suministrados contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar actualizacion")){
                vista.mostrarPestanaProvedoresPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Eliminar Proveedor")){
                filaSeleccionadaEliminarProveedor = vista.getjTableProvedores().getSelectedRow();
                               
                if (filaSeleccionadaEliminarProveedor != -1) {
                    String nombre = (String) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaEliminarProveedor, 1);
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Esta segur@ de eliminar al proveedor " + nombre + "?", "Pregunta", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        int id = (int) vista.getModeloTablaPg4().getValueAt(filaSeleccionadaEliminarProveedor, 0);
                        modelo.deleteProveedor(id);
                        JOptionPane.showMessageDialog(null, "¡Proveedor Eliminado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        actualizarTablaProvedores();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    
    class acciones4 implements ActionListener{ 
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Eliminar Usuario")){
                vista.mostrarPestanaEliminarClientes();
                vista.getPage1Pnt2().setjTextField1("");
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Eliminar")){
                try{
                    int id = parseInt(vista.getPage1Pnt2().getjTextField1().getText());
                    
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Esta segur@ de eliminar al usuario con ID " + id + "?", "Pregunta", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {   
                        if(modelo.deleteUsario(id) == true){
                            ArrayList<Usuario> clientes = modelo.obtenerClientes();
                            String texto = "";

                            int num = 1;
                            for(Usuario cliente : clientes){
                                texto += num + ") "+ cliente.toString() + "\n";
                                num += 1;
                            }

                            vista.setTextClientes(texto);
                            JOptionPane.showMessageDialog(null, "¡Usuario Eliminado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                            vista.mostrarPestanaClientes(); 
                        }else{
                            JOptionPane.showMessageDialog(null, "El ID suministrado no se encuentra", "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }catch(NumberFormatException exc){
                    JOptionPane.showMessageDialog(null, "El ID suministrado contiene caracteres incorrectos, ingrese únicamente números", "Alerta", JOptionPane.WARNING_MESSAGE);
                } 
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vista.mostrarPestanaClientes();
            }
        }
    }

    class acciones5 implements ActionListener{         

        private int filaSeleccionadaEliminarPedido;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Actualizar Pedido")){
                filaSeleccionadaActualizarPedido = vista.getPg5().getjTablePedidos().getSelectedRow();
                if (filaSeleccionadaActualizarPedido != -1) {
                    String nombre = (String) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 0);
                    int id = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 1);
                    String producto = (String) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarProveedor, 2);
                    int valorProducto = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarProveedor, 3);
                    int unidades = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarProveedor, 4);
                    vista.getPg5Pnt2().setjLabel2(nombre);
                    vista.getPg5Pnt2().setjLabel4(valueOf(id));
                    vista.getPg5Pnt2().setjLabel6(producto);
                    vista.getPg5Pnt2().setjLabel8(valueOf(valorProducto));
                    vista.getPg5Pnt2().setjLabel11(valueOf(unidades));
                    vista.getPg5Pnt2().getjSpinner1().setValue(0);
                    
                    vista.mostrarPestanaPedidosPgn2();
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Actualizar")){
                int id = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 1);
                String producto = (String) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 2);
                int valorProducto = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 3);
                Pedido pedido = modelo.getPedido(id, producto);
                int cantidad = (int) vista.getPg5Pnt2().getjSpinner1().getValue();
                pedido.setCantidadPedido(cantidad);
                pedido.setPrecioTotalPedido(cantidad * valorProducto);
                modelo.updatePedido();
                actualizarTablaPedidos();
                JOptionPane.showMessageDialog(null, "Pedido actualizado con exito", "Info", JOptionPane.INFORMATION_MESSAGE);
                vista.mostrarPestanaPedidosPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Cancelar")){
                vista.mostrarPestanaPedidosPrincipal();
            }
            
            if(e.getActionCommand().equalsIgnoreCase("Eliminar Pedido")){
                filaSeleccionadaEliminarPedido = vista.getPg5().getjTablePedidos().getSelectedRow();    
                if (filaSeleccionadaEliminarPedido != -1) {                    
                    int id = (int) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 1);
                    String producto = (String) vista.getModeloTablaPg5().getValueAt(filaSeleccionadaActualizarPedido, 2);
                   
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Esta segur@ de eliminar el Pedido?", "Pregunta", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        modelo.deletePedido(id, producto);
                        JOptionPane.showMessageDialog(null, "¡Pedido Eliminado con exito!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        actualizarTablaPedidos();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No hay fila seleccionada", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
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
    
    public void actualizarTablaProvedores(){
        int rowCount = vista.getModeloTablaPg4().getRowCount();

        // Eliminar todas las filas
        for (int i = rowCount - 1; i >= 0; i--) {
            vista.getModeloTablaPg4().removeRow(i);
        }
        
        ArrayList<Provedor> provedores = modelo.obtenerProvedores();
                
        for(Provedor provedorAIngresar : provedores){
            agregarFilaATabla(provedorAIngresar);
        }
    }
    
    public void agregarFilaATabla(Provedor provedor){
        Object[] fila = {
            provedor.getId(),
            provedor.getNombre(),
            provedor.getTelefono(),
            provedor.getDireccion(),
            provedor.getProductoAVender(),
            provedor.getValorProductoAVender()
        };
        
        vista.getModeloTablaPg4().addRow(fila);
    }
    
    public void actualizarTablaPedidos(){
        int rowCount = vista.getModeloTablaPg5().getRowCount();

        // Eliminar todas las filas
        for (int i = rowCount - 1; i >= 0; i--) {
            vista.getModeloTablaPg5().removeRow(i);
        }
        
        ArrayList<Pedido> pedidos = modelo.obtenerPedidos();
                
        for(Pedido pedidoAIngresar : pedidos){
            agregarFilaATabla(pedidoAIngresar);
        }
    }
    
    public void agregarFilaATabla(Pedido pedido){
        Object[] fila = {
            pedido.getNombreProvedor(),
            pedido.getIdProvedor(),
            pedido.getProducto(),
            pedido.getPrecioProducto(),
            pedido.getCantidadPedido(),
            pedido.getPrecioTotalPedido()
        };
        
        vista.getModeloTablaPg5().addRow(fila);
    }
    
    public int calcularGanancias(){
        int ganacias = 0;
        
        ArrayList<Compra> compras = modelo.obtenerCompras();
        for(Compra compra : compras){
            ganacias += compra.getPrecioTotalComprado();
        }
        return ganacias;
    }
    
    public boolean verificarCamposVaciosIngresarProducto(){
        if("".equals(vista.getPage2Pnt1().getjTextField1().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el numero de referencia del producto, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPage2Pnt1().getjTextField2().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el nombre del producto, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if(0 == (int) vista.getPage2Pnt1().getjSpinner1().getValue()){
            JOptionPane.showMessageDialog(null, "Falta ingresar la cantidad de unidades del producto, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPage2Pnt1().getjTextField4().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el precio del producto, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    public boolean verificarCamposVaciosIngresarProvedor(){
        if("".equals(vista.getPg4Pnt2().getjTextField1().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el ID del proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPg4Pnt2().getjTextField2().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el nombre del proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPg4Pnt2().getjTextField3().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el telefono del proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPg4Pnt2().getjTextField4().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar la direccion del proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPg4Pnt2().getjTextField5().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el producto que suministra el proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }else if("".equals(vista.getPg4Pnt2().getjTextField6().getText())){
            JOptionPane.showMessageDialog(null, "Falta ingresar el valor del producto que suministra el proveedor, por favor rellenelo", "Alerta", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    /*
    public void cargarInfo(){
        modelo.cargarUsuariostxt();
        modelo.cargarProductotxt();
        modelo.cargarComprastxt();
        modelo.cargarProvedorestxt();
        modelo.cargarPedidostxt();
        actualizarTablaProductos();
        actualizarTablaProvedores();
        actualizarTablaPedidos();
        JOptionPane.showMessageDialog(null, "¡La informacion se cargo correctamente!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }*/
}
