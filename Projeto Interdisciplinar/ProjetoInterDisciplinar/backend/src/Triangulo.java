
import java.io.Serializable;


public class Triangulo implements Serializable {

    private double ladoA, ladoB, ladoC, base, altura, perimetro, area;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura, double perimetro, double area) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public void calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        this.perimetro = ladoA + ladoB + ladoC;
    }

    public void calcularArea(double base, double altura) {
        this.area = base * altura / 2;

    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", area=" + area + '}';
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
