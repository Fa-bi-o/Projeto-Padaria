package controller;

import DAO.InterfaceDAOProduto;
import java.util.ArrayList;
import model.ModelProduto;

public class ControllerProduto implements InterfaceControllerProduto {
    
    
    private InterfaceDAOProduto daoProduto;

    public ControllerProduto(InterfaceDAOProduto daoProduto) {
        this.daoProduto = daoProduto;
    }        
        
    @Override
    public int salvarProdutoController(ModelProduto modelProduto){
        return this.daoProduto.salvarProdutoDAO(modelProduto);
    }
    
    @Override
    public boolean excluirProdutoController(int proCodigo){
        return this.daoProduto.excluirProdutoDAO(proCodigo);
    }
    
    @Override
    public boolean alterarProdutoController(ModelProduto modelProduto){
        return this.daoProduto.alterarProdutoDAO(modelProduto);
    }
    
    @Override
    public ModelProduto retornarProdutoController(int proCodigo){
        return this.daoProduto.retornarProdutoDAO(proCodigo);
    }
    
    @Override
    public ModelProduto retornarProdutoController(String proNome){
        return this.daoProduto.retornarProdutoDAO(proNome);
    }
    
    @Override
    public ArrayList<ModelProduto> retornarListaProdutoController(){
        return this.daoProduto.retornarListaProdutoDAO();
    }
}