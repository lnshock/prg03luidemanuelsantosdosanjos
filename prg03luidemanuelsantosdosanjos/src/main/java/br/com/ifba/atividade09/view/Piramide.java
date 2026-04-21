package br.com.ifba.atividade09.view;

/**
 * Forma tridimensional: Piramide (base quadrada).
 * Area = base^2 + 2 * base * apotema
 * Volume = (base^2 * altura) / 3
 */
public class Piramide extends Forma3D {

    private double base;
    private double altura;
    private double apotema;
    //Metodo construtor 
    public Piramide(double nBase, double nAltura, double nApotema) {
        super("Piramide");
        this.base = nBase;
        this.altura = nAltura;
        this.apotema = nApotema;
    }
    //Metodos getters e setters e o toString
    public void setBase(double novaBase) {
        this.base = novaBase;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setApotema(double novoApotema) {
        this.apotema = novoApotema;
    }

    public double getApotema() {
        return this.apotema;
    }

    @Override
    public double obterArea() {
        return (base * base) + (2 * base * apotema);
    }

    @Override
    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return "Piramide{" + "nome=" + getNome() + ", base=" + base + ", altura=" + altura + ", apotema=" + apotema
                + ", area=" + String.format("%.2f", obterArea())
                + ", volume=" + String.format("%.2f", obterVolume()) + '}';
    }
}
