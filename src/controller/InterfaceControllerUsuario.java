package controller;

import java.util.ArrayList;
import model.ModelUsuario;

public interface InterfaceControllerUsuario {

    public int salvarusuarioController(ModelUsuario pModelusuario);

    public ModelUsuario getusuarioController(int pIdUser);

    public ArrayList<ModelUsuario> getListausuarioController();

    public boolean atualizarusuarioController(ModelUsuario pModelusuario);

    public boolean excluirusuarioController(int pIdUser);

    public boolean validarUsuarioController(ModelUsuario modelUsuario);
}
