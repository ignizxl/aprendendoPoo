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
            
            System.out.println("Conta criada com sucesso! ");
                    
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
        
        if(this.isStatus() == true && this.getSaldo() >= 0.0){
            
            if(saque > this.getSaldo()){             
                System.out.println("Saldo insuficiente!");
                
            } else {
                
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque de R$ " + saque + " realizado com sucesso!");
            }
        }
        
        else{
            System.out.println("Erro. Você não possui uma conta!");
        }
                
    }
    
    public void depositarDinheiro(double deposito){
        
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito de R$ " + deposito + " realizado com sucesso!");
            
        }
        
        else{
            System.out.println("Erro. Saldo insuficiente!");
            System.out.println("Saldo atual: R$ " + this.getSaldo());
        }
    
   
    }
    
    
    public void fecharConta(){
        
        if(this.isStatus() == true){
        
            if(this.getSaldo() > 0.0){
                System.out.println("Sua conta ainda possui um saldo! ");
            }
            else if(this.getSaldo() < 0.0){
                System.out.println("Erro. Sua conta está débito! ");
            }
            else{
                System.out.println("Fechando conta...");
                this.setStatus(false);
                System.out.println("Finalizado com sucesso! ");
            }
        }
        
        else{
            System.out.println("Erro. Você não possui uma conta! ");
        }
    }
    
    public void pagarMensalidade(){
        
        double mensalidade = 0;
        
        if ("CC".equals(this.tipoDeConta)){
            mensalidade = 12;
        } 
        else if ("CP".equals(this.tipoDeConta)){
            mensalidade = 20;
        }
        
        if(this.isStatus() == true){
            if(this.getSaldo() > mensalidade){
                this.setSaldo(this.getSaldo() + mensalidade);
                System.out.println("Mensalidade paga com sucesso!");
                System.out.println("Seu saldo atual é de R$" + this.getSaldo() + ": Valor da mensalidade paga: R$ " + mensalidade);
            }
            
            else{
                System.out.println("Saldo insuficiente! ");
            }
        }
        else{
            System.out.println("Erro. Você não possui uma conta! ");
        }
     
    }
    
    public void sacarTudo(){
        if (this.isStatus() == true){
            if(this.getSaldo() > 0.0){
                this.setSaldo(this.getSaldo() - this.getSaldo());
                System.out.println("Saque realizado com sucesso! ");
            }
            else{
                System.out.println("Erro. Conta em débito! ");
            }
        }else{
            System.out.println("Erro. Você não possui uma conta! ");
        }
    }
}

