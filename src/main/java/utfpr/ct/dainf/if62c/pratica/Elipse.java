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
public class Elipse implements FiguraComEixos{
    protected double r, s;
    
    public Elipse(){
        
    }
    public Elipse(double r, double s){
            if(r>s){
               this.r = r;
               this.s = s;
            }else{
                this.s=r;
                this.r=s;
            }
    }
    @Override
    public double getArea(){
        return Math.PI*r*s;
    }
    
    @Override
    public double getPerimetro(){
        return Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s)));
    }

    @Override
    public double getEixoMenor() {
        return s;
    }

    @Override
    public double getEixoMaior() {
        return r;
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
