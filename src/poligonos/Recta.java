/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;




/**
 *Recta.java - Metodos y atributos que controlan una recta de un poligono
 * @author Edgar Araya
 * @author Luis Benitez
 * @version 1.0
 */


public class Recta implements IDesplazable {
    
    private Punto puntoInicial;
    private Punto puntoFinal;

    
    /**
     * Constructor que crea una recta con los argumentos ingresados 
     * @param puntoInicial punto que contiene coordenas iniciales
     * @param puntoFinal punto que contiene coordenadas finales
     */
    
    
    public Recta(Punto puntoInicial, Punto puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }
    
    
    
      /**
     * Retorna el punto inicial de la recta
     * @return punto inicial
     */
    
    
    
    
    public Punto getPuntoInicial() {
        return puntoInicial;
    }

     /**
     * Retorna el punto final de la recta
     * @return punto final
     */
    
    
    
    
    public Punto getPuntoFinal() {
        return puntoFinal;
    }
    
    
       /**
     * Retorna la longitud del segmento representado por la recta
     * @return longitud de la recta
     */
    
    
    
    
    public float getLongitud(){
        float x= (float)Math.pow((this.puntoInicial.getX()-this.puntoFinal.getX()), 2);
        float y= (float)Math.pow((this.puntoInicial.getY()-this.puntoFinal.getY()), 2);
        return (float) Math.sqrt(x+y);
    }
    
    
    
     /**
     * Muestra atributos objeto tipo Recta en String 
     * @return puntos x e y de punto inicial y puntos x e y del punto final de la recta en String 
     */
    
    
    
    
    @Override
    public String toString(){
        return "["+"("+this.puntoInicial.getX()+","+this.puntoInicial.getY()+")"+";"+"("+this.puntoFinal.getX()+","+this.puntoFinal.getY()+")"+"]";
    }
    
    
    
    /**
     * Calcula la pendiente de la recta
     * @return valor de la pendiente de la recta
     */
    
    
    
    public float calculaPendiente(){
        if ((this.puntoInicial.getX()-this.puntoFinal.getX()) == 0) {
         throw new IllegalArgumentException("División por cero");
        }
       
        return (float)((this.puntoInicial.getY()-this.puntoFinal.getY())/(this.puntoInicial.getX()-this.puntoFinal.getX()));
    }
    
    
     /**
     * Verifica si la pendiente es perpendicular a eje X
     * @return true en caso de que sea perpendicular, false en caso de que no sea perpendicular
     */
    
    public boolean perpendicularEjeX(){
        
        return this.puntoInicial.getX()==this.puntoFinal.getX();
         
    }
    
       /**
     * Verifica si la pendiente es perpendicular a eje Y
     * @return true en caso de que sea perpendicular, false en caso de que no sea perpendicular
     */
    
    
    public boolean perpendicularEjeY(){
        return (this.puntoInicial.getY()==this.puntoFinal.getY());
        
    }
    
    
       /**
     * Calcula el ángulo entre dos líneas
     * @param otra, - la otra línea
     * @return valor del ángulo
     */
    
    public float calcularAngulo(Recta otra){
        /*
        float numerador= (float)(otra.calculaPendiente()-this.calculaPendiente());
        float denominador= (float) (1+otra.calculaPendiente()*this.calculaPendiente());
        float tanx= (float)(numerador/(denominador));
        return (float)(Math.atan((double) tanx))*180;
        */
        double ang1 = Math.atan2(this.puntoInicial.getY()-this.puntoFinal.getY(),
                               this.puntoInicial.getX() - this.puntoFinal.getX());
        double ang2 = Math.atan2(otra.puntoInicial.getY() - otra.puntoFinal.getY(),
                               otra.puntoInicial.getX() - otra.puntoFinal.getX());
        return Math.abs(180-Math.abs((float) ((ang1-ang2)*180/Math.PI)));  
    }
    
      /**
     * Retorna el punto medio de la línea
     * @return punto medio de la recta
     */
    
    public Punto getPuntoMedio(){
        float x=(float)((this.puntoInicial.getX()+this.puntoFinal.getX())/2);
        float y= (float)((this.puntoInicial.getY()+this.puntoFinal.getY())/2);
        Punto punto= new Punto((byte)x,(byte)y);
        return punto;
    }
    
    
    
       /**
     * Desplaza la recta en el eje X
     * @param delta - unidades que será desplazada la recta
     */
    
 
    @Override
    public void desplazarEjeX(byte delta){
       this.puntoInicial.desplazarEjeX(delta);
       this.puntoFinal.desplazarEjeX(delta);
    }
    
      /**
     * Desplaza la recta en el eje Y
     * @param delta - unidades que será desplazada la recta
     */
    
    @Override
    public void desplazarEjeY(byte delta){
       this.puntoInicial.desplazarEjeY(delta);
       this.puntoFinal.desplazarEjeY(delta);
    }
    
       /**
     * Compara 2 rectas, 2 rectas son iguales si sus puntos son iguales
     * @param o, - segunda recta a comparar
     * @return true en caso de igualdad y false en caso contrario
     */
    
    public boolean equals(Object o){
        
        if (o instanceof Recta){
            Recta otra = (Recta) o;
            
            return this.puntoInicial.getX()==otra.puntoInicial.getX() && this.puntoInicial.getY()==otra.puntoInicial.getY() && 
              this.puntoFinal.getX()==otra.puntoFinal.getX() && this.puntoFinal.getY()==otra.puntoFinal.getY();
      
        }
        return false;
    }
    
    
    
}
