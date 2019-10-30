package prototipointerface;


import java.io.Serializable;


public class Triangulo extends Ponto implements Serializable {

    private double ladoA, ladoB, ladoC, base, altura, perimetro, area;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura, double perimetro, double area, float eixoX, float eixoY) {
        super(eixoX, eixoY);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }


    public void calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);

        this.setPerimetro(ladoA + ladoB + ladoC);
    }

    public void calcularArea(double base, double altura) {
        this.altura = altura;
        this.base = base;
        this.setArea(base * altura / 2);

    }

    @Override
    public String toString() {
        return "Triangulo{ "+super.toString() + " ,ladoA=" + getLadoA() + ", ladoB=" + getLadoB() + ", ladoC=" + getLadoC() + 
                ", base=" + getBase() + ", altura=" + getAltura() + ", perimetro=" + getPerimetro() + ", area=" + getArea() + '}';
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    


}
