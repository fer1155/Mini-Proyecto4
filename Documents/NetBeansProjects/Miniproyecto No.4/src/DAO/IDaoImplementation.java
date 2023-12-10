package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Compra;
import modelo.Pedido;
import modelo.Producto;
import modelo.Provedor;
import modelo.Usuario;


public class IDaoImplementation implements IDao{
    ArrayList<Usuario> clientes;
    ArrayList<Usuario> admins;
    ArrayList<Producto> productos;
    ArrayList<Compra> registroCompras;
    ArrayList<Provedor> provedores;
    ArrayList<Pedido> pedidos;
    private Usuario usuarioActual;

    public IDaoImplementation() {
        this.clientes = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.registroCompras = new ArrayList<>();
        this.provedores = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        Usuario usuarioAdmin = new Usuario("Fer", 1, "", "", "123", true); 
        admins.add(usuarioAdmin);
    }
    
    @Override
    public boolean addUsuario(Usuario usuario) {
        clientes.add(usuario);
        registrarUsuariostxt();
        return true;
    }

    @Override
    public Usuario getUsario(String usuarioNombre, String usuarioContraseña) {
        for(Usuario cliente : clientes) {
            if(usuarioNombre.equals(cliente.getNombre()) && usuarioContraseña.equals(cliente.getPassword())){
                return cliente;
            }                            
        }
        return null;
    }
    
    @Override
    public ArrayList<Usuario> getArrayClientes(){
        return clientes;
    }
    
    @Override
    public Usuario getAdmin(String adminNombre, String adminContraseña) {
        for(Usuario admin : admins) {
            if(adminNombre.equals(admin.getNombre()) && adminContraseña.equals(admin.getPassword())){
                return admin;
            }                            
        }
        return null;
    }

    @Override
    public Usuario getUsuarioXContrasena(String usuarioContraseña) {
        for(Usuario cliente : clientes) {
            if(usuarioContraseña.equals(cliente.getPassword())){
                return cliente;
            }                            
        }
        return null;
    }
    
    @Override
    public boolean deleteUsario(int idUsuarioAEliminar) {
        for(Usuario usuario : clientes) {
            if(idUsuarioAEliminar == usuario.getNumId()){
                clientes.remove(usuario);
                registrarUsuariostxt();
                return true;
            }                            
        }
        
        return false;
    }
    
    @Override
    public void updateUsuarios() {
        registrarUsuariostxt();
    }

