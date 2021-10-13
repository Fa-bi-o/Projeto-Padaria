
package DAO;

import java.util.ArrayList;
import model.ModelProduto;

public interface InterfaceDAOProduto {
    
    int salvarProdutoDAO(ModelProduto modelProduto);
    
    boolean excluirProdutoDAO(int idProduto);
    
    boolean alterarProdutoDAO(ModelProduto modelProduto);
    
    ModelProduto retornarProdutoDAO(int idProduto);
    
    ModelProduto retornarProdutoDAO(String proNome);
    
    ArrayList<ModelProduto> retornarListaProdutoDAO();   
}
