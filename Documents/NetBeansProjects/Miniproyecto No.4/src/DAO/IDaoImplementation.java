package DAO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Usuario;


public class IDaoImplementation implements IDao{
    ArrayList<Usuario> clientes;
    ArrayList<Usuario> admins;
    private Usuario usuarioActual;

    public IDaoImplementation() {
        this.clientes = new ArrayList<>();
        this.admins = new ArrayList<>();
        Usuario usuarioAdmin = new Usuario("Fer", 1, "", "", "123", true); 
        admins.add(usuarioAdmin);
    }
    
    @Override
    public boolean addUsuario(Usuario usuario) {
        System.out.println(usuario);
        clientes.add(usuario);
        
        /*
        try{
            FileWriter archivo = new FileWriter("prueba.txt", false);
            BufferedWriter bufferEscritor = new BufferedWriter(archivo);
            
            for(int i = 0; i < clientes.size() ; i++){
                bufferEscritor.write(clientes.get(i).toString());
                bufferEscritor.newLine(); 
            }
            bufferEscritor.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }*/
        
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
    public Usuario getAdmin(String adminNombre, String adminContraseña) {
        for(Usuario admin : admins) {
            if(adminNombre.equals(admin.getNombre()) && adminContraseña.equals(admin.getPassword())){
                return admin;
            }                            
        }
        return null;
    }

    @Override
    public boolean updateUsuario(Usuario personaConDatosActualizados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteUsario(String idUsuarioAEliminar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}