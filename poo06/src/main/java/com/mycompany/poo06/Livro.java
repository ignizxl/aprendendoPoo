/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo06;

/**
 *
 * @author João Igor
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalDePaginas; 
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //método construtor 
    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
  
    }
    
    //métodos de acesso e métodos modificadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(this.getAberto() == false){
            System.out.println("Abrindo o livro!");
            this.setAberto(true);
        }
        else{
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        
        if(this.getAberto() == true){
            System.out.println("Fechando o livro!");
            this.setAberto(false);
        }
        else{
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear(int pagina) {
        
        if(this.getAberto() == true){
        
            if(pagina > this.getTotalDePaginas()) {
                System.out.println("Erro. Página " + pagina + " não encontrada!");
            }
            else{
                this.setPaginaAtual(pagina);
                System.out.println("Página atual: " + this.getPaginaAtual());

            }
        }
        else{
            System.out.println("Erro. O livro está fechado! ");
        }
    }
    @Override
    public void avancarPagina() {
        if (this.getPaginaAtual() >= 0 && this.getPaginaAtual() < this.getTotalDePaginas() && this.getAberto() == true){
            this.setPaginaAtual(this.getPaginaAtual() + 1);
            System.out.println("Próxima página");
        
        }
        else{
            System.out.println("Erro. Página não encontrada! ");
        }
    
    }

    @Override
    public void voltarPagina() {
        if(this.getPaginaAtual() > 0 && this.getPaginaAtual() <= this.getTotalDePaginas() && this.getAberto() == true){
            this.setPaginaAtual(this.getPaginaAtual() - 1); 
            System.out.println("Página anterior.");
        
        }
        else{
            System.out.println("Erro. Página não encontrada! ");
        }
        
    }

    public String detalhes() {
        return '{' + " Sobre o Livro: \n" + " Titulo: " + this.titulo + "\n Autor: " + this.autor + "\n Total de Páginas: " + this.totalDePaginas + "\n Página Atual: " + this.paginaAtual + "\n Aberto: " + this.aberto + "\n Leitor: " + leitor.getNome()  + "\n" + " Idade: " + leitor.getIdade() + "\n" + " Sexo: " + leitor.getSexo()  + '}';
    }
    
    
    
}
    
    
