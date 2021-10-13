package conexoes;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    
    private String servidor = "localhost";
    private String nomeDoBanco = "dbpadaria";
    private String usuario = "root";
    private String senha = "";
    
    public Conexao(){}
    
    public Conexao(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    //jdbc:mysql://localhost:3306/dbinfox?
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco;
            this.setCon((Connection)DriverManager.getConnection(url, usuario, senha));
            this.status = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return this.getCon();
    }
    
    public boolean executarSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());
            this.setResultSet(getStatement().executeQuery(pSQL));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
    }
    
    public boolean executarUpdateDeleteSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());
            getStatement().executeUpdate(pSQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
    }
    
    public int insertSQL(String pSQL){
        int status = 0;
        try {
            this.setStatement(getCon().createStatement());
            this.getStatement().executeUpdate(pSQL);
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            while(this.resultSet.next()){
               status = this.resultSet.getInt(1);
            }
            return status;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return status;
        }
    }
    
    public boolean fecharConexao(){
        try {
            if((this.getResultSet()!= null) && (this.statement != null)){
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
