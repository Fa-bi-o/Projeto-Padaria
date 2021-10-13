package model;
/**
*
* @author anderson
*/
public class ModelUsuario {

    private int idUser;
    private String nome;
    private String cpf;
    private String telefone;
    private String login;
    private String senha;
    private int matricula;
    private int funcao;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUser
    * @param pIdUser
    */
    public void setIdUser(int pIdUser){
        this.idUser = pIdUser;
    }
    /**
    * @return idUser
    */
    public int getIdUser(){
        return this.idUser;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de cpf
    * @param pCpf
    */
    public void setCpf(String pCpf){
        this.cpf = pCpf;
    }
    /**
    * @return cpf
    */
    public String getCpf(){
        return this.cpf;
    }

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * @return telefone
    */
    public String getTelefone(){
        return this.telefone;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * @return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * @return senha
    */
    public String getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de matricula
    * @param pMatricula
    */
    public void setMatricula(int pMatricula){
        this.matricula = pMatricula;
    }
    /**
    * @return matricula
    */
    public int getMatricula(){
        return this.matricula;
    }

    /**
    * seta o valor de nivelHierarquico
    * @param pNivelHierarquico
    */
    public void setFuncao(int pFuncao){
        this.funcao = pFuncao;
    }
    /**
    * @return nivelHierarquico
    */
    public int getFuncao(){
        return this.funcao;
    }

    /**
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * @return endereco
    */
    public String getEndereco(){
        return this.endereco;
    }

    /**
    * seta o valor de bairro
    * @param pBairro
    */
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    /**
    * @return bairro
    */
    public String getBairro(){
        return this.bairro;
    }

    /**
    * seta o valor de cidade
    * @param pCidade
    */
    public void setCidade(String pCidade){
        this.cidade = pCidade;
    }
    /**
    * @return cidade
    */
    public String getCidade(){
        return this.cidade;
    }

    /**
    * seta o valor de estado
    * @param pEstado
    */
    public void setEstado(String pEstado){
        this.estado = pEstado;
    }
    /**
    * @return estado
    */
    public String getEstado(){
        return this.estado;
    }

    /**
    * seta o valor de cep
    * @param pCep
    */
    public void setCep(String pCep){
        this.cep = pCep;
    }
    /**
    * @return cep
    */
    public String getCep(){
        return this.cep;
    }

    @Override
    public String toString(){
        return "Modelusuario {" + "::idUser = " + this.idUser + "::nome = " + this.nome + "::cpf = " + this.cpf + "::telefone = " + this.telefone + "::login = " + 
                this.login + "::senha = " + this.senha + "::matricula = " + this.matricula + "::nivelHierarquico = " + this.funcao + "::endereco = " + 
                this.endereco + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::estado = " + this.estado + "::cep = " + this.cep +  "}";
    }
}