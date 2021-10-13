package DAO;

import java.util.ArrayList;
import model.ModelUsuario;

public interface InterfaceDAOUsuario {
    
    int salvarusuarioDAO(ModelUsuario pModelusuario);
    
    ModelUsuario getusuarioDAO(int pIdUser);
    
    ArrayList<ModelUsuario> getListausuarioDAO();
    
    boolean atualizarusuarioDAO(ModelUsuario pModelusuario);
    
    boolean excluirusuarioDAO(int pIdUser);
    
    boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario);    
}
