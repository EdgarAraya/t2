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
        
        if (this.lineas.isEmpty()){
            this.lineas.add(nueva);
            return true;
        }
        else if(!this.lineas.contains(nueva) && verificarLinea(nueva))
        {
            this.lineas.add(nueva);
            return true;
        }
            
            
        return false;
    }
    
    public boolean verificarLinea(Recta candidata){
        
        return (this.lineas.get(this.lineas.size()-1).getPuntoFinal().equals(candidata.getPuntoInicial()));
        
        
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
        
        if (o instanceof Poligono){
            Poligono p = (Poligono) o;
            if (p.lineas.size()==this.lineas.size()){
                int iguales=0;
                for(Recta c:this.lineas){
                    //shit
                    for (Recta c2:p.lineas){
                        if (c.equals(c2)){
                            iguales++;
                            System.out.println(iguales);
                        }
  
                    }
                }
                if (iguales==this.lineas.size()){
                    return true;  
                }
            } 
        }
        return false;
    }
    /*
    public boolean equals(Poligono p){
        
        return true;
    }
    */
    
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
        String datos="Rectas:\n";
        for(Recta c:this.lineas){
            datos+=c.toString()+"\n";
            
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
