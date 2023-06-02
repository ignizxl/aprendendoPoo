/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11;

/**
 *
 * @author João Igor
 */
public class Video implements AcoesVideo {
    //atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    //get e set 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = novaAvaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    //fazendo a sobrescrita dos métodos abstratos da interface
    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    @Override
    public String toString() {
        return "Informções do Video{ " + "\n Titulo = " + titulo + "\n Avaliação = " +
                avaliacao + "\n Views = " + views + "\n Curtidas = " + curtidas +
                "\n Reproduzindo = " + reproduzindo + '}';
    }
}
