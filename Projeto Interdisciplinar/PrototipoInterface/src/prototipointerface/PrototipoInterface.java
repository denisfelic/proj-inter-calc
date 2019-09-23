
package prototipointerface;

import java.util.ArrayList;

public class PrototipoInterface {
    private ArrayList objetoCone = new ArrayList(); //inicialização  do ArrayList
    
    public static void main(String[] args) {
        PrototipoInterface();


    }

    public PrototipoInterface() {        

    }
    
    

    public  static void PrototipoInterface() {
        Janela janela = new Janela();
        janela.setVisible(true);

    
       
    }
    
        
    public double calcularVolume(double a, double b){
        
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
                

      
    }
  
    
}