    public boolean registrarUsuariostxt(){
        String rutaArchivo = "src/archivosTxt/Usuarios.txt";
        
        try{
            //FileWriter archivo = new FileWriter("Usuarios.txt", false);
            FileWriter archivo = new FileWriter(rutaArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            /*
            for(int i = 0; i < clientes.size() ; i++){
                bufferEscritor.write(clientes.get(i).toString());
                bufferEscritor.newLine(); 
            }*/
            for (Usuario usuario : clientes) {
                bufferEscritor.write("Nombre: " + usuario.getNombre());
                bufferEscritor.newLine();
                bufferEscritor.write("Número de identificación: " + usuario.getNumId());
                bufferEscritor.newLine();
                bufferEscritor.write("Correo: " + usuario.getCorreo());
                bufferEscritor.newLine();
                bufferEscritor.write("Dirección: " + usuario.getDireccion());
                bufferEscritor.newLine();
                bufferEscritor.write("Password: " + usuario.getPassword());
                bufferEscritor.newLine();
                bufferEscritor.newLine(); // Agregar una línea en blanco entre usuarios
            }
            bufferEscritor.flush();
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    @Override
    public boolean cargarUsuariostxt(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/archivosTxt/Usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    String nombre = linea.split(":")[1].trim();
                    int id = Integer.parseInt(br.readLine().split(":")[1].trim());
                    String correo = br.readLine().split(":")[1].trim();
                    String direccion = br.readLine().split(":")[1].trim();
                    String Password = br.readLine().split(":")[1].trim();


                    Usuario nuevoUsuario = new Usuario(nombre, id, correo, direccion, Password, false);
                    clientes.add(nuevoUsuario);
                }
                    
                
                /*

                //Divide la línea en atributos usando ","
                String[] atributos = linea.split(",");

                // Inicializa variables
                String nombre = null;
                int id = -1;

                
                // Procesa cada atributo
                for (String atributo : atributos) {
                    String[] partes = atributo.split(":");
                    String tipo = partes[0];
                    String valor = partes[1];

                    // Asigna valor al atributo correspondiente
                    switch (tipo) {
                        case "nombre":
                            nombre = valor;
                            break;
                        case "id":
                            id = Integer.parseInt(valor);
                            break;
                        // Puedes agregar más casos según tus necesidades
                    }
                }

                // Crea un objeto Persona y agrégalo a la lista
                Persona persona = new Persona(nombre, id);
                personas.add(persona);*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addProducto(Producto producto) {        
        productos.add(producto);
        registrarProductostxt();
        return true;
    }

    @Override
    public ArrayList<Producto> getArrayProductos() {    
        return productos;
    }

    @Override
    public Producto getProducto(String numSerie) {
        for(Producto producto : productos) {
            if(producto.getNumReferencia().equals(numSerie)){
                return producto;
            }                            
        }
        return null;
    }
    
    @Override
    public boolean deleteProducto(String numReferencia) {
        for(Producto producto : productos){
            if(producto.getNumReferencia().equals(numReferencia)){
                productos.remove(producto);
                registrarProductostxt();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void updateProductos() {
        registrarProductostxt();
    }
    
    public boolean registrarProductostxt(){
        String rutaArchivo = "src/archivosTxt/Productos.txt";
        try{
            //FileWriter archivo = new FileWriter("Productos.txt", false);
            FileWriter archivo = new FileWriter(rutaArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            for(int i = 0; i < productos.size() ; i++){
                bufferEscritor.write(productos.get(i).toString());
                bufferEscritor.newLine(); 
            }
            
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return false;
    }

    @Override
    public boolean addCompra(Compra registroCompra) {
        registroCompras.add(registroCompra);
        registrarComprastxt();
        return true;
    }

    @Override
    public ArrayList<Compra> getArrayCompras() {
        return registroCompras;
    }
    
    public boolean registrarComprastxt(){
        String rutaArchivo = "src/archivosTxt/RegistroCompras.txt";
        try{
            //FileWriter archivo = new FileWriter("RegistroCompras.txt", false);
            FileWriter archivo = new FileWriter(rutaArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            for(int i = 0; i < registroCompras.size() ; i++){
                bufferEscritor.write(registroCompras.get(i).toString());
                bufferEscritor.newLine(); 
            }
            
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return false;
    }

    @Override
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    @Override
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    @Override
    public boolean addProvedor(Provedor provedor) {
        provedores.add(provedor);
        registrarProveedortxt();
        return true;
    }

    @Override
    public ArrayList<Provedor> getArrayProvedores() {
        return provedores;
    }
    
    @Override
    public Provedor getProvedor(int id) {
        for(Provedor provedor : provedores) {
            if(provedor.getId() == id){
                return provedor;
            }                            
        }
        return null;
    }
    
    @Override
    public void updateProveedor() {
        registrarProveedortxt();
    }

    @Override
    public boolean deleteProveedor(int id) {
        for(Provedor provedor : provedores){
            if(provedor.getId() == id){
                provedores.remove(provedor);
                registrarProveedortxt();
                return true;
            }
        }
        return false;
    }
    
    public boolean registrarProveedortxt(){
        String rutaArchivo = "src/archivosTxt/Proveedores.txt";
        try{
            //FileWriter archivo = new FileWriter("Proveedores.txt", false);
            FileWriter archivo = new FileWriter(rutaArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            for(int i = 0; i < provedores.size() ; i++){
                bufferEscritor.write(provedores.get(i).toString());
                bufferEscritor.newLine(); 
            }
            
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean addPedido(Pedido pedido) {
        pedidos.add(pedido);
        registrarPedidotxt();
        return true;
    }

    @Override
    public ArrayList<Pedido> getArrayPedidos() {
        return pedidos;
    }

    @Override
    public Pedido getPedido(int id, String producto) {
        for(Pedido pedido : pedidos) {
            if(pedido.getIdProvedor()== id && pedido.getProducto().equals(producto)){
                return pedido;
            }                            
        }
        return null;
    }

    @Override
    public boolean deletePedido(int id, String producto) {
        for(Pedido pedido : pedidos){
            if(pedido.getIdProvedor()== id && pedido.getProducto().equals(producto)){
                pedidos.remove(pedido);
                registrarPedidotxt();
                return true;
            }
        }
        return false;
    }
    
    public boolean registrarPedidotxt(){
        String rutaArchivo = "src/archivosTxt/Pedidos.txt";
        try{
            //FileWriter archivo = new FileWriter("Pedidos.txt", false);
            FileWriter archivo = new FileWriter(rutaArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            for(int i = 0; i < pedidos.size() ; i++){
                bufferEscritor.write(pedidos.get(i).toString());
                bufferEscritor.newLine(); 
            }
            
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return false;
    }

    @Override
    public void updatePedido() {
        registrarPedidotxt();
    }
}
