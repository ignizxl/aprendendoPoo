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
        
        System.out.println("Deseja abrir uma conta no banco? S/N");
        String resposta = ler.next();
        if ("S".equals(resposta)){
            System.out.println("Digite seu nome: ");
            resposta = ler.next();
            pessoa01.setDono(resposta);
            
            System.out.println("Digite o número de sua Conta: ");
            int numero = ler.nextInt();
            pessoa01.setNumeroDaConta(numero);
            
            System.out.println(pessoa01.getTipoDeConta());
            
            System.out.println("Escolha seu tipo de Conta:");
            System.out.println("Digite CC - Para abrir uma conta corrente.");
            System.out.println("Digite CP - Para abrir uma conta poupança.");
            resposta = ler.next();
            pessoa01.setTipoDeConta(resposta);
            pessoa01.abrirConta(pessoa01.getTipoDeConta());
            
            System.out.println("Seus dados: ");
            pessoa01.exibirDados();
            
            pessoa01.abrirConta(pessoa01.getTipoDeConta());
            
        }
        else{
            System.out.println("Volte sempre!");
        }
    }
}
