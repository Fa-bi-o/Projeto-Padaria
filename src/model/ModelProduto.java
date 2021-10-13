package model;


public class ModelProduto {
    private int idProduto;
    private String proNome;
    private double proValor;
    private int proEstoque;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public double getProValor() {
        return proValor;
    }

    public void setProValor(double proValor) {
        this.proValor = proValor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }    
    
    @Override
    public String toString(){
        return "ModelProduto {" 
                + "::idProduto = " 
                + this.idProduto 
                + "::proNome = " 
                + this.proNome 
                + "::proValor = " 
                + this.proValor 
                + "::proEstoque = " 
                + this.proEstoque 
                +  "}";
    }
}
