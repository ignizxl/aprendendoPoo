/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Mamifero extends Animal{
    //atributo
    private String corDoPelo;
    //construtor
    public Mamifero(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros);
        this.corDoPelo = corDoPelo;
    }
    //fazendo a sobrescrita dos métodos abstratos da classe Animal
    @Override
    public void locomover(){
        System.out.println("Correndo!");
    }
    @Override
    public void alimentar(){
        System.out.println("Alimentando o mamífero!");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Som de mamífero!");
    }
    //get e set
    public String getCorDoPelo() {
        return corDoPelo;
    }
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    @Override
    public String toString() {
        return "Mamifero{" + "corDoPelo: " + corDoPelo + "\n Peso: " + super.getPeso() + "\n Idade: " + super.getIdade() + "\n Membros: " + super.getMembros() + '}';
    }
}
