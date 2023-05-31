/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Reptil extends Animal {
    //atributo
    private String corDaEscama;
    
    //construtor
    public Reptil(double peso, int idade, int membros, String corDaEscama) {    
        super(peso, idade, membros);
        this.corDaEscama = corDaEscama;
    }

    //fazendo a sobrescrita dos métodos abstratos da classe Animal
    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Alimentando réptil");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    //get e set
    public String getCorDaEscama() {
        return corDaEscama;
    }
    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    @Override
    public String toString() {
        return "Reptil{" + "corDaEscama: " + corDaEscama + "\n Peso: " + super.getPeso() + "\n Idade: " + super.getIdade() + "\n Membros: " + super.getMembros() + '}';
    }
}
