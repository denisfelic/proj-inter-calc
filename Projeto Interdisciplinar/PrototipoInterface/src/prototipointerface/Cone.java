
package prototipointerface;

import java.io.Serializable;


public class Cone extends Ponto implements Serializable{
    private double altura, raio, volume, area;

    public Cone() {
    }

    public Cone(double altura, double raio, double volume, double area, double geratriz, float eixoX, float eixoY) {
        super(eixoX, eixoY);
        this.altura = altura;
        this.raio = raio;
        this.volume = volume;
        this.area = area;
    }

  
    
    public void  calcularArea(double raio, double geratriz){
 
        this.area =  3.1415* raio *(raio + geratriz);
       
    }
    
    public void calcularVolume(double raio, double altura){
        this.volume = (3.1415*Math.pow(raio, 2)*altura) / 3;
    }
    @Override
    public String toString() {
        return "Cone{" +super.toString()+ "altura=" + altura + ", raio=" + raio + ", volume=" + volume + ", area=" + area + '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    
    
    
    
}
