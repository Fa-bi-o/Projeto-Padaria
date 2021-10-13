package controller;

import model.ModelUsuario;
import DAO.InterfaceDAOUsuario;
import java.util.ArrayList;

public class ControllerUsuario implements InterfaceControllerUsuario{
    
    private InterfaceDAOUsuario daoUsuario;

    public ControllerUsuario(InterfaceDAOUsuario daoUsuario) {
        this.daoUsuario = daoUsuario;
    }   
   
    @Override
    public int salvarusuarioController(ModelUsuario pModelusuario){
        return this.daoUsuario.salvarusuarioDAO(pModelusuario);
    }
   
    @Override
    public ModelUsuario getusuarioController(int pIdUser){
        return this.daoUsuario.getusuarioDAO(pIdUser);
    }
    
    @Override
    public ArrayList<ModelUsuario> getListausuarioController(){
        return this.daoUsuario.getListausuarioDAO();
    }
    
    @Override
    public boolean atualizarusuarioController(ModelUsuario pModelusuario){
        return this.daoUsuario.atualizarusuarioDAO(pModelusuario);
    }
    
    @Override
    public boolean excluirusuarioController(int pIdUser){
        return this.daoUsuario.excluirusuarioDAO(pIdUser);
    }

    @Override
    public boolean validarUsuarioController(ModelUsuario modelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(modelUsuario);
    }
}