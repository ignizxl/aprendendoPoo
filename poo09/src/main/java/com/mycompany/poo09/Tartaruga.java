/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Tartaruga extends Reptil {
    //construtro
    public Tartaruga(double peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros, corDaEscama);
    }
    //fazendo a sobrescrita do método locomover
    @Override
    public void locomover(){
        System.out.println("Andando em slow motion!");
    }
}
