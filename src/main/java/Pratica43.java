/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aron
 */
import utfpr.ct.dainf.if62c.pratica.*;

public class Pratica43 {
    public static void main(String[] args) {
        Elipse ep = new Elipse(2, 3);
        Circulo c = new Circulo(3);
        
        System.out.println(ep.getArea());
        System.out.println(ep.getPerimetro());
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());
        
        Retangulo r = new Retangulo(2, 3);
        Quadrado q = new Quadrado(3);
        TrianguloEquilatero t = new TrianguloEquilatero(3);
        
        System.out.println(r.getArea());
        System.out.println(r.getPerimetro());
        System.out.println(q.getArea());
        System.out.println(q.getPerimetro());
        System.out.println(t.getArea());
        System.out.println(t.getPerimetro());
        
    }
}
