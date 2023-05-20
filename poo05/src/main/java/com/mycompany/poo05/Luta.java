/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo05;


import java.util.Random;

/**
 *
 * @author João Igor
 */
public class Luta {
    //atributos 
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
   //métodos 
   public void marcarLuta(Lutador desafiado, Lutador desafiante){
       if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){
           this.setAprovada(true);
           this.setDesafiado(desafiado);
           this.setDesafiante(desafiante);
           System.out.println("Luta Marcada!");
       }
       else{
           this.setAprovada(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
           System.out.println("Não foi possível marcar está luta! ");
       }
   }
   
   public void lutar(){
       if(this.isAprovada() == true){
           System.out.println("Apresentando o desafiado: ");
           this.desafiado.apresentar();
           System.out.println("Apresentando o desafiante: ");
           this.desafiante.apresentar();
           
           Random numeroAleatorio = new Random();
           int resultado = numeroAleatorio.nextInt(3);  
           
           // 0 = empate
           // 1 = desafiado vence
           // 2 = desafiante vence
           
           System.out.println("==========================");
           System.out.println("======= Resultado ========");
           
           if (resultado == 0){
               System.out.println("Empate!");
               this.desafiado.empatarLuta();
               this.desafiante.empatarLuta();
               
               
           }
           
           else if (resultado == 1){
               System.out.println("O desafiado " + desafiado.getNome() + " venceu!");
               this.desafiado.ganharLuta();
               this.desafiante.perderLuta();
           }
           
           else if (resultado == 2){
               System.out.println("O desafiante " + desafiante.getNome() + " venceu!");
               this.desafiado.perderLuta();
               this.desafiante.ganharLuta();
           }
           
           System.out.println("==========================");
           System.out.println("Atualizando Cartel: ");
           this.desafiado.status();
           System.out.println("--==--==--==--==--==--==--");
           this.desafiante.status();
           System.out.println("==========================");
       }
       
       else{
           System.out.println("A luta não pode acontecer! ");
       }
       
   }
   //métodos de acesso e métodos modificadores 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
