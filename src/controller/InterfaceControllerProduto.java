package controller;

import java.util.ArrayList;
import model.ModelProduto;

public interface InterfaceControllerProduto {

    int salvarProdutoController(ModelProduto modelProduto);

    boolean excluirProdutoController(int proCodigo);

    boolean alterarProdutoController(ModelProduto modelProduto);

    ModelProduto retornarProdutoController(int proCodigo);

    ModelProduto retornarProdutoController(String proNome);

    ArrayList<ModelProduto> retornarListaProdutoController();
}
