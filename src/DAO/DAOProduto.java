package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelProduto;

public class DAOProduto extends Conexao implements InterfaceDAOProduto{    
    
    @Override
    public int salvarProdutoDAO(ModelProduto modelProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_produto("
                    /*+ "id_produto,"*/
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + ") VALUES ("
                    + "'" + modelProduto.getProNome() + "',"
                    + "'" + modelProduto.getProValor() + "',"
                    + "'" + modelProduto.getProEstoque() + "'"
                    + ");");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirProdutoDAO(int idProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tb_produto WHERE id_produto = '" + idProduto + "'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean alterarProdutoDAO(ModelProduto modelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tb_produto SET "
                    + "pro_nome = '" + modelProduto.getProNome() + "',"
                    + "pro_valor = '" + modelProduto.getProValor() + "',"
                    + "pro_estoque = '" + modelProduto.getProEstoque() + "'"
                    + " WHERE id_produto = '" + modelProduto.getIdProduto() + "'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public ModelProduto retornarProdutoDAO(int idProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + " FROM tb_produto WHERE id_produto = '"
                    + idProduto + "';");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }
    @Override
    public ModelProduto retornarProdutoDAO(String proNome) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                    + " FROM tb_produto WHERE pro_nome = '"
                    + proNome + "';");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    @Override
    public ArrayList<ModelProduto> retornarListaProdutoDAO() {
        ArrayList<ModelProduto> listaModelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                + "id_produto,"
                + "pro_nome,"
                + "pro_valor,"
                + "pro_estoque "
                + " FROM tb_produto;");

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
                listaModelProduto.add(modelProduto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            this.fecharConexao();
        }
        return listaModelProduto;
    }
}
