/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class PagePedidosPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form PagePedidosPrincipal
     */
    public PagePedidosPrincipal() {
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButtonActualizarPedido = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        modelo = new DefaultTableModel();
        modelo.addColumn("Provedor");
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("ValorUnitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("ValorTotal");
        jTablePedidos.setModel(modelo);
        jScrollPane4.setViewportView(jTablePedidos);

        jButtonActualizarPedido.setText("Actualizar Pedido");

        jButtonEliminar.setText("Eliminar Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButtonActualizarPedido)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizarPedido)
                    .addComponent(jButtonEliminar))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarPedido;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public JTable getjTablePedidos() {
        return jTablePedidos;
    }

    public JButton getjButtonEliminar() {
        return jButtonEliminar;
    }
    
    public JButton getjButtonActualizarPedido() {
        return jButtonActualizarPedido;
    }
    
}
