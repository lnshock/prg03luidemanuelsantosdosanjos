

package br.com.ifba.atividade09.view;


public class Circulo extends Forma2D {

    private double raio;
    //Metodo construtor 
    public Circulo(double nRaio) {
        super("Circulo");
        this.raio = nRaio;
    }
    //Metodos getters e setters e o toString
    public void setRaio(double novoRaio) {
        this.raio = novoRaio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "nome=" + getNome() + ", raio=" + raio + ", area=" + String.format("%.2f", obterArea()) + '}';
    }
}
