package br.com.catolica.biblioteca.usuario;

import br.com.catolica.biblioteca.Livro.Livro;

public class Usuario {
    private String nome;
    private String id;
    private String email;
    private Livro[] livrosEmPosse;
    private int livrosEmprestados;



    public Usuario(String nome, String id, String email, int livrosEmPosse){
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.livrosEmPosse = new Livro[5];
        this.livrosEmprestados = 0;
    }

    public String getNome(){
        return nome;
    }
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }

    public void emprestarLivro(Livro livro){
        if(livrosEmprestados < 5){
            livrosEmPosse[livrosEmprestados] = livro;
            livrosEmprestados++;
        }else {
            System.out.println("Você só pode ter 5 livros emprestados!");
        }
    }

    public void devolverLivro(Livro livro){
        for (int i = 0; i < livrosEmprestados; i++){
            if(livrosEmPosse[i].equals(livro)){
                livrosEmPosse[i] = null;
                livrosEmprestados--;
                break;
            }
        }
    }

    public void exibirInfi(){
        System.out.println(nome);
        System.out.println(id);
        System.out.println(email);
        System.out.println(livrosEmPosse);
    }
}
