/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo03;

/**
 *
 * @author João Igor
 */
public class ContaBanco {
    
    public int numeroDaConta;
    protected String tipoDeConta;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0.0;
        this.status = false;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        
        if (this.isStatus() == false){
            System.out.println("Criando conta...");

            this.setTipoDeConta(tipo);

            if ("CC".equals(this.getTipoDeConta())){
                this.setTipoDeConta("Conta Corrente");
                this.setSaldo(50.0);
                this.setStatus(true);
            }
            else if ("CP".equals(this.getTipoDeConta())){
                this.setTipoDeConta("Conta Poupança");
                this.setSaldo(150.0);
                this.setStatus(true);
            }
        }
      
        else{
            System.out.println("Erro. Você já possui uma conta! ");
        }
        
    }
    
    public void exibirDados(){
        System.out.println("Número da Conta: " + this.numeroDaConta);
        System.out.println("Nome: " + this.dono);
        System.out.println("Tipo de Conta: " + this.tipoDeConta);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Status: " + this.status);
    }
    
    public void sacarDinheiro(double saque){
        
                
    }
}
