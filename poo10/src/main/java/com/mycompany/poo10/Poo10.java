/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo10;

/**
 *
 * @author João Igor
 */
public class Poo10 {

    public static void main(String[] args) {
        //criando o objeto cachorro
        Cachorro cachorro = new Cachorro();
        
        //testando o mesmo método com parâmetros diferentes
        cachorro.reagir("Olá");                 //abanar e latir
        System.out.println("=-=-=-=-=-=");      
        cachorro.reagir("Vai apanhar!");        //rosnar
        System.out.println("=-=-=-=-=-=");      
        cachorro.reagir(11 , 45);               //abanar
        System.out.println("=-=-=-=-=-=");      
        cachorro.reagir(21, 00);                //ignorar
        System.out.println("=-=-=-=-=-=");      
        cachorro.reagir(true);                  //abanar
        System.out.println("=-=-=-=-=-=");
        cachorro.reagir(false);                 //rosnar e latir 
        System.out.println("=-=-=-=-=-=");
        cachorro.reagir(3, 3.2);                //latir
        System.out.println("=-=-=-=-=-=");
        cachorro.reagir(14, 4.7);               //rosnar
        System.out.println("=-=-=-=-=-=");
    }
}
