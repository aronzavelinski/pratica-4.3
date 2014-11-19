/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author aron
 */
public class TrianguloEquilatero implements FiguraComLados{
    private double b, h;
    
    public TrianguloEquilatero() {
    }
    
    public TrianguloEquilatero(double l){
        b = l;
        h = l*Math.sin(Math.PI/3);
    }
    
    public String getNome(){
        return "Triangulo Equilatero";
    }
    public double getPerimetro(){
        return 3*b;
    }
    public double getArea(){
        return b*h;
    }
    public double getLadoMenor(){
        return b;
    }
    public double getLadoMaior(){
        return b;
    }
}
