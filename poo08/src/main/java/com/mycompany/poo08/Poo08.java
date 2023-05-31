/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo08;

/**
 *
 * @author João Igor
 */
public class Poo08 {

    public static void main(String[] args) {
        
        Visitante visitante01 = new Visitante();
        Aluno aluno01 = new Aluno();
        Bolsista bolsista01 = new Bolsista();
        
       //utilizando o método set para modifica os valores do atributos 
        visitante01.setNome("João");
        visitante01.setIdade(18);
        visitante01.setSexo("Masculino");
        visitante01.fazerAniversario(); //chamando o método fazer aniversário
        System.out.println(visitante01);
        
        System.out.println("-==-=-=-=-==-=-");
        aluno01.setNome("John");
        aluno01.setIdade(19);
        aluno01.setSexo("Masculino");
        aluno01.setMatricula(1234);
        aluno01.setCurso("Ciências da computação");
        aluno01.pagarMensalidade(); //chamando o método pagar mensalidade
        System.out.println(aluno01);
        
        System.out.println("-==-=-=-=-==-=-");
        bolsista01.setNome("Jake");
        bolsista01.setIdade(22);
        bolsista01.setSexo("Masculino");
        bolsista01.setMatricula(4321);
        bolsista01.setCurso("Sistemas para internet");
        bolsista01.renovarBolsa(); //chamando o método renovar bolsa 
        bolsista01.pagarMensalidade(); //chamando o método pagar mensalidade que foi sobrescrito dentro da classe bolsista
        System.out.println(bolsista01);
    }
}
