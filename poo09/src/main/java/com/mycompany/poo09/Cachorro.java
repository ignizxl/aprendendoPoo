/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Cachorro extends Mamifero{
    //construtor
    public Cachorro(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }
    
    //sobrescrevendo o método abstrato emitirSom
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    //método específico de cachorro
    public void enterrarOsso(){
        System.out.println("Enterrando osso!");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo!");
    }
}
