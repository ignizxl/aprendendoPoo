/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo07;

/**
 *
 * @author João Igor
 */
public class Aluno extends Pessoa {
    //atributos
    private int matricula;
    private String curso;
    //métodos de acesso e modificadores
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //método cancelarMatricula
    public void cancelarMatricula(){
        this.setMatricula(0);
        System.out.println("Cancelando matricula!");
    }
}
