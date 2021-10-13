package DAO;

import model.ModelVenda;
import conexoes.Conexao;
import java.util.ArrayList;

public class DAOVenda extends Conexao implements InterfaceDAOVenda{

    @Override
    public int salvarVendaDAO(ModelVenda modelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_venda ("                 
                    + "ven_data_venda,"
                    + "ven_valor_total"
                + ") VALUES ("
                    + "'" + modelVenda.getVenDataVenda() + "',"
                    + "'" + modelVenda.getVenValorTotal() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }    
    
    @Override
    public boolean excluirVendaDAO(int IdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_venda "
                + " WHERE "
                    + "id_venda = '" + IdVenda + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    @Override
    public boolean alterarVendaDAO(ModelVenda modelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_venda SET "
                    + "id_venda = '" + modelVenda.getIdVenda() + "',"
                    + "ven_data_venda = '" + modelVenda.getVenDataVenda() + "',"
                    + "ven_valor_total = '" + modelVenda.getVenValorTotal() + "'"
                + " WHERE "
                    + "id_venda = '" + modelVenda.getIdVenda() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    @Override
    public ModelVenda retornarVendaDAO(int idVenda){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "ven_data_venda,"
                    + "ven_valor_total"
                 + " FROM"
                     + " tb_venda"
                 + " WHERE"
                     + " id_venda = '" + idVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setVenDataVenda(this.getResultSet().getDate(2));
                modelVenda.setVenValorTotal(this.getResultSet().getDouble(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }
   
    @Override
    public ArrayList<ModelVenda> retornarListaVendaDAO(){
        ArrayList<ModelVenda> listaModelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "ven_data_venda,"
                    + "ven_valor_total"
                 + " FROM"
                     + " tb_venda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setVenDataVenda(this.getResultSet().getDate(2));
                modelVenda.setVenValorTotal(this.getResultSet().getDouble(3));
                listaModelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVenda;
    }        
}