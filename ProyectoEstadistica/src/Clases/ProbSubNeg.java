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
public class ProbSubNeg {
    private final double a;
    private double rta;

    public ProbSubNeg(double a) {
        this.a = a;
    }
    
    public void Calcular(){
        rta=1-a;
    }
    
    @Override
    public String toString(){
        if(rta<1){
            return String.format("<html><pre>El total es de: %.2f. "
                    + "\n\nPorcentaje de: %.2f%%.</pre></html>", rta, rta*100);
        }else{
            return String.format("<html><pre>El total es de: %.2f. Porcentaje de: %.2f%%."
                    + "\n\nEn los datos ingresados hay un error, el porcentaje no "
                    + "\n\npuede ser mayor a 100%% o 1.0 o menores a 0.</pre></html>", rta, rta*100);
        }
    }
}
