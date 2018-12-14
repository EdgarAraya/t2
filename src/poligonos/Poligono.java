/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.ArrayList;

/**
 *Poligono.java - Metodos y atributos que controlan un poligono
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */
public class Poligono implements IOperaciones, Comparable<Poligono> {
    
    private ArrayList<Recta> lineas;
    private boolean cerrado=false;

    public Poligono(){
        
        this.lineas= new ArrayList();
    }
    
    /**
     * Agrega la línea al polígono
     * @param nueva - nueva linea que se pretende agregar
     * @return true en caso de que se logre agregar y false en caso contrario
     */
    

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
    
      /**
     * Verifica si la línea puede unirse a la última línea existente del polígono
     * @param candidata, - línea candidata a ser agregada
     * @return true en caso de que sea válida y false en caso contrario
     */
    
    
    
    
    
    public boolean verificarLinea(Recta candidata){
        
        return (this.lineas.get(this.lineas.size()-1).getPuntoFinal().equals(candidata.getPuntoInicial()) &&
                this.lineas.get(this.lineas.size()-1).calcularAngulo(candidata)!=180 &&
                this.lineas.get(this.lineas.size()-1).calcularAngulo(candidata)!=0);//test
        
        
    }
       /**
     * Calcula y retorna el perímetro del polígono
     * @return suma de todas las longitudes de los lados del polígono
     */
    
    
    
    public float perimetro(){
        float perimetro=0;
        
        for(Recta c:this.lineas){
            perimetro+=c.getLongitud();
        }
        
        return perimetro;
    }
    
    
     /**
     * Determina si el polígono es regular Un polígono es regular si todos sus lados son iguales y si todos sus ángulos son iguales
     * @return true en caso de que sea regular y false en caso contrario
     */
    
    
    
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
    
    /**
     * Obtiene el sub-polígono que se forma uniendo los puntos medios de los lados del polígono
     * @return polígono formado por los puntos medios en caso de que sea regular y null en caso contrario
     */
    
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
    
     /**
     * Redefinición del método de la clase Object. Dos polígonos son iguales si todas sus lineas son iguales
     * @param o, - objeto con el cual se compara
     * @return true en caso de igualdad y false en caso contrario
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
    
     /**
     * Desplaza el polígono en el eje X
     * @param delta - unidades que será desplazado el polígono
     */
    
    public void desplazarEjeX(byte delta){  
        for (Recta c: this.lineas){
            c.desplazarEjeX(delta);
  
        }
        
    }
       /**
     * Desplaza el polígono en el eje Y
     * @param delta - unidades que será desplazado el polígono
     */
    public void desplazarEjeY(byte delta){
        
        
        for (Recta c: this.lineas){
            
            c.desplazarEjeY(delta);
            
            
        }
    }
    
     /**
     * Método proveniente de la interface Comparable
     * @param p, - polígono con el cual se compara
     * @return número que indica el criterio de "orden"
     */
    public int compareTo(Poligono p){
        
        return (int) (p.perimetro()-this.perimetro());
    }
    
    @Override
    
       /**
     * Muestra atributos objeto tipo Poligono
     * @return String con atributos del poligono 
     */
    
    
    public String toString(){
        String datos="\nNumero de lados:"+this.lineas.size()+ "\nRectas:\n";
        int i=1;
        for(Recta c:this.lineas){
            datos+=c.toString()+"\n";
            
        }
        datos+="Perimetro: "+this.perimetro();
        
        
        //datos+="Es Regular: " +(this.esRegular()? "Si":"No");
            
        
        
        if(this.esCerrado()){
            datos+="\nEs Regular: ";

            if(this.esRegular())
                datos+="Si";
            else
                datos+="No";
        
        }
        
        return datos;
    }
    
     /**
     * Determina si dos poligonos son colaterales
     * @param p, - otro polìgono a comparar
     * @return true en caso de que sean colaterales y false en caso contrario
     */
    
    
    
    public boolean sonColaterales(Poligono p){
        
        
        for (Recta c: p.lineas){
            if (this.lineas.contains(c)){
                return true;
            }   
        }
        return false;
    }
    
    
    /**
     * Determina si un poligono es cerrado
     * Una figura geométrica es cerrada si el límite entero de la figura es parte de la figura
     * @return true en caso de sea cerrada, false en caso que no
     */
    
    public boolean esCerrado(){
        
        return this.lineas.get(0).getPuntoInicial().equals(this.lineas.get(this.lineas.size()-1).getPuntoFinal());
           

    }

}