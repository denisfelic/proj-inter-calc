package prototipointerface;

import java.io.Serializable;


public class Ponto  implements Serializable{
        private float eixoX;
        private float eixoY;

    public Ponto() {
    }

    public Ponto(float eixoX, float eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
    
    

    @Override
    public String toString() {
        return "Ponto{" + "eixoX=" + getEixoX() + ", eixoY=" + getEixoY() + '}';
    }

    public float getEixoX() {
        return eixoX;
    }

    public void setEixoX(float eixoX) {
        this.eixoX = eixoX;
    }

    public float getEixoY() {
        return eixoY;
    }

    public void setEixoY(float eixoY) {
        this.eixoY = eixoY;
    }
    
    
    }
    


