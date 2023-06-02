/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11;

/**
 *
 * @author João Igor
 */
public abstract class Pessoa {
    //atributos 
    protected String nome;
    protected int idade;
    protected String Pessoa;
    protected double experiencia;
    //construtor 
    public Pessoa(String nome, int idade, String Pessoa) {
        this.nome = nome;
        this.idade = idade;
        this.Pessoa = Pessoa;
        this.experiencia = 0;
    }
    //get e set
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
    public String getPessoa() {
        return Pessoa;
    }
    public void setPessoa(String Pessoa) {
        this.Pessoa = Pessoa;
    }
    public double getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    
    public void ganharExperiencia(){
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "\n Nome = " + nome + "\n Idade = " + idade + "\n Pessoa = " + Pessoa + "\n Experiência = " + experiencia + '}';
    }
}
