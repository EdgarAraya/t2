/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *
 * @author luisbenitez
 */
public class ListaPuntos {
    
    private ArrayList<Punto> puntos;

    public ListaPuntos() {
        this.puntos = new ArrayList();
    }
    
    public boolean agregarPunto(Punto p){
        for(Punto alguno:this.puntos){
            if(alguno.getX()!=p.getX() || alguno.getY()!=p.getY()){
                puntos.add(p);
                return true;
            }
        } 
        return false;
    }
    
    public int totalPuntos(){
        return puntos.size();
    }
    
    public Punto buscarPorIndice(int index){
        return puntos.get(index);
    }
    
}
