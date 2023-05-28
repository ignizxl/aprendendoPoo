/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo07;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo07 {
    public static void main(String[] args) {
        //criando o objeto ler para capturar as entradas de dados pelo teclado
        Scanner ler = new Scanner(System.in);
        //criando vários objetos de tipos diferentes 
        Pessoa pessoa00 = new Pessoa();
        Aluno aluno00 = new Aluno();
        Funcionario funcionario00 = new Funcionario();
        Professor professor00 = new Professor();   
        
        System.out.println("Preencha os dados fictícios de uma Pessoa: ");
        System.out.print("Nome: ");
        String nome = ler.next();
        System.out.print("Idade: ");
        int idade = ler.nextInt();
        System.out.print("Sexo: ");
        String sexo = ler.next();
        pessoa00.setNome(nome);
        pessoa00.setIdade(idade);
        pessoa00.setSexo(sexo);
        
        System.out.println("Preecha os dados fictícios de um Aluno: ");
        System.out.print("Nome: ");
        nome = ler.next();
        System.out.print("Idade: ");
        idade = ler.nextInt();
        System.out.print("Sexo: ");
        sexo = ler.next();
        System.out.print("Matricula: ");
        int matricula = ler.nextInt();
        System.out.print("Curso: ");
        String curso = ler.next();
        aluno00.setNome(nome);
        aluno00.setIdade(idade);
        aluno00.setSexo(sexo);
        aluno00.setMatricula(matricula);
        aluno00.setCurso(curso);
        
        System.out.println("Preecha os dados fictícios de um Funcionário: ");
        System.out.print("Nome: ");
        nome = ler.next();
        System.out.print("Idade: ");
        idade = ler.nextInt();
        System.out.print("Sexo: ");
        sexo = ler.next();
        System.out.print("Setor: ");
        String setor = ler.next();
        System.out.print("Está trabalhando: [true/false]");
        boolean trabalhando = ler.nextBoolean();
        funcionario00.setNome(nome);
        funcionario00.setIdade(idade);
        funcionario00.setSexo(sexo);
        funcionario00.setSetor(setor);
        funcionario00.setTrabalhando(trabalhando);
        
        System.out.println("Preecha os dados fictícios de um Professor: ");
        System.out.print("Nome: ");
        nome = ler.next();
        System.out.print("Idade: ");
        idade = ler.nextInt();
        System.out.print("Sexo: ");
        sexo = ler.next();
        System.out.print("Especialidade:  ");
        String especialidade = ler.next();
        System.out.print("Salário do Professor; R$ ");
        double salario = ler.nextDouble();
        professor00.setNome(nome);
        professor00.setIdade(idade);
        professor00.setSexo(sexo);
        professor00.setEspecialidade(especialidade);
        professor00.setSalario(salario);
       
        while (true){
            System.out.println("Menu de Opções: ");
            System.out.println(" 1 - Exibir todos os Dados(Pessoa , Professor, Aluno e Funcionario); ");
            System.out.println(" 2 - Fazer aniversário(Pessoa , Professor, Aluno e Funcionario); ");
            System.out.println(" 3 - Mudar trabalho do Funcionário; ");
            System.out.println(" 4 - Cancelar Matrícula do aluno; ");
            System.out.println(" 5 - Fazer o Professor receber um aumento; ");
            System.out.println(" 6 - Encerrar programa; ");
            System.out.printf("Sua opção: ");
            int opcao = ler.nextInt();
            
            if(opcao == 1){
                System.out.println("Exibindo todos os dados: ");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println(pessoa00.toString());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println(aluno00.toString() + "\n Matricula: " + 
                        aluno00.getMatricula() + "\n Curso: " + aluno00.getCurso());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println(funcionario00.toString() + "\n Setor: " + 
                        funcionario00.getSetor() + "\n Trabalhando: " + funcionario00.isTrabalhando());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println(professor00.toString() + "\n Especialidade: " + professor00.getEspecialidade() +
                        "\n Salário: " + professor00.getSalario());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            else if(opcao == 2){
                pessoa00.fazerAniversario();
                aluno00.fazerAniversario();
                funcionario00.fazerAniversario();
                professor00.fazerAniversario();
                System.out.println("Todos fizeram aniversário! ");
                
            }
            else if (opcao == 3){
                System.out.print("Novo trabalho: ");
                setor = ler.next();
                funcionario00.setSetor(setor);
            }
            else if (opcao == 4){
                aluno00.cancelarMatricula();
            }
            else if(opcao == 5){
                System.out.print("Digite o valor do aumento do professor: R$ ");
                salario = ler.nextDouble();
                professor00.receberAumento(salario);
            }
            else if(opcao == 6){
                System.out.println("Encerrando programa!");
                break;
            }
            else{
                System.out.println("Opção inválida! ");
            }
        }
    }
}
