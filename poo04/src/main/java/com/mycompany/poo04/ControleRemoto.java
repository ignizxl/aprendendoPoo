/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo04;

/**
 *
 * @author João Igor
 */
public class ControleRemoto implements Controlador {
    
    //atributos 
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        
    }
    
    //métodos acessores e métodos modificadores 
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //sobreescrevendo os métodos abstratos da interface 'Controlador'
    @Override
    public void ligar(){
        if (this.isLigado() == true){
            System.out.println("Erro. O controle já está ligado! ");
        }
        else{
            this.setLigado(true);
            System.out.println("Ligado com sucesso! ");
        }
    }  
    @Override
    public void desligar(){
        if(this.isLigado() == false){
            System.out.println("Erro. O controle já está desligado! ");
            
        }else{
            this.setLigado(false);
            System.out.println("Desliga com sucesso! ");
        }
    }
    
    @Override
    public void abrirMenu(){
        if(this.isLigado() == true){
            System.out.println("Status: " + this.isLigado() + " | O controle está ligado! " );
        }
        else{
            System.out.println("Status: " + this.isLigado() + " | O controle não está ligado! " );
        }
        
        if(this.isTocando() == true){
            System.out.println("Status: " + this.isTocando() + " | O controle está tocando! " );
            
        }
        else{
            System.out.println("Status: " + this.isTocando() + " | O controle não está tocando! " );
        }
        
        System.out.println("O volume: ");
        for (int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
        }
     
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu! ");
    }
    
    @Override
    public void aumentarVolume(){
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() + 10);
            System.out.println("Volume aumentado com sucesso!");
        }
        else{
            System.out.println("Erro. O controle está desligado!");
        }
    }
    
    @Override
    public void diminuirVolume(){
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() - 10);
            System.out.println("Volume diminuído com sucesso!");
        }
        else{
            System.out.println("Erro. O controle está desligado!");
        }
    }
    
    @Override
    public void ligarMudo(){
        if(this.isLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Ativando modo Mudo!");
        }
        System.out.println("Erro. Já está no modo Mudo!");
    }
    
    @Override
    public void desligarMudo(){
        if(this.isLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Desativando modo Mudo!");
        }
        else{
            System.out.println("Erro. O modo mudo já está desativado! ");
        }
        
    }
    
    @Override
    public void play(){
        if(this.isLigado() == true && this.isTocando() == false){
            this.setTocando(true);
            System.out.println("Tocando! ");
        }
        else if(this.isLigado() == true && this.isTocando() == true){
            System.out.println("Erro. Já está tocando! ");
        }
        else{
            System.out.println("Erro. O controle está desligado! ");
        }
    }
    
    @Override
    public void pausar(){
        if(this.isLigado() == true && this.isTocando() == true){
            this.setTocando(false);
            System.out.println("Pausando! ");
        }
        else{
            System.out.println("Erro. Já está pausado!");
        }
    }
    
}
    

