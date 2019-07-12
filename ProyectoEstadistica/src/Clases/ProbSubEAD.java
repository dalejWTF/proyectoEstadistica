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
public class ProbSubEAD {
    private final double porcentajes[];
    private double total;

    public ProbSubEAD(double[] porcentajes) {
        this.porcentajes = porcentajes;
    }
    
    
    public void Calcular(){
        for (int i = 0; i < porcentajes.length; i++) {
            total+=porcentajes[i];
        }
    }
    
    @Override
    public String toString(){
        if(total<1){
            return String.format("<html><pre>El total es de: %.2f. "
                    + "\n\nPorcentaje de: %.2f%%.</pre></html>", total, total*100);
        }else{
            return String.format("<html><pre>El total es de: %.2f. Porcentaje de: %.2f%%."
                    + "\n\nEn los datos ingresados hay un error, el porcentaje no "
                    + "\n\npuede ser mayor a 100%% o 1.0</pre></html>", total, total*100);
        }
        
    }
}
