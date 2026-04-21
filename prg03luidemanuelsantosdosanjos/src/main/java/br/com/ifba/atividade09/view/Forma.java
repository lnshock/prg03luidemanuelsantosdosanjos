
package br.com.ifba.atividade09.view;


public abstract class Forma {

    private String nome;

    public Forma(String nNome) {
        this.nome = nNome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Forma{" + "nome=" + nome + '}';
    }
}
