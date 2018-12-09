/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

/**
 *@author Edgar Araya
 *@author Luis Benitez
 */
public class Recta implements IDesplazable {
    
    private Punto puntoInicial;
    private Punto puntoFinal;

    public Recta(Punto puntoInicial, Punto puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }
    
    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }
    
    public float getLongitud(){
        float x= (float)Math.pow((this.puntoInicial.getX()-this.puntoFinal.getX()), 2);
        float y= (float)Math.pow((this.puntoInicial.getY()-this.puntoFinal.getY()), 2);
        return (float) Math.sqrt(x+y);
    }
    
    @Override
    public String toString(){
        return "["+"("+this.puntoInicial.getX()+","+this.puntoInicial.getY()+")"+";"+"("+this.puntoFinal.getX()+","+this.puntoFinal.getY()+")"+"]";
    }
    
    public float calculaPendiente(){
        if ((this.puntoInicial.getX()-this.puntoFinal.getX()) == 0) {
         throw new IllegalArgumentException("División por cero");
        }
       
        return (float)((this.puntoInicial.getY()-this.puntoFinal.getY())/(this.puntoInicial.getX()-this.puntoFinal.getX()));
    }
    
    public boolean perpendicularEjeX(){
        
        return this.puntoInicial.getX()==this.puntoFinal.getX();
        
        
       
    }
    
    public boolean perpendicularEjeY(){
        return (this.puntoInicial.getY()==this.puntoFinal.getY());
        
    }
    
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
    
    public Punto getPuntoMedio(){
        float x=(float)((this.puntoInicial.getX()+this.puntoFinal.getX())/2);
        float y= (float)((this.puntoInicial.getY()+this.puntoFinal.getY())/2);
        Punto punto= new Punto((byte)x,(byte)y);
        return punto;
    }
    
    @Override
    public void desplazarEjeX(byte delta){
       this.puntoInicial.desplazarEjeX(delta);
       this.puntoFinal.desplazarEjeX(delta);
    }
    
    @Override
    public void desplazarEjeY(byte delta){
       this.puntoInicial.desplazarEjeY(delta);
       this.puntoFinal.desplazarEjeY(delta);
    }
    
    public boolean equals(Recta otra){
      return this.puntoInicial.getX()==otra.puntoInicial.getX() && this.puntoInicial.getY()==otra.puntoInicial.getY() && this.puntoFinal.getX()==otra.puntoFinal.getX() && this.puntoFinal.getY()==otra.puntoFinal.getY();
    }
    
    
    
}
