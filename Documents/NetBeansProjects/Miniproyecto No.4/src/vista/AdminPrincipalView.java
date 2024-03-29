/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class AdminPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form AdminPrincipalView
     */
    
    //create border
    Border defaul_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(153,153,153));
    Border red_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 0, 102));

    //create an array of Jbuttons
    JButton[] buttons;
    
    public AdminPrincipalView() {
        initComponents();
        
        //center the form
        //this.setLocationRelativeTo(null);
        
        //add buttons to the array
        buttons = new JButton[5];
        buttons[0] = jButton1;
        buttons[1] = jButton2;
        buttons[2] = jButton4;
        buttons[3] = jButton5;
        buttons[4] = jButton6;
        
        //add border to the jbuttons
        for(JButton button : buttons){
            button.setBorder(defaul_border);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Clientes");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Proveedores");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Productos");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("Compras");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setText("Pedidos");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        jButton3.setText("Cerrar sesion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //create a unction to set border to the selectd menu itemn
    public void setButtonBoder(JButton boton){
        for(JButton button : buttons){
            button.setBorder(defaul_border);
            button.setForeground(new Color(153, 153, 153));
        }
        
        boton.setBorder(red_border);
        boton.setForeground(Color.black);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private Page1 pg1 = new Page1();
    private Page1Pnt2 pg1Pnt2 = new Page1Pnt2();
    private Page2 pg2 = new Page2();
    private Page2Pnt1 pg2Pnt1 = new Page2Pnt1();
    private Page2Pnt2 pg2Pnt2 = new Page2Pnt2();
    private PageComprasPrincipal pg3 = new PageComprasPrincipal();
    private PageProvedoresPrincipal pg4 = new PageProvedoresPrincipal();
    private PageProvedoresPgn2 pg4Pnt2 = new PageProvedoresPgn2();
    private PageProvedoresPgn3 pg4Pnt3 = new PageProvedoresPgn3();
    private PageProvedoresPgn4 pg4Pnt4 = new PageProvedoresPgn4();
    private PagePedidosPrincipal pg5 = new PagePedidosPrincipal();
    private PagePedidosPgn2 pg5Pgn2 = new PagePedidosPgn2();

    public void addBtonClienteListener(MouseListener listenControl){
        jButton1.addMouseListener(listenControl);
    }
    
    public void addBtonProductoListener(MouseListener listenControl){
        jButton4.addMouseListener(listenControl);
    }
    
    public void addBtonCompraListener(MouseListener listenControl){
        jButton5.addMouseListener(listenControl);
    }
    
    public void addBtonProvedoresListener(MouseListener listenControl){
        jButton2.addMouseListener(listenControl);
    }
    
    public void addBtonPedidosListener(MouseListener listenControl){
        jButton6.addMouseListener(listenControl);
    }
    
    public void addBtonClienteActionListener(ActionListener listenControl){
        jButton1.addActionListener(listenControl);
    }
    
    public void addBtonProductoActionListener(ActionListener listenControl){
        jButton4.addActionListener(listenControl);
    }
    
    public void addBtonComprasActionListener(ActionListener listenControl){
        jButton5.addActionListener(listenControl);
    }
    
    public void addBtonProvedoresActionListener(ActionListener listenControl){
        jButton2.addActionListener(listenControl);
    }
    
     public void addBtonPedidosActionListener(ActionListener listenControl){
        jButton6.addActionListener(listenControl);
    }
    
    public void addBtonCerrarSesionActionListener(ActionListener listenControl){
        jButton3.addActionListener(listenControl);
    }
    
    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton4;
    }

    public JButton getjButton4() {
        return jButton5;
    }

    public JButton getjButton5() {
        return jButton2;
    }

    public JButton getjButton6() {
        return jButton6;
    }
    
    public void mostrarPestanaClientes(){
        pg1.setSize(720, 368);
        pg1.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg1);
        content.revalidate();
        content.repaint();
    }
    
    public void addBtonEliminarUsuarioActionListener(ActionListener listenControl){
        pg1.getjButtonEliminarCliente().addActionListener(listenControl);
    }
    
    public void mostrarPestanaEliminarClientes(){
        pg1Pnt2.setSize(720, 368);
        pg1Pnt2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg1Pnt2);
        content.revalidate();
        content.repaint();
    }
    
    public void addBtonEliminarActionListener(ActionListener listenControl){
        pg1Pnt2.getjButtonEliminar().addActionListener(listenControl);
    }
    
    public void addBtonCancelarEliminarActionListener(ActionListener listenControl){
        pg1Pnt2.getjButtonCancelarEliminar().addActionListener(listenControl);
    }
    
    public Page1Pnt2 getPage1Pnt2(){
        return pg1Pnt2;
    }
    
    public void mostrarPestana2(){
        pg2.setSize(720, 368);
        pg2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg2);
        content.revalidate();
        content.repaint();
    }
    
    public Page2 getPage2(){
        return pg2;
    }
    
    public void setTextClientes(String texto){
        pg1.setjTextArea1(texto);
    }
        
    public void addBtonAgregarProductoActionListener(ActionListener listenControl){
        pg2.getjAgregarProductoButton1().addActionListener(listenControl);
    }
    
    public void addBtonActualizarProductoActionListener(ActionListener listenControl){
        pg2.getjButtonActualizarProducto().addActionListener(listenControl);
    }
    
    public void addBtonEliminarProductoActionListener(ActionListener listenControl){
        pg2.getjButtonEliminarProducto().addActionListener(listenControl);
    }
    
    public DefaultTableModel getModeloTablaPg2(){
        return pg2.getModelo();
    }
    
    public void mostrarPestanaSubirProductos(){
        pg2Pnt1.setSize(720, 368);
        pg2Pnt1.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg2Pnt1);
        content.revalidate();
        content.repaint();
    }
    
    public void addBtonaddProductoActionListener(ActionListener listenControl){
        pg2Pnt1.getjAgregarButton1().addActionListener(listenControl);
    }
    
    public void addBtonCerrarPage2Pnt1ActionListener(ActionListener listenControl){
        pg2Pnt1.getjCerrarButtonPage2Pnt1().addActionListener(listenControl);
    }
    
    public Page2Pnt1 getPage2Pnt1(){
        return pg2Pnt1;
    }
    
    public void mostrarPestanaActualizarProductos(){
        pg2Pnt2.setSize(720, 368);
        pg2Pnt2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg2Pnt2);
        content.revalidate();
        content.repaint();
    }
    
    public Page2Pnt2 getPg2Pnt2(){
        return pg2Pnt2;
    }
    
    public void addBtonActualizarActionListener(ActionListener listenControl){
        pg2Pnt2.getjButton1().addActionListener(listenControl);
    }
    
    public void addBtonCerrarActualizarActionListener(ActionListener listenControl){
        pg2Pnt2.getjButton2().addActionListener(listenControl);
    }
    
    public void mostrarPestanaComprasPrincipal(){
        pg3.setSize(720, 368);
        pg3.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg3);
        content.revalidate();
        content.repaint();
    }
    
    public void setTextCompras(String texto){
        pg3.setjTextAreaCompras(texto);
    }
    
    public void mostrarPestanaProvedoresPrincipal(){
        pg4.setSize(720, 368);
        pg4.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg4);
        content.revalidate();
        content.repaint();
    }
    
    public DefaultTableModel getModeloTablaPg4(){
        return pg4.getModelo();
    }
    
    public JTable getjTableProvedores() {
        return pg4.getjTableProvedores();
    }
    
    public void addBtonAgregarProvedorActionListener(ActionListener listenControl){
        pg4.getjButtonAgregarProvedor().addActionListener(listenControl);
    }
    
    public void addBtonCrearPedidoActionListener(ActionListener listenControl){
        pg4.getjButtonCrearPedido().addActionListener(listenControl);
    }
    
    public void addBtonActualizarProvedorActionListener(ActionListener listenControl){
        pg4.getjButtonActualizarProveedor().addActionListener(listenControl);
    }
    
    public void addBtonEliminarProvedorActionListener(ActionListener listenControl){
        pg4.getjButtonEliminarProveedor().addActionListener(listenControl);
    }
    
    public void mostrarPestanaProvedoresPgn2(){
        pg4Pnt2.setSize(720, 368);
        pg4Pnt2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg4Pnt2);
        content.revalidate();
        content.repaint();
    }
    
    public void addBtonaddProvedorActionListener(ActionListener listenControl){
        pg4Pnt2.getjButtonAgregar().addActionListener(listenControl);
    }
    
    public void addBtonCerrarPage4Pnt2ActionListener(ActionListener listenControl){
        pg4Pnt2.getjButtonCancelar().addActionListener(listenControl);
    }
    
    public PageProvedoresPgn2 getPg4Pnt2(){
        return pg4Pnt2;
    }
    
    public void mostrarPestanaProvedoresPgn3(){
        pg4Pnt3.setSize(720, 368);
        pg4Pnt3.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg4Pnt3);
        content.revalidate();
        content.repaint();
    }
    
    public PageProvedoresPgn3 getPg4Pnt3(){
        return pg4Pnt3;
    }
    
    public void addBtonSolicitarPedidoActionListener(ActionListener listenControl){
        pg4Pnt3.getjButtonSolicitarPedido().addActionListener(listenControl);
    }
    
    public void addBtonCancelarSolicitarPedidoActionListener(ActionListener listenControl){
        pg4Pnt3.getjButtonCancelarSolicitarPedido().addActionListener(listenControl);
    }
    
    public void mostrarPestanaProvedoresPgn4(){
        pg4Pnt4.setSize(720, 368);
        pg4Pnt4.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg4Pnt4);
        content.revalidate();
        content.repaint();
    }
    
    public PageProvedoresPgn4 getPg4Pnt4(){
        return pg4Pnt4;
    }
    
    public void addBtonActualizarProveedorActionListener(ActionListener listenControl){
        pg4Pnt4.getjButtonActualizar().addActionListener(listenControl);
    }
    
    public void addBtonCancelarActualizarProveedorActionListener(ActionListener listenControl){
        pg4Pnt4.getjButtonCancelar().addActionListener(listenControl);
    }
    
    public void mostrarPestanaPedidosPrincipal(){
        pg5.setSize(720, 368);
        pg5.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg5);
        content.revalidate();
        content.repaint();
    }
    
    public PagePedidosPrincipal getPg5(){
        return pg5;
    }
    
    public DefaultTableModel getModeloTablaPg5(){
        return pg5.getModelo();
    }
    
    public void addBtonActualizarPedidoActionListener(ActionListener listenControl){
        pg5.getjButtonActualizarPedido().addActionListener(listenControl);
    }
    
    public void addBtonEliminarPediActionListener(ActionListener listenControl){
        pg5.getjButtonEliminar().addActionListener(listenControl);
    }
    
    public void mostrarPestanaPedidosPgn2(){
        pg5Pgn2.setSize(720, 368);
        pg5Pgn2.setLocation(0, 0);
        
        content.removeAll();
        content.add(pg5Pgn2);
        content.revalidate();
        content.repaint();
    }
    
    public PagePedidosPgn2 getPg5Pnt2(){
        return pg5Pgn2;
    }
    
    public void addBtonActualizarPediActionListener(ActionListener listenControl){
        pg5Pgn2.getjButton1().addActionListener(listenControl);
    }
    
    public void addBtonCancelarActualizarPediActionListener(ActionListener listenControl){
        pg5Pgn2.getjButton2().addActionListener(listenControl);
    }
   
}
