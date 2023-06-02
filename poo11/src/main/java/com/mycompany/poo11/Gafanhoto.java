/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11;

/**
 *
 * @author João Igor
 */
public class Gafanhoto extends Pessoa {
    //atributos 
    private String login;
    private int totalAssistido;
    
    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login, int totalAssistido) {
        //pegando os valores da classe abstrata Pessoa
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    //get e set 
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    //método viuMaisUm
    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido() + 1);
    }
    //método toString

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + " Login = " + login + "\n Total Assistido = " + totalAssistido + '}';
    }
    
}
