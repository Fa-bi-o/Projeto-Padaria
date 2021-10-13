package DAO;

import java.util.ArrayList;
import model.ModelVenda;

public interface InterfaceDAOVenda {
    
    int salvarVendaDAO(ModelVenda modelVenda);
    
    boolean excluirVendaDAO(int IdVenda);
    
    boolean alterarVendaDAO(ModelVenda modelVenda);
    
    ModelVenda retornarVendaDAO(int idVenda);
    
    ArrayList<ModelVenda> retornarListaVendaDAO();   
}
