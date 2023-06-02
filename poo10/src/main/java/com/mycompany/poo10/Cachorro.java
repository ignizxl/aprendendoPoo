/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo10;

/**
 *
 * @author João Igor
 */
public class Cachorro extends Lobo{
    //fazendo a sobrescrita do método abstrato
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    //praticando o polimorfismo de sobrecarga, escrevendo vários métodos de mesmo nome, dentro da mesma classe, mas com assinaturas diferentes!
    public void reagir (String frase){
        if (frase.equals("Toma Comida") || frase.equals("Olá")) {
            System.out.println("Abanar rabo e Latir!");
            this.emitirSom();
        } else {
            System.out.println("Rosnar!");
        }
   }
    public void reagir (int hora, int minutos){
        if (hora < 12){
            System.out.println("Abanar rabo! ");
        } else if (hora >= 18){
            System.out.println("Ignorar! ");
        } else {
            System.out.println("Abanar e latir! ");
            this.emitirSom();
        }
    }
    public void reagir (boolean dono){
        if (dono){
            System.out.println("Abanar! ");
        } else {
            System.out.println("Rosnar e latir! ");
            this.emitirSom();
        }
    }
    public void reagir (int idade, double peso){
        if (idade < 5){            
            if(peso < 10){
                System.out.println("Abanar! ");
            } else {
                System.out.println("Latir! ");
                this.emitirSom();
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnar! ");
            } else {
                System.out.println("Ignorar! ");
            }
        }
    }
}
