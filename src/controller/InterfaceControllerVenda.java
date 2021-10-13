package controller;

import java.util.ArrayList;
import model.ModelVenda;

public interface InterfaceControllerVenda {

    public int salvarVendaController(ModelVenda modelVenda);

    public boolean excluirVendaController(int idVenda);

    public boolean AlterarVendaController(ModelVenda modelVenda);

    public ModelVenda retornarVendaController(int idVenda);

    public ArrayList<ModelVenda> retornarListaVendaController();
}
