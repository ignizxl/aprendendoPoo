/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo07;

/**
 *
 * @author João Igor
 */
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    //métodos de acesso e modificadores
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //método receberAumento
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
        
    
    }
}
