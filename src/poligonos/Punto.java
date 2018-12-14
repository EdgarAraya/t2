package poligonos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Punto.java - Metodos y atributos que controlan un punto de un poligono
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */

public class Punto implements IDesplazable {
    
    private byte x;
    private byte y;
    
    /**
     * Constructor que crea un punto con los argumentos ingresados
     * @param x Numero de la coordenada en el eje x
     * @param y Numero de la coordenada en el eje y 
     */

    public Punto(byte x, byte y) {
        this.x = x;
        this.y = y;
    }
    
     /**
     * Obtiene coordedna del eje X
     * @return Retorna la coordenada en X del punto 
     */
    
    public byte getX() {
        return x;
    }

     /**
     * Obtiene coordedna del eje Y
     * @return Retorna la coordenada en Y del punto 
     */
    
    public byte getY() {
        return y;
    }
    
    /**
     * Desplaza el punto en el eje X
     * @param delta unidades que será desplazado el punto
     */
    
    @Override
    public void desplazarEjeX(byte delta){
        this.x =  (byte) (this.x + delta);
    }
    
     /**
     * Desplaza el punto en el eje Y
     * @param delta unidades que será desplazado el punto
     */
    
    @Override
    public void desplazarEjeY(byte delta){
        this.y= (byte)(this.y+delta);
    }
    
     /**
     * Calcula la distancia euclidiana entre 2 puntos
     * @param p punto hasta el cual se calcula distancia
     * @return distancia entre los 2 puntos
     */
    
    public float distancia(Punto p){
        return (float) Math.sqrt(Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
    }
    
    /**
     * Muestra atributos objeto tipo Punto en String 
     * @return puntos x e y en String 
     */

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    /**
     * Redefinición del método de la clase Object
     * @param o un objeto a comparar
     * @return true en caso de que sean iguales y false en caso contrario
     */
    
    @Override
    public boolean equals(Object o){
        
        if (o instanceof Punto){
        Punto p= (Punto )o;
        
        return this.x==p.x && this.y==p.y;
        }
        
        return false;
    }
    
     /**
     * Compara 2 puntos, Dos puntos son iguales si tienen las mismas coordenadas
     * @param p otro punto a comparar
     * @return true en caso de que sean iguales y false en caso contrario
     */
    
    public boolean equals(Punto p){
        
    
        return this.x==p.x && this.y==p.y;
     
 
    }
    
    
}
