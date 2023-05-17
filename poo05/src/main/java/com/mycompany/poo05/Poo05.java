/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo05;

/**
 *
 * @author João Igor
 */
public class Poo05 {

    public static void main(String[] args) {
       
        //criando o objeto 'lutadores' que é um vetor 
        Lutador lutadores[] = new Lutador[6];
        //para cada posição do vetor, eu crio um ' objeto' (lutador) diferente 
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        
        
    }
}
