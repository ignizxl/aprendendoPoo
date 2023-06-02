/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11;

/**
 *
 * @author João Igor
 */
public class Vizualizacao {
    //agrecação 
    private Gafanhoto espectador;
    private Video filme;
    //construtor
    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1 );
    }
    //get e set 
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    //sobrescrita do método toString 
    @Override
    public String toString() {
        return "Vizualizacao{" + "\n Espectador = " + espectador + "\n Filme = " + filme + '}';
    }
    //polimorfismo de sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double porcentagem){
        int total = 0;
        if(porcentagem <= 20){
            total = 3;
        } else if (porcentagem <= 50){
            total = 5;
        } else if (porcentagem <= 90){
            total = 8;
        } else {
            total = 10;
        }
    }
}
