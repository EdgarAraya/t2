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
    
    public void agregarRecta(Recta r){
        this.rectas.add(r);
    }
    
    public int totalRectas(){
        return this.rectas.size();
    }
    
    public Recta buscarPorIndice(int index){
        return this.rectas.get(index);
    }
    
    
    
    
    
}
