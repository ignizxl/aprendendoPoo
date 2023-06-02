/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo11;

/**
 *
 * @author João Igor
 */
public class Poo11 {

    public static void main(String[] args) {
        
        //criando um vetor de objetos para os videos e um vetor de objetos para os gafanhotos 
        Video videos[] = new Video[2];
        videos[0] = new Video("Aula 15 | Poo - Java ");
        videos[1] = new Video("Python Mundo 3 - Desafio 99 ");
        
        videos[0].play();
        videos[1].play();
        
        Gafanhoto gafanhotos[] = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("João Igor", 16, "Masculino", "João");
        gafanhotos[1] = new Gafanhoto("John", 19, "Masculino", "John");
        
        Vizualizacao vizualizacao00 = new Vizualizacao(gafanhotos[0], videos[0]); //joão assiste Aula 15 | Poo - Java
        vizualizacao00.avaliar();
        System.out.println(vizualizacao00.toString());
        
        Vizualizacao vizualizacao01 = new Vizualizacao(gafanhotos[1], videos[1]); // john assiste Python Mundo 3 - Desafio 99
        vizualizacao01.avaliar(88.8);
        System.out.println(vizualizacao01.toString());
    }
}
