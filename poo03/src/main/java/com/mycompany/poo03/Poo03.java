/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo03;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo03 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        ContaBanco pessoa01 = new ContaBanco();
        
        System.out.println("---------- Banco Central ----------");
        System.out.println("Deseja criar uma conta bancária? S/N");
        String resposta = ler.next();
        
        if("S".equals(resposta)){
            while (true){
                System.out.println("Guia de atalhos: ");
                System.out.println("0 - Abrir conta; ");
                System.out.println("1 - Fechar conta; ");
                System.out.println("2 - Exibir dados da conta; ");
                System.out.println("3 - Realizar deposito; ");
                System.out.println("4 - Realizar saque; ");
                System.out.println("5 - Sacar tudo; ");
                System.out.println("6 - Pagar mensalidade; ");
                System.out.println("7 - Encerrar programa; ");
                System.out.printf("Sua opção: ");
                int opcao = ler.nextInt();
                
                if(opcao == 0){
                    System.out.println("Digite seu nome: ");
                    resposta = ler.next();
                    pessoa01.setDono(resposta);
                    System.out.println("Digite o número de sua Conta: ");
                    int numero = ler.nextInt();
                    pessoa01.setNumeroDaConta(numero);
                    
                    System.out.println("Escolha seu tipo de Conta:");
                    System.out.println("Digite CC - Para abrir uma conta corrente (bônus de R$50.00). ");
                    System.out.println("Digite CP - Para abrir uma conta poupança (bôbus de R$150.00). ");
                    resposta = ler.next();
                    pessoa01.setTipoDeConta(resposta);
                    pessoa01.abrirConta(pessoa01.getTipoDeConta());
                    
                    System.out.println("Olá " + pessoa01.getDono());
                    System.out.println("Seus dados: ");
                    pessoa01.exibirDados();
                    
                    System.out.println("--------------------");
                }
                
                else if(opcao == 1){
                    System.out.println("Tem certeza que deseja fechar a conta? S/N ");
                    resposta = ler.next();
                    if("S".equals(resposta)){
                        pessoa01.fecharConta();
                    
                    }
                    System.out.println("--------------------");
                        
                }
                
                else if(opcao == 2){
                    System.out.println("Seus dados: ");
                    pessoa01.exibirDados();
                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 3){
                    System.out.println("Digite a quantidade que você deseja depositar: ");
                    System.out.printf("R$ ");
                    double deposito = ler.nextDouble();
                    pessoa01.depositarDinheiro(deposito);
                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 4){
                    System.out.println("Digite a quantidade que você deseja sacar: ");
                    System.out.printf("R$ ");
                    double saque = ler.nextDouble();
                    pessoa01.sacarDinheiro(saque);
                    
                    System.out.println("--------------------");
                }
                
                else if (opcao == 5){
                    System.out.println("Você realmente deseja sacar tudo? S/N");
                    resposta = ler.next();
                    
                    if ("S".equals(resposta)){
                        pessoa01.sacarTudo();
                    }
                    else{
                        System.out.println("Saque cancelado! ");
                    }
                    System.out.println("--------------------");
                }
                
                else if (opcao == 6){
                    System.out.println("Deseja realizar o pagamento da mensalidade? S/N ");
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        pessoa01.pagarMensalidade();
                    }
                    
                    else{
                        System.out.println("Pagamento cancelado! ");
                    }
                    System.out.println("--------------------");
                }
                
                else if (opcao == 7){
                    System.out.println("Deseja sair do banco? S/N ");
                    
                    resposta = ler.next();
                    if ("S".equals(resposta)){
                        break;
                    }
                    else{
                        System.out.println("Cancelando!");
                    }
                    System.out.println("--------------------");
                }
            
            
            }
        
        }
        else{
            System.out.println("Volte sempre!");
        }
        
    }
}

