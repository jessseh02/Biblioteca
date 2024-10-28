package br.com.catolica.biblioteca.Livro;

import br.com.catolica.biblioteca.usuario.Usuario;

public class Livro {
    String titulo;
    String autor;
    String isbn;
    int anoDePublicacao;
    int quantidadeDeEstoque;


    public Livro(String titulo, String autor, String isbn, int anoDePublicacao, int quantidadeDeEstoque){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }
    public  String getTitulo(){
        return titulo;
    }
    public  String getAutor(){
        return autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }
    public int getQuantidadeDeEstoque(){
        return quantidadeDeEstoque;
    }
    public void setQuantidadeDeEstoque(int quantidadeDeEstoque){
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

   public void exibirIfo(){
       System.out.println(titulo);
       System.out.println(autor);
       System.out.println(isbn);
       System.out.println(anoDePublicacao);
       System.out.println(quantidadeDeEstoque);

    }
}
