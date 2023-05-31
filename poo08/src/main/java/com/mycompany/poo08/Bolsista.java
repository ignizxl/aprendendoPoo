/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo08;

/**
 *
 * @author João Igor
 */
public class Bolsista extends Aluno {
    //atributo
    private int bolsa;
    
    //método renovar bolsa
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluono " + this.getNome() + "!");     
    }
    //fazendo a sobrescrita do método pagar mensalidade da classe 'Aluno'
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }    
}
