/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author danie
 */
public class ProbSubGMUL {
    
    private final int numerador;
    private final int denominador;
    private final boolean depende;
    private double resultado;
    
    public ProbSubGMUL(int numerador, int denominador, boolean depende) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.depende = depende;
    }
    
    public void Calcular(){
        if (depende==true) {
            resultado= (Math.pow(numerador, 2))/(Math.pow(denominador, 2));
        }else{
            if (numerador>1 && denominador>1) {
                resultado=(numerador * (numerador-1))/(denominador * (denominador-1)*1.0);
            }else{
                resultado=0;
            }
            
        }
    }
    
    public String toString(){
        if(resultado<1){
            return String.format("<html><pre>El total es de: %.2f. "
                    + "\n\nPorcentaje de: %.2f%%.</pre></html>", resultado, resultado*100);
        }else{
            return String.format("<html><pre>El total es de: %.2f. Porcentaje de: %.2f%%."
                    + "\n\nEn los datos ingresados hay un error, el porcentaje no "
                    + "\n\npuede ser mayor a 100%% o 1.0 o menores a 0.</pre></html>", resultado, resultado*100);
        }
    }
}
