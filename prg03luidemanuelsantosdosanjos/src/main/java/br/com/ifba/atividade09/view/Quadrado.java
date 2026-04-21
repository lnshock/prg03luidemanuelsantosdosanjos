package br.com.ifba.atividade09.view;

public class Quadrado extends Forma2D {

    private double lado;
    //Metodo construtor 
    public Quadrado(double nLado) {
        super("Quadrado");
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
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "nome=" + getNome() + ", lado=" + lado + ", area=" + String.format("%.2f", obterArea()) + '}';
    }
}
