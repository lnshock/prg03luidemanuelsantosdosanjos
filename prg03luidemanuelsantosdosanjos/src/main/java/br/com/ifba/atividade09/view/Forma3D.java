
package br.com.ifba.atividade09.view;

public abstract class Forma3D extends Forma {

    public Forma3D(String nNome) {
        super(nNome);
    }

    // Metodos abstratos - cada subclasse calcula sua propria area e volume
    public abstract double obterArea();
    public abstract double obterVolume();

    @Override
    public String toString() {
        return "Forma3D{" + "nome=" + getNome() + '}';
    }
}
