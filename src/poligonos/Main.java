/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

/**
 *
 * @author luisbenitez
 */
public class Main {
    
    public static void main(String[] args){
        
        
        Punto a1 = new Punto((byte)0,(byte)0);
        Punto a2 = new Punto((byte)2,(byte)0);
        
        Punto b1 = new Punto((byte)2,(byte)0);
        Punto b2 = new Punto((byte)2,(byte)2);
        
        Punto c1= new Punto((byte)2,(byte)2);
        Punto c2= new Punto((byte)0,(byte)2);
        
        Punto d1= new Punto((byte)0,(byte)2);
        Punto d2= new Punto((byte)0,(byte)0);
        
        Recta r1 = new Recta(a1,a2);
        Recta r2 = new Recta(b1,b2);
        Recta r3 = new Recta(c1,c2);
        Recta r4 = new Recta(d1,d2);
        
        System.out.println(r1.getLongitud());
        
        
        
        Punto pto = r1.getPuntoMedio();
        System.out.println(pto);
        
      
        System.out.println(r1.calcularAngulo(r2));
        System.out.println(r2.calcularAngulo(r3));        
        System.out.println(r3.calcularAngulo(r4));
        System.out.println(r4.calcularAngulo(r1));
        
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println(r1.perpendicularEjeX()+" Y: "+r1.perpendicularEjeY());
        
        
        
        
        
        
    }
    
}
