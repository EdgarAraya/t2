/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *@author  Edgar Araya
 * @author luisbenitez
 * 
 */
public class Poligono {
    
    private ArrayList<Recta> lineas;
    
    public Poligono(){
        
        this.lineas= new ArrayList();
    }
    
    public boolean addLinea(Recta nueva){
        
        return true;
    }
    
    public boolean verificarLinea(Recta candidata){
        return true;
    }
    
    public float perimetro(){
        float perimetro=0;
        
        for(Recta c:this.lineas){
            perimetro+=c.getLongitud();
            
            
            
        }
        
        return perimetro;
    }
    
    public boolean esRegular(){
        float largo=this.lineas.get(0).getLongitud();
        for(Recta c:this.lineas){
            
            if (c.getLongitud()!=largo){
                return false;
            }
        }
        
        
        return true;
    }
    /*
    public Poligono getSubPoligono(){
        
        
        
        
    }
    */
    public boolean equals(Object o){
        /*
        if (o instanceof Poligono){
            Poligono p = (Poligono) o;
            
            for (Recta c:this.lineas){
                if (c.getPuntoInicial())
                
                
            }
            
            
            
            }
        
        */
        return false;
    }
    public boolean equals(Poligono p){
        
        return true;
    }
    
    public void desplazarEjeX(byte delta){
        
        for (Recta c: this.lineas){
            
            c.desplazarEjeX(delta);
            
            
        }
        
    }
    
    public void desplazarEjeY(byte delta){
        
        
        for (Recta c: this.lineas){
            
            c.desplazarEjeY(delta);
            
            
        }
    }
    
    public int compareTo(Poligono p){
        
        return (int) (p.perimetro()-this.perimetro());
    }
    
    @Override
    public String toString(){
        String datos="";
        for(Recta c:this.lineas){
            datos+="\n"+c.toString()+"\n";
            
        }
        
        return datos;
    }
    
    public boolean sonColaterales(Poligono p){
        
        
        for (Recta c: p.lineas){
            if (this.lineas.contains(c)){
                return true;
            }
            
            
        }
        return false;
    }
    
    
    
    
    
    
}
