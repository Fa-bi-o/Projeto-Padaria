package model;

import java.util.Date;

public class ModelVenda {

    private int idVenda;
    private Date venDataVenda;
    private double venValor;
    private double venValorTotal;
   
    public ModelVenda(){}
  
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    
    public int getIdVenda(){
        return this.idVenda;
    }
   
    public void setVenDataVenda(Date pVenDataVenda){
        this.venDataVenda = pVenDataVenda;
    }
  
    public Date getVenDataVenda(){
        return this.venDataVenda;
    }
   
    public void setVenValor(double pVenValor){
        this.venValor = pVenValor;
    }
    
    public double getVenValor(){
        return this.venValor;
    }

    public void setVenValorTotal(double pVenValorTotal){
        this.venValorTotal = pVenValorTotal;
    }
  
    public double getVenValorTotal(){
        return this.venValorTotal;
    }

    @Override
    public String toString(){
        return "ModelVenda {" 
                + "::idVenda = " 
                + this.idVenda 
                + "::venDataVenda = " 
                + this.venDataVenda 
                + "::venValor = " 
                + this.venValor 
                + "::venValorTotal = " 
                + this.venValorTotal 
                +  "}";
    }
}