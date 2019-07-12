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
public class ProbabilidadObjetiva {
    private int Y;
    private int X;
    
    public ProbabilidadObjetiva(){}
    public ProbabilidadObjetiva(int x, int y){
        this.Y= y;
        this.X= x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    } 
    
    public double Resultado(){
        double var= 1.0*this.X/this.Y;
        return var;
    }
    
    @Override
    public String toString(){
        return String.format("<html><pre>El resultado es de: %.2f \n\n"
                + "Porcentaje de probabilidad: %.2f%%.</pre></html>", this.Resultado(),this.Resultado()*100);
    }
}
