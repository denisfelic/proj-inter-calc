
package prototipointerface;

import java.io.Serializable;


public class Quadrado extends Ponto implements Serializable {
    double ladoA, area,perimetro; 

    public Quadrado() {
    }

    public Quadrado(double ladoA, double area, double perimetro, float eixoX, float eixoY) {
        super(eixoX, eixoY);
        this.ladoA = ladoA;
        this.area = area;
        this.perimetro = perimetro;
    }
    public void calcularPerimetro(double ladoA){
        this.ladoA = ladoA;
        this.perimetro = ladoA*4;
    }
    
    public void calcularArea(double ladoA){
        this.ladoA = ladoA;
        this.area = ladoA*ladoA;
    }

    @Override
    public String toString() {
        return "Quadrado{" +super.toString()+ "Lado A: " + ladoA + "Lado B: " + ladoA + ", Area: " + area + ", Perimetro: " + perimetro + '}';
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    
}
