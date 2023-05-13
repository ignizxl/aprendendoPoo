/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo01;

/**
 *
 * @author João Igor
 */
public class Caneta {
    
    //atributos da Caneta
    //visibilidade dos atributos
    // + = público, é acessado pela classe atual e todas as outras 
    // - = privado, só é acessado pela classe atual 
    // # = protegido, é acessado pela classe atual e as suas subclasses 
    
    public String modelo;   // + 
    public String cor;      // +
    private float ponta;    // -
    protected int carga;    // #
    private boolean tampada;// - 
    
   //metódo público 
    public void escrever(){
        
    }
    


    //criando um metódo público rabiscar, que recebe como parâmetro uma variável chamada estado que é do tipo boolean 
    public void rabiscar(boolean estado){
        //o atributo tampada recebe o que foi passado como parâmetro em estado 
        this.tampada = estado;
        //se tampada for igual a false, faça
        if(tampada == false){
            //mostre na tela 'rabiscando'
            System.out.println("Rabiscando!");
        }
        //senão, mostre na tela 'erro'
        else{
            System.out.println("Erro. A caneta está tampada!");
        }
        
    }
        
    
    //criando o metódo público imprime que irá mostra na tela o valor de todos os seus atributos 
    public void imprime(){
        System.out.println("Um caneta de cor " + this.cor + " e de modelo " + this.modelo + ";");
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Estado atual: " + this.tampada);
    }
    
    //como os metódos destampar e tampar são públicos, eles vão dar 'acesso' ao atributo 'tampada', por mais que esse atruibuto seja privado
    //como o atributo tampado é privado e ele está dentro da classe caneta(que é a classe atual) eu posso 'mexer' nesse atributo aqui dentro,
    //mas eu não posso acessar ele dentro da classe poo01
    public void destampar(){
       this.tampada = false; 
    }
    
    public void tampar(){
        this.tampada = true;
       
    }
}
