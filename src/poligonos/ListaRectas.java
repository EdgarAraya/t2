/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *@author Edgar Araya
 * @author luisbenitez
 */
public class ListaRectas {
    
    private ArrayList<Recta>rectas;

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
    
    
    
    public boolean agregarRecta(Recta r){
        
        if (!rectas.contains(r)){
        
             this.rectas.add(r);
             return true;
        
        }
        return false;
    }
    
    public int totalRectas(){
        return this.rectas.size();
    }
    
    public Recta buscarPorIndice(int index){
        return this.rectas.get(index);
    }
    
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
