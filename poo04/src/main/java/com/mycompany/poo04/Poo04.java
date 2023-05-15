/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo04;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo04 {

    public static void main(String[] args) {
        
        //criando o objeto 'ControleUniversal' e criando o objeto 'ler'
        
        ControleRemoto controleUniversal = new ControleRemoto();
        Scanner ler = new Scanner(System.in);
        String resposta;
        
        while (true){
                System.out.println("Guia de atalhos do Controle Universal: ");
                System.out.println("0 - Ligar Controle; ");
                System.out.println("1 - Desligar Controle; ");
                System.out.println("2 - Abrir Menu; ");
                System.out.println("3 - Fechar Menu; ");
                System.out.println("4 - Aumentar Volume; ");
                System.out.println("5 - Diminuir Volume; ");
                System.out.println("6 - Play; ");
                System.out.println("7 - Pausar; ");
                System.out.println("8 - Ligar Modo Mudo; ");
                System.out.println("9 - Desligar Modo Mudo; ");
                System.out.println("10 - Encerrar Programa; ");
                System.out.printf("Sua opção: ");
                int opcao = ler.nextInt();
                
                if(opcao == 0){
                    controleUniversal.ligar();
                    System.out.println("--------------------");
                }
                
                else if(opcao == 1){
                    System.out.println("Tem certeza que deseja desligar o controle? S/N ");
                    resposta = ler.next();
                    if("S".equals(resposta)){
                        controleUniversal.desligar();
                    
                    }
                    else{
                        System.out.println("Cancelando opção!");
                    }
                    System.out.println("--------------------");
                        
                }
                
                else if(opcao == 2){
                    System.out.println("Menu: ");
                    controleUniversal.abrirMenu();                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 3){
                    
                    controleUniversal.fecharMenu();
                    System.out.println("--------------------");
                }
                
                else if (opcao == 4){
                    controleUniversal.aumentarVolume();                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 5){
                    controleUniversal.diminuirVolume();
                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 6){
                    controleUniversal.play();
                    System.out.println("--------------------");
                }
                
                else if (opcao == 7){
                    System.out.println("Deseja pausar? S/N ");
                    
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        controleUniversal.pausar();
                    }
                    else{
                        System.out.println("Cancelando opção!");
                    }
                    System.out.println("--------------------");
                       
                }
                
                else if (opcao == 8){
                    System.out.println("Deseja ligar Modo Mudo? S/N ");
                    
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        controleUniversal.ligarMudo();
                    }
                    else{
                        System.out.println("Cancelando opção!");
                    }
                    System.out.println("--------------------");
                
                }
                else if (opcao == 9){
                    System.out.println("Deseja desligar Modo Mudo? S/N ");
                    
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        controleUniversal.desligarMudo();
                    }
                    else{
                        System.out.println("Cancelando opção!");
                    }
                    System.out.println("--------------------");
                
                }
                
                else if (opcao == 10){
                    System.out.println("Deseja encerrar o programa? S/N ");
                    
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        System.out.println("Encerrando...");
                        break;
                    }
                    else{
                        System.out.println("Cancelando opção!");
                    }
                    System.out.println("--------------------");
                
                }
                
                else{
                    System.out.println("Opção inválida! Digite novamente.");
                }
        
        }
        
    }
}
