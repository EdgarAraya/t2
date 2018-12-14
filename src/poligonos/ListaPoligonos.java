/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *Punto.java - Metodos y atributos que controlan una lista de poligonos
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */

public class ListaPoligonos {
    
    private ArrayList<Poligono> poligonos;

    
    /**
     * Obtiene Poligonos
     * @return ArrayList de Poligonos
     */
    
    public ArrayList<Poligono> getPoligonos() {
        return poligonos;
    }

    /**
     * Constructor que crea Poligonos
     */
    
    public ListaPoligonos() {
        this.poligonos = new ArrayList();
    }
    
    /**
     * Agrega un polígono a la lista No se permiten polígonos repetidos
     * @param p, poligono que se desea agrgar a la lisa
     * @return true en caso de éxito y false en caso contrario
     */
    
    public boolean agregarPoligono(Poligono p){
        if (!existe(p)){
            this.poligonos.add(p);
            return true;
        }
        return false;
    }
    
    /**
     * Determina si existe un polígono dentro de la lista
     * @param p, - polígono buscado
     * @return true en caso de éxito y false en caso contrario
     */
    
    public boolean existe(Poligono p){
        
        return this.poligonos.contains(p);
        
    }
    
    /**
     * Retorna el polígono ubicado en el índice indicado
     * @param indice, - índice buscado
     * @return polígono ubicado en el índice
     */
    
    
    
    public Poligono buscarPorIndice(int indice){
        
        return this.poligonos.get(indice);
    }
    
    /**
     * Obtiene la lista de polígonos cuyo perímetro está dentro del rango
     *@param inferior, - límite inferior del rango
     *@param superior, - límite superior del rango
     *@return polígono ubicado en el índice
     */
    
    
    public ListaPoligonos buscarPorRangoPerimetro(float inferior, float superior){
        ListaPoligonos rango= new ListaPoligonos();
        
        for (Poligono p:this.poligonos){
            
            if (p.perimetro()>=inferior && p.perimetro()<=superior){
                rango.agregarPoligono(p);
                
            }
        }
        
        return rango;  
    }
    
    /**
     * Obtener la lista de sub-polígonos a partir de la lista existente
     * @return lista de subpolígonos que se pueden armar
     */
    
    public ListaPoligonos obtenerSubPoligonos(){
        ListaPoligonos subpoligonos= new ListaPoligonos();
        
        for (Poligono p: this.poligonos){
            subpoligonos.agregarPoligono(p.getSubPoligono());
        }
        
        return subpoligonos;
    }
    
     /**
     * Retorna el total de polígonos existentes
     * @return total de poligonos 
     */
    
    public int totalPoligonos(){
        return this.poligonos.size();
    }
    
     /**
     * Obtiene los polígonos de menor o mayor perímetro
     * @param menores - true en caso de querer obtener los polígonos de menor perímetro o false en caso de querer obtener los polígonos de mayor perímetro
     * @return lista de polígonos de menor perímetro
     */
    
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
    
    /**
     * Muestra atributos de coleccion de Poligonos
     * @return String con atributos de coleccion de Poligonos
     */
    
    public String toString(){
        String datos="Poligonos en la lista:";
        int i=1;
        for(Poligono p:this.poligonos){
            datos+="\n*Poligono "+i+"*";
            datos+=p.toString();
            i++;
        }
        return datos;
        
    }
    
    /**
     * Retorna el tamaño de la coleccion de Poligonos
     * @return tamaño coleccion
     */
    
    public int getSize(){
        return poligonos.size();
    }
}
