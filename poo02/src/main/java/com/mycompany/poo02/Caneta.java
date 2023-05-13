/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo02;

/**
 *
 * @author João Igor
 */
public class Caneta {
    
    //atributos
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    
    
    //metódo construtor que recebe como parâmetro o modelo, a cor e a ponta 
    public  Caneta(String mod, String c, float p){
        this.modelo = mod;
        this.cor = c;
        this.ponta = p;
        
        
        
    }
    
    //metódos de acesso getter e setter 
    public String getModelo() {
        
        return this.modelo;
        
   
    }
    
    public String setModelo(String m){
        this.modelo = m;
        
        return null;
        
    }
    
    public float getPonta(){
        
        return this.ponta;
    }
    
    public float setPonta(float p){
        this.ponta = p;
        
        return ponta;
    }
    
    public void imprime(){
        System.out.println("Informaçõe sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Está tampada ? " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
    
    public boolean tampar(){
        this.tampada = true;
        
        return tampada;
    }
    
    public boolean destampada(){
        this.tampada = false;
        
        return tampada; 
    }
}
