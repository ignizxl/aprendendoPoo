/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo06;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo06 {

    public static void main(String[] args) {
        
        //criando o objeto pessoas 
        Pessoa[] pessoas = new Pessoa[2];
        //criado o objeto livros
        Livro[] livros = new Livro[2];
        //criando o objeto ler, para capturar os dados pelo teclado
        Scanner ler = new Scanner(System.in);
        
        //pessoas[0] = new Pessoa("João", 18, "Masculino");
        //pessoas[1] = new Pessoa("Igor", 19, "Masculino");
        //livros[0] = new Livro("Open sources", "Linus Torvalds", 300, pessoas[0]);
        //livros[1] = new Livro("Introdução ao Python", "Guido van Rossum", 400, pessoas[1]);
        
        
        System.out.println("Livros disponíveis: ");
        System.out.println(" 0 - Open sources \n 1 - Introdução ao Python");
        System.out.print("Sua opção de leitura: ");
        int opcao = ler.nextInt();    
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Digite seu Sexo: [M/F]: ");
        String sexo = ler.next();
        
        //passando parâmetros nome, idade, e sexo 
        pessoas[0] = new Pessoa(nome, idade, sexo);
        
        if(opcao == 0){
            livros[0] = new Livro("Open sources", "Linus Torvalds", 300, pessoas[0]);
        }
        else{
            livros[0] = new Livro("Introdução ao Python", "Guido van Rossum", 400, pessoas[0]);
        }
        

        while(true){
            System.out.println("Guia de atalhos");
            System.out.println(" 0 - Abrir livro; \n 1 - Fechar livro; \n 2 - Folhear; \n 3 - Avançar página; \n "
                    + "4 - Voltar página; \n 5 - Mostrar detalhes; \n 6 - Encerrar programa; ");
            System.out.print("Sua opção: ");
            opcao = ler.nextInt();
            
            if(opcao == 0){
                livros[0].abrir();
            }
            else if (opcao == 1){
                livros[0].fechar();
            }
            
            else if (opcao == 2){
                int folhear = ler.nextInt();
                livros[0].folhear(folhear);
                               
            }
            else if (opcao == 3){
                livros[0].avancarPagina();
            }
            
            else if (opcao == 4){
                livros[0].voltarPagina();
            }
            
            
            else if (opcao == 5){
                System.out.println(livros[0].detalhes());
            }
            
            else if (opcao == 6){
                System.out.println("Encerrando Programa!");
                break;
            }
            
            else{
                System.out.println("Opção inválida! ");
            }
            
        }
    }
}
