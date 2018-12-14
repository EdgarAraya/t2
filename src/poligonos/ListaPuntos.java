/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *ListaPuntos.java - Metodos y atributos que controlan una lista de puntos para poligonos
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */

public class ListaPuntos {
    
    private ArrayList<Punto> puntos;

    /**
     * Constructor que crea Puntos
     */
    
    public ListaPuntos() {
        this.puntos = new ArrayList();
    }

    /**
     * Obtiene Puntos
     * @return ArrayList de Puntos
     */
    
    public ArrayList<Punto> getPuntos() {
        return puntos;
    }
    
     /**
     * Agrega un punto a la colección; no se aceptan puntos repetidos
     * @param p, - nuevo punto que se intenta agregar
     * @return true en caso de éxito y false en caso contrario
     */
    
    public boolean agregarPunto(Punto p){
        
        if (!puntos.contains(p)){
            puntos.add(p);
            return true;
        }
        
        
        return false;
    }
    
    /**
     * Retorna el total de puntos existentes
     * @return numero de puntos que existen
     */
    
    
    public int totalPuntos(){
        return puntos.size();
    }
    
     /**
     * Retorna el punto ubicado en el índice indicado
     * @param index, - ubicación dentro de la colección
     * @return punto almacenado en esa ubicación
     */
    
    public Punto buscarPorIndice(int index){
        return puntos.get(index);
    }
    
    /**
     * Muestra atributos de coleccion de Puntos
     * @return String de atributos de coleccion de Puntos
     */
    
    @Override
    public String toString(){
        String datos="";
        for (Punto p:puntos){
            datos+=p.toString()+"\n";
            
        }
        
        return datos;
    }
    
    /**
     * Retorna el tamaño de la coleccion de Puntos
     * @return tamaño coleccion
     */
    
    public int getSize(){
        return puntos.size();
    }
    
}
