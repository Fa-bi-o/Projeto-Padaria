package view;

import DAO.DAOProduto;
import DAO.DAOVenda;
import DAO.InterfaceDAOProduto;
import DAO.InterfaceDAOVenda;
import controller.ControllerProduto;
import controller.ControllerVenda;
import controller.InterfaceControllerProduto;
import controller.InterfaceControllerVenda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import model.ModelVenda;
import util.FormatadorData;

public class ViewVenda extends javax.swing.JInternalFrame {
            
    InterfaceDAOProduto interfaceDAO = new DAOProduto();
    InterfaceControllerProduto IControllerProduto = new ControllerProduto(interfaceDAO);
    
    InterfaceDAOVenda interfaceDAOVenda = new DAOVenda();
    InterfaceControllerVenda IControllerVenda = new ControllerVenda(interfaceDAOVenda);

    
    ModelProduto modelProduto = new ModelProduto();
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    ModelVenda modelVenda = new ModelVenda();
    FormatadorData fData = new FormatadorData();

    public ViewVenda() {
        initComponents();
        listarProduto();
        preencherCodigoProdutoCombobox();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        txtProdVenCodProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProdVenQuantidade = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutoVenda = new javax.swing.JTable();
        btnProdVenCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnProdVenSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbVendaProdutoListProduto = new componentes.UJComboBox();
        btnProdVenAdicionar = new javax.swing.JButton();
        txtProdVenValTotal = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Caixa");
        setPreferredSize(new java.awt.Dimension(758, 538));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cód. Prod:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtProdVenCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdVenCodProdutoFocusLost(evt);
            }
        });
        txtProdVenCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdVenCodProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdVenCodProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 97, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtProdVenQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdVenQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdVenQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 97, 26));

        tblProdutoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Prod.", "Nome Produto", "Quantidade", "Valor Un.", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutoVenda);
        if (tblProdutoVenda.getColumnModel().getColumnCount() > 0) {
            tblProdutoVenda.getColumnModel().getColumn(0).setMinWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(1).setMinWidth(200);
            tblProdutoVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblProdutoVenda.getColumnModel().getColumn(2).setMinWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(3).setMinWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(4).setMinWidth(70);
            tblProdutoVenda.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, 720, 270));

        btnProdVenCancelar.setText("Cancelar");
        btnProdVenCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdVenCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdVenCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        btnProdVenSalvar.setText("Salvar");
        btnProdVenSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdVenSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdVenSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Valor Total:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLabel6.setText("Produto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        cmbVendaProdutoListProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbVendaProdutoListProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbVendaProdutoListProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendaProdutoListProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbVendaProdutoListProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 420, -1));

        btnProdVenAdicionar.setText("Adicionar");
        btnProdVenAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdVenAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdVenAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        txtProdVenValTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdVenValTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdVenValTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 97, -1));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        setBounds(0, 0, 746, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtProdVenQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdVenQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdVenQuantidadeActionPerformed

    private void btnProdVenSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdVenSalvarActionPerformed
        int codigoVenda = 0;
        try {
            // TODO add your handling code here:
            modelVenda.setVenDataVenda(fData.converterDataParaDate(new java.util.Date(System.currentTimeMillis())));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        modelVenda.setVenValorTotal(Double.parseDouble(txtProdVenValTotal.getText()));

        codigoVenda = IControllerVenda.salvarVendaController(modelVenda);
        if(codigoVenda > 0){
            JOptionPane.showMessageDialog(this, "Venda armazenada com sucesso");
            limparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Falha na tentativa de armazenar a venda");
        }
    }//GEN-LAST:event_btnProdVenSalvarActionPerformed

    private void btnProdVenAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdVenAdicionarActionPerformed
        // TODO add your handling code here:
        if(txtProdVenQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        }else{
            modelProduto = IControllerProduto.retornarProdutoController(Integer.parseInt(txtProdVenCodProduto.getText()));
            DefaultTableModel modelo = (DefaultTableModel) tblProdutoVenda.getModel();
            int cont = 0;
            double quantidade = 0;
            quantidade = Double.parseDouble(txtProdVenQuantidade.getText());
            for(int i = 0; i < cont; i++){
                modelo.setNumRows(0);
            }
            modelo.addRow(new Object[]{
                modelProduto.getIdProduto(),
                modelProduto.getProNome(),
                txtProdVenQuantidade.getText(),
                modelProduto.getProValor(),
                quantidade * modelProduto.getProValor()
            });
            somarValorTotalProdutos();
        }
    }//GEN-LAST:event_btnProdVenAdicionarActionPerformed

    private void txtProdVenValTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdVenValTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdVenValTotalActionPerformed

    private void txtProdVenCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdVenCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdVenCodProdutoActionPerformed

    private void txtProdVenCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdVenCodProdutoFocusLost
        // TODO add your handling code here:
        modelProduto = IControllerProduto.retornarProdutoController(Integer.parseInt(txtProdVenCodProduto.getText()));
        cmbVendaProdutoListProduto.setSelectedItem(modelProduto.getProNome());
    }//GEN-LAST:event_txtProdVenCodProdutoFocusLost

    private void btnProdVenCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdVenCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnProdVenCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbVendaProdutoListProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendaProdutoListProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVendaProdutoListProdutoActionPerformed

    private void cmbVendaProdutoListProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbVendaProdutoListProdutoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (cmbVendaProdutoListProduto.isVisible()) {
            modelProduto = IControllerProduto.retornarProdutoController(cmbVendaProdutoListProduto.getSelectedItem().toString());
            txtProdVenCodProduto.setText(String.valueOf(modelProduto.getIdProduto()));
        }
    }//GEN-LAST:event_cmbVendaProdutoListProdutoPopupMenuWillBecomeInvisible

    private void limparCampos(){
        txtProdVenQuantidade.setText("");
        txtProdVenValTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblProdutoVenda.getModel();
        modelo.setNumRows(0);
    }
    
    private void preencherCodigoProdutoCombobox(){
        modelProduto = IControllerProduto.retornarProdutoController(cmbVendaProdutoListProduto.getSelectedItem().toString());
            txtProdVenCodProduto.setText(String.valueOf(modelProduto.getIdProduto()));
    }
    
    private void somarValorTotalProdutos(){
        double soma = 0, valor;
        int cont = tblProdutoVenda.getRowCount();
        for (int i = 0; i < cont;  i++){
            valor = (double) tblProdutoVenda.getValueAt(i, 4);
            soma = soma + valor;
        }
        txtProdVenValTotal.setText(String.valueOf(soma));
    }
    
    private void listarProduto() {
        listaModelProduto = IControllerProduto.retornarListaProdutoController();
        cmbVendaProdutoListProduto.removeAllItems();
        for (int i = 0; i < listaModelProduto.size(); i++) {
            cmbVendaProdutoListProduto.addItem(listaModelProduto.get(i).getProNome());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProdVenAdicionar;
    private javax.swing.JButton btnProdVenCancelar;
    private javax.swing.JButton btnProdVenSalvar;
    private componentes.UJComboBox cmbVendaProdutoListProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutoVenda;
    private javax.swing.JTextField txtProdVenCodProduto;
    private javax.swing.JFormattedTextField txtProdVenQuantidade;
    private javax.swing.JFormattedTextField txtProdVenValTotal;
    // End of variables declaration//GEN-END:variables
}
