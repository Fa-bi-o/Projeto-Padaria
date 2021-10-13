package view;

import DAO.DAOVenda;
import DAO.InterfaceDAOVenda;
import controller.ControllerVenda;
import controller.InterfaceControllerVenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ModelVenda;


public class ViewLogVenda extends javax.swing.JInternalFrame {

    ArrayList<ModelVenda> listaModelVenda = new ArrayList<>();
    
    InterfaceDAOVenda interfaceDAOVenda = new DAOVenda();
    InterfaceControllerVenda IControllerVenda = new ControllerVenda(interfaceDAOVenda);
    
    ModelVenda modelVenda = new ModelVenda();
    
    
    public ViewLogVenda() {
        initComponents();
        carregarProduto();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLogVenda = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Relatório de Vendas");
        setPreferredSize(new java.awt.Dimension(746, 503));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLogVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº Venda", "Data", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLogVenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 410));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void carregarProduto(){
        listaModelVenda = IControllerVenda.retornarListaVendaController();
        DefaultTableModel modelo = (DefaultTableModel) tblLogVenda.getModel();
        modelo.setNumRows(0);
        int cont = listaModelVenda.size();
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelVenda.get(i).getIdVenda(),
                listaModelVenda.get(i).getVenDataVenda(),
                //listaModelVenda.get(i).getVenValor(),
                listaModelVenda.get(i).getVenValorTotal()
            });
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLogVenda;
    // End of variables declaration//GEN-END:variables
}
