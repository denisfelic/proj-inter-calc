package prototipointerface;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {

    private ArrayList ArrayObjetos = new ArrayList(); //inicialização  do ArrayList
    private int cont = -1;

    public static void main(String[] args) {
        PrototipoInterface();   //inicialização da interface

    }

    public Menu() {

    }

    public static void PrototipoInterface() {  // Método para deixar a interface Visivel
        Janela janela = new Janela();
        janela.setVisible(true);
    }

    public double triangulo_calcularPerimetro(double ladoA, double ladoB, double ladoC) { // calcula o perimetro do triangulo
        // calcular perimetro
        ((Triangulo) ArrayObjetos.get(cont)).calcularPerimetro(ladoA, ladoB, ladoC);
        return ((Triangulo) ArrayObjetos.get(cont)).getPerimetro();

    }

    public double triangulo_calcularArea(double base, double altura) { //calcula a area do triangulo
        ((Triangulo) ArrayObjetos.get(cont)).calcularArea(base, altura);
        return ((Triangulo) ArrayObjetos.get(cont)).getArea();
    }

    public double paralelepide_calcularVolume(double comprimento, double altura, double largura) {  //calcula o volume do paralelepipedo
        ((Paralelepipedo) ArrayObjetos.get(cont)).CalculoVolumeDoParalelepipedo(comprimento, altura, largura);
        return ((Paralelepipedo) ArrayObjetos.get(cont)).getVolume();
    }

    public double paralelepipedo_calcularArea(double comprimento, double altura, double largura) {
        ((Paralelepipedo) ArrayObjetos.get(cont)).calcularAreaTot(comprimento, altura, largura);
        return ((Paralelepipedo) ArrayObjetos.get(cont)).getArea();
    }

    public void adicionarEixos(String obj, float x, float y) { //adiciona os ponto x e y;
        switch (obj) {
            case "Triangulo":
                ((Triangulo) ArrayObjetos.get(cont)).setEixoX(x);
                ((Triangulo) ArrayObjetos.get(cont)).setEixoY(y);
                break;
            case "Paralelepipedo":
                ((Paralelepipedo) ArrayObjetos.get(cont)).setEixoX(x);
                ((Paralelepipedo) ArrayObjetos.get(cont)).setEixoY(y);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro ao definir o ponto da classe" + obj);
                break;
        }
    }

    public void criarObjeto(String objeto) {
        switch (objeto) {
            case "Triangulo":
                ArrayObjetos.add(new Triangulo());
                break;
            case "Paralelepipedo":
                ArrayObjetos.add(new Paralelepipedo());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro, paramentros invalidos.");
                break;
        }

        cont++;
    }

    public void gravarObjeto(String caminho) { // toda vez que o usuario salvar um objeto esse novo metodo é adicionado
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream serializa = new ObjectOutputStream(arquivo);
            for (int i = 0; i < ArrayObjetos.size(); i++) {
                serializa.writeObject(ArrayObjetos.get(i));  //gravamos o objeto no arquivo
            }
            serializa.close();
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Objeto salvo com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ao gravar o arquivo", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void serializarArquivo(String caminho) {
        FileInputStream fis;
        ObjectInputStream obj;
        try {
            fis = new FileInputStream(caminho); //Ex: (C:/Usuarios/Denis/Desktop/arquivo.dat)
            obj = new ObjectInputStream(fis);
            ArrayObjetos.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {
                    Object arquivo = obj.readObject(); // lê um objeto do arquivo
                    ArrayObjetos.add(arquivo); // adiciona na lista o objeto lido

                } catch (EOFException normalEof) {
                    // EOF (end of file), situação normal => acabaram os objetos
                    sair = true;
                }
            } while (!sair);
            obj.close();
            fis.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro carregar o arquivo" + e.getMessage());
        }
    }

    public String carregarArquivo() {
        String texto = "";

        for (int i = 0; i < ArrayObjetos.size(); i++) {

            texto += ArrayObjetos.get(i).toString() + "\n";

        }
        return texto;
    }

    /*  public double calcularVolume(double a, double b){
        
       return a+b;
    }
    
    public void guardarObjetoEmArray(String valorA, String valorL, String valorR){
        String n1 = "objeto cone:  Valor Altura: "+valorA+"|Largura: "+valorL+"| Volume: "+valorR;
        objetoCone.add(n1);
        System.out.println(objetoCone.get(0));
        vizualizarObjeto();
                
    }
    public  void vizualizarObjeto(){
                System.out.println(objetoCone.get(0));
                

      
    }*/
}
