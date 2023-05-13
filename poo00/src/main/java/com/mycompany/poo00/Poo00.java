/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo00;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Poo00 {

    public static void main(String[] args) {
        
        //criando o objeto caneta01
        Caneta caneta01 = new Caneta();
        //criando o objeto ler
        Scanner ler = new Scanner(System.in);
        //atribuindo valores aos atributos do objeto 'caneta01'
        caneta01.modelo = "BIC";
        caneta01.cor = "Preta";
        caneta01.ponta = 0.5f;
        caneta01.carga = 100;
        //criando uma variável chamada estadoAtual, pegando a entrada de dado, convertendo pra boolean e armazenando em estadoAtual
        boolean estadoAtual = ler.nextBoolean();
        //chamando o metódo rabiscar(que recebe como parâmetro o que foi armazenado em estadoAtual)
        caneta01.rabiscar(estadoAtual);
        //e por fim, chamando o metódo imprime pra mostra os valores de todos os atributos do objeto caneta01
        caneta01.imprime();
        //criando um novo objeto chamado 'caneta02'
        Caneta caneta02 = new Caneta();
        //atribuindo valores aos atributos desse objeto
        caneta02.modelo = "castel";
        caneta02.cor = "Azul";
        caneta02.ponta = 0.3f;
        caneta02.carga = 30;
        //chamando os metódos rabiscar e imprime.
        caneta02.rabiscar(estadoAtual);
        caneta02.imprime();
        
    }
}
