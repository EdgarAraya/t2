package poligonos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisbenitez
 */
public class Punto implements IDesplazable {
    
    private byte x;
    private byte y;

    public Punto(byte x, byte y) {
        this.x = x;
        this.y = y;
    }
    
    public byte getX() {
        return x;
    }

    public byte getY() {
        return y;
    }
    
    @Override
    public void desplazarEjeX(byte delta){
        this.x =  (byte) (this.x + delta);
    }
    
    @Override
    public void desplazarEjeY(byte delta){
        this.y= (byte)(this.y+delta);
    }
    
    public float distancia(Punto p){
        return (float) Math.sqrt(Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public boolean equals(Punto p){
        return this.x==p.x && this.y==p.y;
    }
    
    
    
}
