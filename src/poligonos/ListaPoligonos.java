/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *@author Edgar Araya
 *@author Luis Benitez
 */
public class ListaPoligonos {
    
    private ArrayList<Poligono> poligonos;

    public ArrayList<Poligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(ArrayList<Poligono> poligonos) {
        this.poligonos = poligonos;
    }

    
    
    
    
    
    public ListaPoligonos() {
        this.poligonos = new ArrayList();
    }
    
    public boolean agregarPoligono(Poligono p){
        if (!existe(p)){
            this.poligonos.add(p);
            return true;
        }
        return false;
    }
    
    public boolean existe(Poligono p){
        
        return this.poligonos.contains(p);
        
        
        
    }
    
    public Poligono buscarPorIndice(int indice){
        
        return this.poligonos.get(indice);
    }
    
    public ListaPoligonos buscarPorRangoPerimetro(float inferior, float superior){
        ListaPoligonos rango= new ListaPoligonos();
        
        for (Poligono p:this.poligonos){
            
            if (p.perimetro()>=inferior && p.perimetro()<=superior){
                rango.agregarPoligono(p);
                
            }
        }
        
        return rango;  
    }
    
    public ListaPoligonos obtenerSubPoligonos(){
        ListaPoligonos subpoligonos= new ListaPoligonos();
        
        for (Poligono p: this.poligonos){
            subpoligonos.agregarPoligono(p.getSubPoligono());
        }
        
        return subpoligonos;
    }
    
    public int totalPoligonos(){
        return this.poligonos.size();
    }
    
    public ListaPoligonos obtenerExtremos(boolean menores){
        Collections.sort(poligonos);
        ListaPoligonos extremo= new ListaPoligonos();
        float perimetro;
        if (menores){
            perimetro=this.poligonos.get(this.poligonos.size()-1).perimetro();
        }
        else{
            perimetro=this.poligonos.get(0).perimetro(); 
        }
        
        for(Poligono p:this.poligonos){   
                if (p.perimetro()==perimetro){
                    extremo.poligonos.add(p);
                }
            }  
        
        return extremo;
        
        
        
    }
    
    public String toString(){
        String datos="";
        //datos+="Poligonos en la lista:";//Optional
        
        int i=1;
        for(Poligono p:this.poligonos){
            datos+="\n*Poligono "+i+"*";
            datos+=p.toString()+"\n";
            i++;
        }
        return datos;
        
    }
    
    public int getSize(){
        return poligonos.size();
    }
}
