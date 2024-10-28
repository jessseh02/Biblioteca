package br.com.catolica.biblioteca.Biblioteca;

import br.com.catolica.biblioteca.Livro.Livro;

public class Biblioteca {
    private Livro listaDeLivros[];
    private String nome;
    private String endereco;
    private int todosOsLivros;


    public Biblioteca(String nome, String endereco, int livrosDisponiveis) {
        this.nome = nome;
        this.endereco = endereco;

        if (livrosDisponiveis < 0) {
            this.listaDeLivros = new Livro[1];
        } else {
            this.listaDeLivros = new Livro[livrosDisponiveis];
        }
    }


    public void cadastrarLivro(Livro livro) {
        if (todosOsLivros < 100) {
            listaDeLivros[todosOsLivros] = livro;
            todosOsLivros++;
        } else {
            System.out.println("Limite de Livros Atingidos");
        }
    }

    public Livro localizarLivro(String titulo) {
        for (int i = 0; i < todosOsLivros; i++) {
            if (listaDeLivros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return listaDeLivros[i];
            }
        }
        return null;
    }

    public Livro localizarLivroPorAutor(String autor){
        for(int i = 0; i < todosOsLivros; i++){
            if(listaDeLivros[i].getAutor().equalsIgnoreCase(autor)){
                return listaDeLivros[i];
            }
        }
        return null;
    }

    public boolean verificarDisponibilidade(Livro livro){
        return livro.getQuantidadeDeEstoque() > 0;
    }

    public void emprestar(Livro livro){
        if(verificarDisponibilidade(livro)){
            livro.setQuantidadeDeEstoque(livro.getQuantidadeDeEstoque() - 1);
        }else{
            System.out.println("O Livro já está em uso");
        }
    }

    public void devolver(Livro livro){
        livro.setQuantidadeDeEstoque(livro.getQuantidadeDeEstoque() + 1);
    }

    public void exibirInfo(){
        System.out.printf("Biblioteca: %s", nome);
        System.out.printf("Endereço: %s", endereco);
        System.out.println("Livros Disponíveis: ");
        for (int i = 0; i < todosOsLivros; i++){
            System.out.println("-" + listaDeLivros[i].getTitulo());
        }
    }
}
