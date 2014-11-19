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
public class Quadrado extends Retangulo implements FiguraComLados{

    public Quadrado() {
    }
    
    public Quadrado(double l1) {
        super.l1 = l1;
        super.l2 = l1;
    }
    
    @Override
    public String getNome(){
        return "Quadrado";
    }
}
