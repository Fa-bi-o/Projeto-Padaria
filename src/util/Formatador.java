package util;


public class Formatador {
    
    public double converterVirgulaParaPonto(String string){
        String retorno = new String();
        int tamanhoString = string.length();
        for(int i = 0; i < tamanhoString; i++){
            if(string.charAt(i) == ','){
                retorno = retorno + '.';
            }
            else{
                retorno = retorno + string.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }    
}
