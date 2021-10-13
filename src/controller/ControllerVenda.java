package controller;

import model.ModelVenda;
import DAO.InterfaceDAOVenda;
import java.util.ArrayList;

public class ControllerVenda implements InterfaceControllerVenda{    

    private InterfaceDAOVenda daoVenda;

    public ControllerVenda(InterfaceDAOVenda daoVenda) {
        this.daoVenda = daoVenda;
    }     
    
    @Override
    public int salvarVendaController(ModelVenda modelVenda){
        return this.daoVenda.salvarVendaDAO(modelVenda);
    }
    
    @Override
    public boolean excluirVendaController(int idVenda){
        return this.daoVenda.excluirVendaDAO(idVenda);
    }
    
    @Override
    public boolean AlterarVendaController(ModelVenda modelVenda){
        return this.daoVenda.alterarVendaDAO(modelVenda);
    } 

    @Override
    public ModelVenda retornarVendaController(int idVenda){
        return this.daoVenda.retornarVendaDAO(idVenda);
    }

    @Override
    public ArrayList<ModelVenda> retornarListaVendaController(){
        return this.daoVenda.retornarListaVendaDAO();
    }          
}