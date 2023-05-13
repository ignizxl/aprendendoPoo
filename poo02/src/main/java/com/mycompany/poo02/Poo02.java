/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo02;


/**
 *
 * @author João Igor
 */
public class Poo02 {

    public static void main(String[] args) {
    
        /*
        Caneta caneta01 = new Caneta();
        
        caneta01.setModelo("Bic faber castel");
        System.out.println(caneta01.getModelo());
        caneta01.setPonta(0.5f);
        System.out.println(caneta01.getPonta());
        
        Caneta caneta02 = new Caneta();
        
        caneta02.setModelo("Castle");
        caneta02.setPonta(0.4f);
        caneta02.imprime();
        */
       
        
        
        Caneta caneta01 = new Caneta("Bic castle", "Preta", 0.4f);
        
        caneta01.imprime();
        
        
    }
}
