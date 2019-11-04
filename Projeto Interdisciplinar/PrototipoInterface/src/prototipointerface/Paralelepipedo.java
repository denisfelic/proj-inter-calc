package prototipointerface;

import java.io.Serializable;

public class Paralelepipedo extends Ponto implements Serializable {

    private double comprimento, largura, altura;
    private double volume, area;

    public Paralelepipedo() {
    }

    public Paralelepipedo(double comprimento, double largura, double altura, float eixoX, float eixoY) {
        super(eixoX, eixoY);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public void CalculoVolumeDoParalelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.volume = comprimento * largura * altura;

    }

    public void calcularAreaTot(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.area = 2*((largura*comprimento)+(largura*altura)+(comprimento*altura));

        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("largura: " + this.largura);
        System.out.println("altura: " + this.altura);
        System.out.println("area: " + this.area);

    }

    @Override
    public String toString() {
        return "Paralelepipedo{ " + super.toString() + ", comprimento=" + comprimento + ", largura=" + largura + ", altura=" + altura + ", volume=" + volume + ", area=" + area + '}';
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
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

}
