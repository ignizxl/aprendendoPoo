/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo09;

/**
 *
 * @author João Igor
 */
public class Poo09 {

    public static void main(String[] args) {
        //aprendendo conceitos de polimorfismo e praticando herança
        // - nesse exercício prático estamos utilizando o polimorfismo de sobreposição 
        
        //criando os objetos e já deixando os valores predefinidos
        
        Ave ave = new Ave(20.8, 6, 4, "Branca");
        Arara arara = new Arara(10, 12, 6, "Vermelha");
        Mamifero mamifero = new Mamifero(30.2, 8, 4, "Marrom");
        Canguru canguru = new Canguru(51.0, 15, 4, "Branco");
        Cachorro cachorro = new Cachorro(7.0, 3, 4, "Preto");
        Peixe peixe = new Peixe(120.0, 50, 7, "Azul marinho");
        Goldfish goldfish = new Goldfish(200, 26, 7, "Azul escuro");
        Reptil reptil = new Reptil(60, 22, 4, "Verde musgo");
        Cobra cobra = new Cobra(70, 40, 0, "Marrom escuro");
        Tartaruga tartaruga = new Tartaruga(124, 12, 4, "Verde escuro");
        
        
        //chamando os métodos nos seus objetos correspondentes
        System.out.println(ave.toString());
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();
        
        System.out.println("-=-=-=-==-=-=-=-");
        System.out.println(arara.toString());
        ave.locomover();
        arara.alimentar();
        arara.emitirSom();
        arara.fazerNinho();       
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(mamifero.toString());
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(canguru.toString());
        canguru.locomover();
        canguru.alimentar();
        canguru.emitirSom();
        canguru.usarBolsa();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(cachorro.toString());
        cachorro.locomover();
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(peixe.toString());
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolhas();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(goldfish.toString());
        goldfish.locomover();
        goldfish.alimentar();
        goldfish.emitirSom();
        goldfish.soltarBolhas();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(reptil.toString());
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(cobra.toString());
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();
        
        System.out.println("=-=-===-==-=-=-=");
        System.out.println(tartaruga.toString());
        tartaruga.locomover();
        tartaruga.alimentar();
        tartaruga.emitirSom();
    }
}
