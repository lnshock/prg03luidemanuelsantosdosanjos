package br.com.ifba.atividade05.view;

//definindo uma classe chamada Fatorial
public class Fatorial {
    private int valor;
    private int fatorial;
    private String calculo;
    
    //// Guarda o número e já faz o cálculo
    public void setValor(int n){
        this.valor = n;
         int res = 1;
          String formula = "";
        
        //se o numero for 0
        if (n == 0){
            res = 1;
              formula = "0!";
        //se não for 0
        } else {
            for(int i = n; i > 1; i--){
                res *= i;
                 formula += i + " x ";
            }
            formula += "1";
        }      
        this.fatorial = res;
        this.calculo = formula; 
    }  
    //retorna o resultado
    public int getFatorial(){
        return this.fatorial;
    }  
    // Retorna a fórmula do cálculo
    public String getFormula(){
        return this.calculo;
    }
}   