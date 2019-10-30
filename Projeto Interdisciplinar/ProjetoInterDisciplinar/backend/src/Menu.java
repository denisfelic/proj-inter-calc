
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {

    private ArrayList arrList = new ArrayList();
    private int count = 0;
    public static void main(String args[]) {
        new Menu();
    }

    public Menu() {
        novoTriangulo();
      
    }

    public void novoTriangulo() {
        arrList.add(new Triangulo());
    }

    public double calcularPerimetroTriangulo(double LadoA, double LadoB, double ladoC) {
        ((Triangulo) arrList.get(count)).calcularPerimetro(LadoA, LadoB, ladoC);
        return ((Triangulo) arrList.get(count)).getPerimetro();
    }

    public double calcularAreaTriangulo(double base, double altura) {
        ((Triangulo) arrList.get(count)).calcularArea(base, altura);
        return ((Triangulo) arrList.get(count)).getArea();
    }

    public void salvarObjetos() {
        JOptionPane.showMessageDialog(null, "Objeto Salvo");
        novoTriangulo();
        count++;
    }

    public String carregarObjeto() {
         String texto = "";
         
        for (int i = 0; i < arrList.size(); i++) {
            texto += arrList.get(i).toString() + "\n";

        }
        return texto;
    }
    
    public void serializar(String nomeArquivo){
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream serializa = new ObjectOutputStream(arquivo);
             for (int i = 0; i < arrList.size(); i++) {
                serializa.writeObject(arrList.get(i));  //gravamos o objeto no arquivo
            }
            serializa.close();
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Objeto salvo com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ao gravar o arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void descerealizarArquivo(String localArquivo){
        
     FileInputStream fis;
        ObjectInputStream obj;
        try {
            fis = new FileInputStream(localArquivo); //Ex: (C:/Usuarios/Denis/Desktop/arquivo.dat)
            obj = new ObjectInputStream(fis);
            arrList.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {     
                    Object arquivo = obj.readObject(); // lê um objeto do arquivo
                    arrList.add(arquivo); // adiciona na lista o objeto lido
                   
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
    } //fim do método carregar

}
