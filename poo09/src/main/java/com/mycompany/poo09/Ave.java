/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Ave extends Animal {
    //atributo
    private String corDaPena;
    
    //construtor
    public Ave( double peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros);
        this.corDaPena = corDaPena;
    }
    //fazendo a sobrescrita dos métodos abstratos da classe animal
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Alimentando ave!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }
    //método específico de ave
    public void fazerNinho(){
        System.out.println("Construindo ninho!");
    }
    //get e set 
    public String getCorDaPena() {
        return corDaPena;
    }
    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    @Override
    public String toString() {
        return "Ave{" + "\n corDaPena: " + corDaPena + "\n Peso: " + super.getPeso() + "\n Idade: " + super.getIdade() + "\n Membros: " + super.getMembros() + '}';
    }
    
}
