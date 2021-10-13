package DAO;

import model.ModelUsuario;
import conexoes.Conexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOUsuario extends Conexao implements InterfaceDAOUsuario{
    
    @Override
    public int salvarusuarioDAO(ModelUsuario pModelusuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbusuarios ("
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "matricula,"
                    + "nivelHierarquico,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep"
                    + ") VALUES ("
                    + "'" + pModelusuario.getNome() + "',"
                    + "'" + pModelusuario.getCpf() + "',"
                    + "'" + pModelusuario.getTelefone() + "',"
                    + "'" + pModelusuario.getLogin() + "',"
                    + "'" + pModelusuario.getSenha() + "',"
                    + "'" + pModelusuario.getMatricula() + "',"
                    + "'" + pModelusuario.getFuncao() + "',"
                    + "'" + pModelusuario.getEndereco() + "',"
                    + "'" + pModelusuario.getBairro() + "',"
                    + "'" + pModelusuario.getCidade() + "',"
                    + "'" + pModelusuario.getEstado() + "',"
                    + "'" + pModelusuario.getCep() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public ModelUsuario getusuarioDAO(int pIdUser) {
        ModelUsuario modelusuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "matricula,"
                    + "nivelHierarquico,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep"
                    + " FROM"
                    + " tbusuarios"
                    + " WHERE"
                    + " iduser = '" + pIdUser + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelusuario.setIdUser(this.getResultSet().getInt(1));
                modelusuario.setNome(this.getResultSet().getString(2));
                modelusuario.setCpf(this.getResultSet().getString(3));
                modelusuario.setTelefone(this.getResultSet().getString(4));
                modelusuario.setLogin(this.getResultSet().getString(5));
                modelusuario.setSenha(this.getResultSet().getString(6));
                modelusuario.setMatricula(this.getResultSet().getInt(7));
                modelusuario.setFuncao(this.getResultSet().getInt(8));
                modelusuario.setEndereco(this.getResultSet().getString(9));
                modelusuario.setBairro(this.getResultSet().getString(10));
                modelusuario.setCidade(this.getResultSet().getString(11));
                modelusuario.setEstado(this.getResultSet().getString(12));
                modelusuario.setCep(this.getResultSet().getString(13));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelusuario;
    }

    @Override
    public ArrayList<ModelUsuario> getListausuarioDAO() {
        ArrayList<ModelUsuario> listamodelusuario = new ArrayList();
        ModelUsuario modelusuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "matricula,"
                    + "nivelHierarquico,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep"
                    + " FROM"
                    + " tbusuarios"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelusuario = new ModelUsuario();
                modelusuario.setIdUser(this.getResultSet().getInt(1));
                modelusuario.setNome(this.getResultSet().getString(2));
                modelusuario.setCpf(this.getResultSet().getString(3));
                modelusuario.setTelefone(this.getResultSet().getString(4));
                modelusuario.setLogin(this.getResultSet().getString(5));
                modelusuario.setSenha(this.getResultSet().getString(6));
                modelusuario.setMatricula(this.getResultSet().getInt(7));
                modelusuario.setFuncao(this.getResultSet().getInt(8));
                modelusuario.setEndereco(this.getResultSet().getString(9));
                modelusuario.setBairro(this.getResultSet().getString(10));
                modelusuario.setCidade(this.getResultSet().getString(11));
                modelusuario.setEstado(this.getResultSet().getString(12));
                modelusuario.setCep(this.getResultSet().getString(13));
                listamodelusuario.add(modelusuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelusuario;
    }

    @Override
    public boolean atualizarusuarioDAO(ModelUsuario pModelusuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbusuarios SET "
                    + "iduser = '" + pModelusuario.getIdUser() + "',"
                    + "nome = '" + pModelusuario.getNome() + "',"
                    + "cpf = '" + pModelusuario.getCpf() + "',"
                    + "telefone = '" + pModelusuario.getTelefone() + "',"
                    + "login = '" + pModelusuario.getLogin() + "',"
                    + "senha = '" + pModelusuario.getSenha() + "',"
                    + "matricula = '" + pModelusuario.getMatricula() + "',"
                    + "nivelHierarquico = '" + pModelusuario.getFuncao() + "',"
                    + "endereco = '" + pModelusuario.getEndereco() + "',"
                    + "bairro = '" + pModelusuario.getBairro() + "',"
                    + "cidade = '" + pModelusuario.getCidade() + "',"
                    + "estado = '" + pModelusuario.getEstado() + "',"
                    + "cep = '" + pModelusuario.getCep() + "'"
                    + " WHERE "
                    + "iduser = '" + pModelusuario.getIdUser() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirusuarioDAO(int pIdUser) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbusuarios "
                    + " WHERE "
                    + "iduser = '" + pIdUser + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "matricula,"
                    + "nivelHierarquico,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep"
                    + " FROM"
                    + " tbusuarios"
                    + " WHERE"
                    + " login = '" + pModelUsuario.getLogin() + "' AND senha = '" + pModelUsuario.getSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
