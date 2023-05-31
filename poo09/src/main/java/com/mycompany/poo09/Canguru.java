/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Canguru extends Mamifero{
    //construtor
    public Canguru(double peso, int idade, int membros, String corDoPelo){
        super(peso, idade, membros, corDoPelo);
    }
    //fazendo a sobrescrita do método locomover
    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }
    public void usarBolsa(){
        System.out.println("Usando bolsa!");
    }
}
