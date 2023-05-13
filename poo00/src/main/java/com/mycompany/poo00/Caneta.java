/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo00;

/**
 *
 * @author João Igor
 */
public class Caneta {
    
    //atributos da Caneta
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //criando um metódo rabiscar, que recebe como parâmetro uma variável chamada estado que é do tipo boolean 
    void rabiscar(boolean estado){
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
    
    //criando o metódo imprime que irá mostra na tela o valor de todos os seus atributos 
    void imprime(){
        System.out.println("Um caneta de cor " + this.cor + " e de modelo " + this.modelo + ";");
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Estado atual: " + this.tampada);
    }
    
    
}
