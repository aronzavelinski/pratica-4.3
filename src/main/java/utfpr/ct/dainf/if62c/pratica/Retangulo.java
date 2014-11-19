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
public class Retangulo implements FiguraComLados{
    protected double l1, l2;
    
    public Retangulo() {
    }
    
    public Retangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public String getNome(){
        return "Retangulo";
    }
    public double getPerimetro(){
        return 2*l1+2*l2;
    }
    public double getArea(){
        return l1*l2;
    }
    public double getLadoMenor(){
        if(l1<l2)
            return l1;
        else
            return l2;
    }
    public double getLadoMaior(){
        if(l1>l2)
            return l1;
        else
            return l2;
    }
}
