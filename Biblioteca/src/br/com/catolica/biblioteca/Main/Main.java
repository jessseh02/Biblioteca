package br.com.catolica.biblioteca.Main;

import br.com.catolica.biblioteca.Biblioteca.Biblioteca;
import br.com.catolica.biblioteca.Livro.Livro;
import br.com.catolica.biblioteca.usuario.Usuario;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Grande Saber","edmunestrela",100);
        Livro livro1 = new Livro("O homem masi rico da babilonia","nao me lembro","123452",2002,5);


        biblioteca.cadastrarLivro(livro1);

        Usuario usuario = new Usuario("jesseh", "24542","jessehjose@gemail.com",5);

        biblioteca.emprestar(livro1);
        usuario.emprestarLivro(livro1);

        usuario.exibirInfi();
        biblioteca.exibirInfo();
    }
}
