/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meuvetor;
    
public class MeuVetor {
    
   private float x[];
   private int n =0;

    public MeuVetor(int qtd) {
        n = qtd;
        this.x = new float[this.n];
    }
    
    public void adcElemento(float salario){
        this.x[n] = salario;
        n++;
    }
    public void  removerElemento(int indice){
        this.x[indice] = 0;
    }
    public void modificarElemento(int indice, float salario){
        this.x[indice] = salario;
    }
    public float buscarElemento(int indice){
        return this.x[indice];
    }
    
    

    @Override
    public String toString() {
        return x.toString();
    }
    
   
   
   
    
    

    
    
}
