/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo05;

/**
 *
 * @author João Igor
 */
public class Lutador {
    //atributos 
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int numeroDeVitorias;
    private int numeroDeDerrotas;
    private int numeroDeEmpates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int numeroDeVitorias, int numeroDeDerrotas, int numeroDeEmpates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setNumeroDeVitorias(numeroDeVitorias);
        this.setNumeroDeDerrotas(numeroDeDerrotas);
        this.setNumeroDeEmpates(numeroDeEmpates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }
        else if (this.getPeso() <= 70.3){
            this.categoria = "Peso Leve";
        
        }
        
        else if(this.getPeso() <= 83.9){
            this.categoria = " Peso Médio";
            
        }
        
        else if (this.getPeso() <= 120.2){
            this.categoria = "Peso Pesado";
        }
        
        else{
            this.categoria = "Inválido";
        }
    
    }

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }

    public int getNumeroDeDerrotas() {
        return numeroDeDerrotas;
    }

    public void setNumeroDeDerrotas(int numeroDeDerrotas) {
        this.numeroDeDerrotas = numeroDeDerrotas;
    }

    public int getNumeroDeEmpates() {
        return numeroDeEmpates;
    }

    public void setNumeroDeEmpates(int numeroDeImpates) {
        this.numeroDeEmpates = numeroDeImpates;
    }
    
    
    
    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + " metros");
        System.out.println("Peso: " + this.getPeso() + "KG");
        System.out.println("Cartel:");
        System.out.println(this.getNumeroDeVitorias() + "/" + this.getNumeroDeDerrotas() + "/" + this.getNumeroDeEmpates());
        System.out.println("Nª Vitórias: " + this.getNumeroDeVitorias());
        System.out.println("Nª Derrotas: " + this.getNumeroDeDerrotas());
        System.out.println("Nª Empates: " + this.getNumeroDeEmpates());
        System.out.println("------------------------------");
    }
    
    public void status(){
        System.out.println("------------------------------");
        System.out.println(this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Cartel: " + this.getNumeroDeVitorias() + "/" + this.getNumeroDeDerrotas() + "/" + this.getNumeroDeEmpates());
        System.out.println("------------------------------");
    }
    
    public void ganharLuta(){
        this.setNumeroDeVitorias(this.getNumeroDeVitorias() + 1);
        System.out.println("You Winner!");
        
    }
    
    public void perderLuta(){
        this.setNumeroDeDerrotas(this.getNumeroDeDerrotas() + 1);
        System.out.println("You lose!");
    }
    
    
    public void empatarLuta(){
        this.setNumeroDeEmpates(this.getNumeroDeEmpates() + 1);
        System.out.println("Draw!");
        
    }
}
