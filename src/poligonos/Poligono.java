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
public class Poligono implements IOperaciones, Comparable<Poligono> {
    
    private ArrayList<Recta> lineas;
    private boolean cerrado=false;

    public Poligono(){
        
        this.lineas= new ArrayList();
    }
    
    public boolean addLinea(Recta nueva){
        
        
 
        
        if (this.lineas.isEmpty()){
            this.lineas.add(nueva);
            return true;
        }
        else if(!this.lineas.contains(nueva) && verificarLinea(nueva) && !cerrado)
        {
            this.lineas.add(nueva);
            
            cerrado=esCerrado();
            
            
            
            
            return true;
        }
            
            
        return false;
    }
    
    public boolean verificarLinea(Recta candidata){
        
        return (this.lineas.get(this.lineas.size()-1).getPuntoFinal().equals(candidata.getPuntoInicial()) &&
                this.lineas.get(this.lineas.size()-1).calcularAngulo(candidata)!=180);
        
        
    }
    
    public float perimetro(){
        float perimetro=0;
        
        for(Recta c:this.lineas){
            perimetro+=c.getLongitud();
        }
        
        return perimetro;
    }
    
    @Override
    public boolean esRegular(){
        if (this==null) return false;
        
        float largo;
        for(Recta c:this.lineas){
            largo=this.lineas.get(0).getLongitud();
            if (c.getLongitud()!=largo){
                return false;
            }
        }
        
        
        return true;
    }
    
    public Poligono getSubPoligono(){
        Poligono nuevo= new Poligono();
        ArrayList<Punto> lista= new ArrayList();
        for (Recta c: this.lineas){
            Punto pto;
            pto=c.getPuntoMedio();
            lista.add(pto);  
        }
        for (int i =0; i < lista.size()-1;i++){
            Recta rect = new Recta(lista.get(i),lista.get(i+1));
            nuevo.addLinea(rect);
            if (i==lista.size()-2){
                rect = new Recta(lista.get(i+1),lista.get(0));
                nuevo.addLinea(rect);
            }
  
        }
        return nuevo;
    }
    
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
        String datos="\nNumero de lados:"+this.lineas.size()+ "\nRectas:\n";
        int i=1;
        for(Recta c:this.lineas){
            datos+=c.toString()+"\n";
            
        }
        datos+="Perimetro: "+this.perimetro();
        
        
        //datos+="Es Regular: " +(this.esRegular()? "Si":"No");
            
        
        
        if(this.esCerrado()){
            datos+=" Es Regular: ";

            if(this.esRegular())
                datos+="Si";
            else
                datos+="No";
        
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
    
    
    public boolean esCerrado(){
        
        return this.lineas.get(0).getPuntoInicial().equals(this.lineas.get(this.lineas.size()-1).getPuntoFinal());
           

    }

}