/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo08;

/**
 *
 * @author João Igor
 */
public abstract class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //método fazer aniversário é um 'final', ou seja, ele não poderá ser sobrescrito. Eu posso usar o final nas classes também
    public final void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("O " + this.getNome() + " fez aniversário! ");
    }
    //getters e setters 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Pessoa{" + "\n nome = " + nome + "\n idade = " + idade + "\n sexo = " + sexo + '}';
    }  
}
