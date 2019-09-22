
package projetointerdisciplinar;


public class Cone {
    private String nomeObjeto; 
    private double raio, altura, volume,area;
    private double pi = 3.1416;

    public Cone() {
        this.raio = 0;
        this.altura = 0;
    }
 
     
    public void calcAreaCone(){
        
    }
    public double calcularVolumeCone(double r, double h){
        // v = (pi*r²*h)3
        setVolume((pi*Math.pow(r, 2)*h)/3);
        return getVolume();
    }

    public String getNomeObjeto() {
        return nomeObjeto;
    }

    public void setNomeObjeto(String nomeObjeto) {
        this.nomeObjeto = nomeObjeto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
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

    @Override
    public String toString() {
        return "Cone{" + "nomeObjeto=" + nomeObjeto + ", raio=" + raio + ", altura=" + altura + ", volume=" + volume + ", area=" + area + '}';
    }

   

  

   
    
}

