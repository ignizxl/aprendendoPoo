/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo01;


/**
 *
 * @author João Igor
 */
public class Poo01 {

    public static void main(String[] args) {
        
        //criando o objeto caneta01
        Caneta caneta01 = new Caneta();
        
        caneta01.modelo = "BIC cristal";
        caneta01.cor = "Azul";
        //caneta01.ponta = 0.5f; por enquanto eu não posso acessar no atributo ponta porque o acesso é privado 
        caneta01.carga = 29;
        //caneta01.tampada = true; este também é um atributo privado
        
        caneta01.imprime();
        caneta01.rabiscar(true);
    }
}
