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
public class ProbSubGAD {
    private final double a;
    private final double b;
    private final double aYb;
    private double rta;
    
    public ProbSubGAD(double a, double b, double aYb) {
        this.a = a;
        this.b = b;
        this.aYb = aYb;
    }

    public void Calcular(){
        rta=(a+b)-aYb;
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
