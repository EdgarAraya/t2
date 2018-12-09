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
        
        //triang
        Punto t1= new Punto((byte)0,(byte)0);
        Punto t2= new Punto((byte)2,(byte)0);
        
        Punto t3= new Punto((byte)2,(byte)0);
        Punto t4= new Punto((byte)0,(byte)2);
        
        Punto t5= new Punto((byte)0,(byte)2);
        Punto t6= new Punto((byte)0,(byte)0);
        
        //otro cuadrado
        Punto f1 = new Punto((byte)0,(byte)0);
        Punto f2 = new Punto((byte)-2,(byte)0);
        
        Punto f3 = new Punto((byte)-2,(byte)0);
        Punto f4 = new Punto((byte)-2,(byte)2);
        
        Punto f5= new Punto((byte)-2,(byte)2);
        Punto f6= new Punto((byte)0,(byte)2);
        
        Punto f7= new Punto((byte)0,(byte)2);
        Punto f8= new Punto((byte)0,(byte)0);
        
        
        
        
        Recta r1 = new Recta(a1,a2);
        Recta r2 = new Recta(b1,b2);
        Recta r3 = new Recta(c1,c2);
        Recta r4 = new Recta(d1,d2);
        
        Recta tr1 = new Recta(t1,t2);
        Recta tr2 = new Recta(t3,t4);
        Recta tr3 = new Recta(t5,t6);
        
        Recta rt1 = new Recta(f1,f2);
        Recta rt2 = new Recta(f3,f4);
        Recta rt3 = new Recta(f5,f6);
        Recta rt4 = new Recta(f7,f8);
        
        
        
        
        System.out.println(r1.getLongitud());
        
        
        
        Punto pto = r1.getPuntoMedio();
        System.out.println(pto);
        
      
        Poligono p= new Poligono();
        Poligono p2= new Poligono();
        Poligono p3= new Poligono();
        
        p3.addLinea(r2);
        p3.addLinea(r3);
        p3.addLinea(r4);
        p3.addLinea(r1);
        
        
        System.out.println(p);
        
        p.addLinea(r1);
        p.addLinea(r2);
        p.addLinea(r3);
        p.addLinea(r4);
        
        p2.addLinea(tr1);
        p2.addLinea(tr2);
        p2.addLinea(tr3);
        p2.addLinea(r4);
        
        Poligono cuadrado = new Poligono();
        
        cuadrado.addLinea(rt1);
        cuadrado.addLinea(rt2);
        cuadrado.addLinea(rt3);
        cuadrado.addLinea(rt4);
        
        
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p.verificarLinea(r3));
        
        System.out.println(p.equals(p2));
        
        System.out.println(p);
        System.out.println(p3);
        
        
        
        System.out.println(cuadrado);
        
        System.out.println("comp:"+p.equals(p3));
        System.out.println("comp:"+p3.equals(p2));
        System.out.println("cuad:"+p.equals(cuadrado));
        
        
    }
    
}
