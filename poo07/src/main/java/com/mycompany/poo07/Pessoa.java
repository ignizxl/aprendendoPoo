/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo07;

/**
 *
 * @author João Igor
 */
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //métodos de acesso e modificadores
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
    //método fazerAniversario
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }  
    //fazendo a sobrescrita do método toString 
    @Override
    public String toString() {
        return "Pessoa{" + "\n Nome = " + nome + "\n  Idade = " + idade + "\n Sexo = " + sexo + '}';
    } 
}
