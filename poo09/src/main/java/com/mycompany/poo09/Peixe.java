/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Peixe extends Animal{
    //atributo
    private String corDaEscama;
   //construtor
    public Peixe(double peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros);
        this.corDaEscama = corDaEscama;
    }
    //fazendo a sobrescrita dos métodos abstratos da classe animal
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Alimentando peixe!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }
    //método específico do peixe
    public void soltarBolhas(){
        System.out.println("Soltando bolhas!");
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
        return "Peixe{" + "corDaEscama: " + corDaEscama + "\n Peso: " + super.getPeso() + "\n Idade: " + super.getIdade() + "\n Membros: " + super.getMembros() + '}';
    }
}
