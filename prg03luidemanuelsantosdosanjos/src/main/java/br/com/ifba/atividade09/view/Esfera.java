
package br.com.ifba.atividade09.view;

public class Esfera extends Forma3D {

    private double raio;
    //Metodo construtor 
    public Esfera(double nRaio) {
        super("Esfera");
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
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return "Esfera{" + "nome=" + getNome() + ", raio=" + raio
                + ", area=" + String.format("%.2f", obterArea())
                + ", volume=" + String.format("%.2f", obterVolume()) + '}';
    }
}
