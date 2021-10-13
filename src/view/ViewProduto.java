package view;

import DAO.DAOProduto;
import DAO.InterfaceDAOProduto;
import controller.ControllerProduto;
import controller.InterfaceControllerProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProduto;
import util.Formatador;

public class ViewProduto extends javax.swing.JInternalFrame {
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    InterfaceDAOProduto interfaceDAO = new DAOProduto();
    InterfaceControllerProduto IControllerProduto = new ControllerProduto(interfaceDAO);
    ModelProduto modelProduto = new ModelProduto();
    Formatador formatador = new Formatador();
    String salvarAlterar;
    
    public ViewProduto(){
        initComponents();
        carregarProduto();
        camposOnOff(false);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProdCodigo = new javax.swing.JTextField();
        txtProdNome = new javax.swing.JTextField();
        btnProdNovo = new javax.swing.JButton();
        btnProdAlterar = new javax.swing.JButton();
        btnProdExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        txtProdPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnProdCancelar = new javax.swing.JButton();
        btnProdSalvar = new javax.swing.JButton();
        txtProdEstoque = new javax.swing.JFormattedTextField();
        txtProdValor = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Produtos");
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Estoque:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Valor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 73, -1, -1));

        txtProdCodigo.setEnabled(false);
        txtProdCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, 80, -1));
        getContentPane().add(txtProdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 37, 407, -1));

        btnProdNovo.setText("Novo");
        btnProdNovo.setToolTipText("Novo Cadastro");
        btnProdNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        btnProdAlterar.setText("Alterar");
        btnProdAlterar.setToolTipText("Editar Cadastro");
        btnProdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        btnProdExcluir.setText("Excluir");
        btnProdExcluir.setToolTipText("Excluir Produto");
        btnProdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Voltar ao Menu");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        tblProduto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setToolTipText("");
        tblProduto.setFocusCycleRoot(true);
        tblProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblProduto.setShowGrid(true);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(1).setMinWidth(300);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, 720, 250));
        getContentPane().add(txtProdPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 134, 410, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 135, -1, -1));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        btnProdCancelar.setText("Cancelar");
        btnProdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        btnProdSalvar.setText("Salvar");
        btnProdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        txtProdEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(txtProdEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, 80, -1));

        txtProdValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        getContentPane().add(txtProdValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 102, 80, 27));

        setBounds(0, 0, 746, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdCodigoActionPerformed
        // chamando o método conusltar       
    }//GEN-LAST:event_txtProdCodigoActionPerformed

    private void btnProdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdNovoActionPerformed
        // TODO add your handling code here:      
        camposOnOff(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btnProdNovoActionPerformed

    private void btnProdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdAlterarActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "alterar";
        camposOnOff(true);
        int linha = this.tblProduto.getSelectedRow();
        try {
            int codigoProduto = (int)this.tblProduto.getValueAt(linha, 0);       
            modelProduto = IControllerProduto.retornarProdutoController(codigoProduto);
            this.txtProdCodigo.setText(String.valueOf(modelProduto.getIdProduto()));
            this.txtProdNome.setText(modelProduto.getProNome());
            this.txtProdEstoque.setText(String.valueOf(modelProduto.getProEstoque()));
            this.txtProdValor.setText(String.valueOf(modelProduto.getProValor()));     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum campo foi selecionado.");
            camposOnOff(false);
        }
    }//GEN-LAST:event_btnProdAlterarActionPerformed

    private void btnProdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tblProduto.getSelectedRow();
        int codigoProduto = (int) tblProduto.getValueAt(linha, 0);
        if(IControllerProduto.excluirProdutoController(codigoProduto)){
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso.");
            this.carregarProduto();
            this.camposOnOff(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao remover produto.");
        }        
    }//GEN-LAST:event_btnProdExcluirActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void btnProdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdSalvarActionPerformed
        // TODO add your handling code here:
        if(salvarAlterar.equals("salvar")){
            this.salvarProduto();
        }else if (salvarAlterar.equals("alterar")){ 
            this.alterarProduto();
        }
    }//GEN-LAST:event_btnProdSalvarActionPerformed

    private void btnProdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdCancelarActionPerformed
        // TODO add your handling code here:
        this.camposOnOff(false);
        this.limparCampos();
    }//GEN-LAST:event_btnProdCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.tblProduto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tblProduto.setRowSorter(classificador);
        String texto = txtProdPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void salvarProduto(){
        modelProduto.setProNome(this.txtProdNome.getText());
        modelProduto.setProEstoque(Integer.parseInt(this.txtProdEstoque.getText()));
        modelProduto.setProValor(formatador.converterVirgulaParaPonto(this.txtProdValor.getText()));
        if(IControllerProduto.salvarProdutoController(modelProduto) > 0){
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
            this.carregarProduto();
            this.limparCampos();
            this.camposOnOff(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto.");
        }
    }
    
    private void alterarProduto(){
        modelProduto.setProNome(this.txtProdNome.getText());
        modelProduto.setProEstoque(Integer.parseInt(this.txtProdEstoque.getText()));
        modelProduto.setProValor(formatador.converterVirgulaParaPonto(this.txtProdValor.getText()));
        if(IControllerProduto.alterarProdutoController(modelProduto)){
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso.");
            this.carregarProduto();
            this.limparCampos();
            this.camposOnOff(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao alterar produto.");
        }
    }
    
    private void camposOnOff(boolean condicao){
        txtProdNome.setEnabled(condicao);
        txtProdEstoque.setEnabled(condicao);
        txtProdValor.setEnabled(condicao);
    }
    
    private void limparCampos(){
        txtProdNome.setText("");
        txtProdEstoque.setText("");
        txtProdValor.setText("");
    }
    
    private void carregarProduto(){
        listaModelProduto = IControllerProduto.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);
        int cont = listaModelProduto.size();
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getIdProduto(),
                listaModelProduto.get(i).getProNome(),
                listaModelProduto.get(i).getProEstoque(),
                listaModelProduto.get(i).getProValor()
            });
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProdAlterar;
    private javax.swing.JButton btnProdCancelar;
    private javax.swing.JButton btnProdExcluir;
    private javax.swing.JButton btnProdNovo;
    private javax.swing.JButton btnProdSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtProdCodigo;
    private javax.swing.JFormattedTextField txtProdEstoque;
    private javax.swing.JTextField txtProdNome;
    private javax.swing.JTextField txtProdPesquisa;
    private javax.swing.JFormattedTextField txtProdValor;
    // End of variables declaration//GEN-END:variables
}
