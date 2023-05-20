/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo05;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo05 {

    public static void main(String[] args) {
        //criando o objeto ler
        Scanner ler = new Scanner(System.in);
        //criando o objeto 'lutadores' que é um vetor 
        Lutador lutadores[] = new Lutador[6];
        //para cada posição do vetor, eu crio um ' objeto' (lutador) e atribuio informações diferentes
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        Luta UFC = new Luta();
        
        System.out.println("Deseja participar do UFC? S/N: ");
        String resposta = ler.next();
        
        if("S".equals(resposta)){
            System.out.println("--- Bem vindo ao Ultimate Fighting Championship ---");
            System.out.println("Lutadores disponiveis: ");
            lutadores[0].apresentar();
            lutadores[1].apresentar();
            lutadores[2].apresentar();
            lutadores[3].apresentar();        
            lutadores[4].apresentar();
            lutadores[5].apresentar();
            
            
     
            while (true){
                System.out.println("==========================================");
                System.out.println("Escolha o desafiado e o desafiante e Marque sua luta! ");
                System.out.println("-- Guia de atalhos -- ");
                System.out.println("0 - Pretty Boy; ");
                System.out.println("1 - Putscript; ");
                System.out.println("2 - Snapshadow; ");
                System.out.println("3 - Dead Code; ");
                System.out.println("4 - UFOCobol; ");
                System.out.println("5 - Neerdaart; ");
                System.out.println("6 - Encerrar o Ultimate Fighting Championship; ");
                
                System.out.println("==========================================");
                System.out.println("Desafiado: ");
                int opcao = ler.nextInt();
                
                if(opcao == 0){
                    UFC.setDesafiado(lutadores[0]);
                    
                }
                
                else if(opcao == 1){
                    UFC.setDesafiado(lutadores[1]);
                    
                }
                
                else if(opcao == 2){
                    UFC.setDesafiado(lutadores[2]);
                    
                }
                
                else if(opcao == 3){
                    UFC.setDesafiado(lutadores[3]);
                    
                }
                
                else if(opcao == 4){
                    UFC.setDesafiado(lutadores[4]);
                    
                }
                
                else if(opcao == 5){
                    UFC.setDesafiado(lutadores[5]);
                    
                }
                
                else if(opcao == 6){
                    System.out.println("Encerrando o Ultimate! ");
                    break;
                }
                
                else{
                    while (true){
                        if(opcao == 0 || opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5){
                            UFC.setDesafiado(lutadores[opcao]);
                            break;
                        }
                        else{
                            System.out.println("Opção inválida! Digite novamente.");
                            System.out.println("Desafiado: ");
                            opcao = ler.nextInt();
                        }
                    }
                }
                
                System.out.println("Desafiante: ");
                
                opcao = ler.nextInt();
                
                if(opcao == 0){
                    UFC.setDesafiante(lutadores[0]);
                    
                }
                
                else if(opcao == 1){
                    UFC.setDesafiante(lutadores[1]);
                    
                }
                
                else if(opcao == 2){
                    UFC.setDesafiante(lutadores[2]);
                    
                }
                
                else if(opcao == 3){
                    UFC.setDesafiante(lutadores[3]);
                    
                }
                
                else if(opcao == 4){
                    UFC.setDesafiante(lutadores[4]);
                    
                }
                
                else if(opcao == 5){
                    UFC.setDesafiante(lutadores[5]);
                    
                }
                
                else if(opcao == 6){
                    System.out.println("Encerrando o Ultimate! ");
                    break;
                }
                
                else{
                    while (true){
                        if(opcao == 0 || opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5){
                            UFC.setDesafiante(lutadores[opcao]);
                            break;
                        }
                        else{
                            System.out.println("Opção inválida! Digite novamente.");
                            System.out.println("Desafiante: ");
                            opcao = ler.nextInt();
                        }
                    }
                }
                
                
                UFC.marcarLuta(UFC.getDesafiado(), UFC.getDesafiante());
                
                if(UFC.isAprovada() == true){
                    System.out.println("Deseja iniciar a luta agora? S/N: ");
                    resposta = ler.next();
                    
                    if("S".equals(resposta)){
                        UFC.lutar();
                    }
                    else{
                        System.out.println("Cancelando Luta!");
                    }
                }
                else{
                  
                    System.out.println("Erro. Escolha novamente os seus Lutadores!");
                    
                }
               
            }
            
        
        }
        else{
            System.out.println("Até o próximo Ultimate Fighting Championship! ");
        }
    }
}