
package br.com.ifba.atividade09.view;


public abstract class Forma2D extends Forma {

    public Forma2D(String nNome) {
        super(nNome);
    }

    // Metodo abstrato - cada subclasse calcula sua propria area
    public abstract double obterArea();

    @Override
    public String toString() {
        return "Forma2D{" + "nome=" + getNome() + '}';
    }
}
