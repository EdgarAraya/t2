/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *ListaRectas.java - Metodos y atributos que controlan una lista de rectas para un poligono
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */
public class ListaRectas {
    
    private ArrayList<Recta>rectas;

    
    /**
     * Constructor que crea rectas
     */
    
    
    public ListaRectas() {
        this.rectas = new ArrayList();
    }
    //Borrar
    public boolean convertirARectas(ListaPuntos pt){
        
       // if(rectas.isEmpty()){
            
            for (int i =0; i < pt.getPuntos().size()-1;i++){
                Recta rec = new Recta(pt.getPuntos().get(i), pt.getPuntos().get(i+1));
                
                if (!rectas.contains(rec)){
                    rectas.add(rec);
                }
                
                
                
                if(i==pt.getPuntos().size()-2){
                    
                     rectas.add(new Recta(pt.getPuntos().get(i),pt.getPuntos().get(0)));
                    
                }
                
                
            }
            
            
            return true;

        //return false;

    }

    /**
     * Obtiene Rectas
     * @return ArrayList de Rectas
     */
    
    public ArrayList<Recta> getRectas() {
        return rectas;
    }
    
    
    
    
     /**
     * Agrega una recta a la colección
     * @param r, - nueva recta
     * @return true, si la recta se agrga exitosamente, false, si no se agregó
     */
    
    
    public boolean agregarRecta(Recta r){
        
        if (!rectas.contains(r) && !r.getPuntoInicial().equals(r.getPuntoFinal())){
        
             this.rectas.add(r);
             return true;
        
        }
        return false;
    }
    
     /**
     * Retorna el total de rectas existentes
     * @return numero de rectas que existen
     */
    
    
    public int totalRectas(){
        return this.rectas.size();
    }
    
    /**
     * Retorna la recta ubicada en la posición indicada
     * @param index, - ubicación de la recta deseada
     * @return recta
     */
    
    
    public Recta buscarPorIndice(int index){
        return this.rectas.get(index);
    }
    
    /**
     * Muestra atributos de coleccion de Rectas
     * @return String de atributos de coleccion de Rectas 
     */
    
    public String toString(){
        String datos="";
        int i=1;
        datos="Numero\tRecta\n";
        for (Recta c:rectas){
            
            datos+=i+"\t"+c.toString()+"\n";
            i++;
        }
        
        return datos;
        
    }
    
    
    
}
