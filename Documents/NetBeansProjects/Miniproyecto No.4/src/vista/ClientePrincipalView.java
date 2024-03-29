/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class ClientePrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form ClientePrincipalView
     */
    public ClientePrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientePrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
    private Page3 pg3 = new Page3();
    private Page3Pnt1 pg3Pnt1 = new Page3Pnt1();
    private Page3Pnt2 pg3Pnt2 = new Page3Pnt2();
    private Page3Pnt3 pg3Pnt3 = new Page3Pnt3();

    public DefaultTableModel getModelo() {
        return pg3.getModelo();
    }
    
    public JTable getjTable1() {
        return pg3.getjTable1();
    }
    
    public void mostrarPestanaClientes(){
        pg3.setSize(720, 368);
        pg3.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg3);
        content.revalidate();
        content.repaint();
    }
    
    public void addBtonComprarProductoActionListener(ActionListener listenControl){
        pg3.getjButtonComprarProducto().addActionListener(listenControl);
    }
    
    public void addBtonCerrarSesionActionListener(ActionListener listenControl){
        pg3.getjButtonCerrarSesion().addActionListener(listenControl);
    }
    
    public void addBtonActualizarInfoActionListener(ActionListener listenControl){
        pg3.getjButtonActInfo().addActionListener(listenControl);
    }
    
    public void addBtonVerRegistroActionListener(ActionListener listenControl){
        pg3.getjButtonRegistroPersonal().addActionListener(listenControl);
    }
    
    public void mostrarPestanaComprarProductos(){
        pg3Pnt1.setSize(720, 368);
        pg3Pnt1.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg3Pnt1);
        content.revalidate();
        content.repaint();
    }

    public Page3Pnt1 getPg3Pnt1() {
        return pg3Pnt1;
    }
    
    public void addBtonComprarActionListener(ActionListener listenControl){
        pg3Pnt1.getjButtonComprar().addActionListener(listenControl);
    }
    
    public void addBtonCancelarActionListener(ActionListener listenControl){
        pg3Pnt1.getjButtonCancelar().addActionListener(listenControl);
    }
    
    public void mostrarPestanaActualizarInfo(){
        pg3Pnt2.setSize(720, 368);
        pg3Pnt2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg3Pnt2);
        content.revalidate();
        content.repaint();
    }
    
    public Page3Pnt2 getPg3Pnt2() {
        return pg3Pnt2;
    }
    
    public void addBtonActualizarActionListener(ActionListener listenControl){
        pg3Pnt2.getjButtonActualizar().addActionListener(listenControl);
    }
    
    public void addBtonCancelarActualizarActionListener(ActionListener listenControl){
        pg3Pnt2.getjButtonCancelar().addActionListener(listenControl);
    }
    
    public void mostrarPestanaRegistroCompras(){
        pg3Pnt3.setSize(720, 368);
        pg3Pnt3.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg3Pnt3);
        content.revalidate();
        content.repaint();
    }
    
    public Page3Pnt3 getPg3Pnt3() {
        return pg3Pnt3;
    }
    
    public void addBtonCancelarVerMisComprasActionListener(ActionListener listenControl){
        pg3Pnt3.getjButtonSalir().addActionListener(listenControl);
    }
}
