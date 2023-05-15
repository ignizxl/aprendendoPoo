/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.poo04;

/**
 *
 * @author João Igor
 */
public abstract interface Controlador {
    //Os métodos abstratos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play(); 
    public abstract void pausar();
    
    
}
