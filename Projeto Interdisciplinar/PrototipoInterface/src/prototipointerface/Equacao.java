package prototipointerface;

import java.io.Serializable;

public class Equacao implements Serializable {

    private double delta, x1, x2, a, c, b;

    public Equacao() {
    }

    public Equacao(double delta, double x1, double x2, double a, double c, double b) {
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
        this.a = a;
        this.c = c;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Equacao{" + "delta=" + delta + ", x1=" + x1 + ", x2=" + x2 + ", a=" + a + ", c=" + c + ", b=" + b + '}';
    }

    public void calcularEquacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (b * b) - 4 * (a * c);
        this.x1 = (- (b +(Math.sqrt(this.delta))) / (2 * a));
        this.x2 = (- (b - (Math.sqrt(this.delta))) / (2 * a));

    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
