package prototipointerface;

import java.io.Serializable;


public class Cilindro extends Ponto implements Serializable{
    private double raio, altura, volume, area;   

    public Cilindro() {
    }

   

    public Cilindro(float raio, float altura) {
        this.raio = raio;
        this.altura = altura;
 
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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

 

 
    public void calcularAreaTotal(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.area = 2*3.1415*raio* (raio+altura);
        System.out.println(raio+","+ altura+","+ this.area);
    }

    public void calcularVolume(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.volume = (3.1415*(Math.pow(raio, 2)))*altura;
    }
    

    @Override
    public String toString() {
        return ("Cilindro:[ "+super.toString()+" raio= " + this.getRaio() + 
                " ,altura= " + this.getAltura() + 
                " ,Area Total = " + this.area+ " cm²" +
                " ,Volume = " + this.volume+ " cm³");
          
    }
}
