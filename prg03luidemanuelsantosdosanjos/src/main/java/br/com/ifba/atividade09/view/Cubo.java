
package br.com.ifba.atividade09.view;


public class Cubo extends Forma3D {

    private double lado;
    //Metodo construtor 
    public Cubo(double nLado) {
        super("Cubo");
        this.lado = nLado;
    }
    //Metodos getters e setters e o toString
    public void setLado(double novoLado) {
        this.lado = novoLado;
    }

    public double getLado() {
        return this.lado;
    }

    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obterVolume() {
        return lado * lado * lado;
    }

    @Override
    public String toString() {
        return "Cubo{" + "nome=" + getNome() + ", lado=" + lado
                + ", area=" + String.format("%.2f", obterArea())
                + ", volume=" + String.format("%.2f", obterVolume()) + '}';
    }
}
