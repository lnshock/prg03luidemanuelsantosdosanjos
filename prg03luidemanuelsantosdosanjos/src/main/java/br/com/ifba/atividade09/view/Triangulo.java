package br.com.ifba.atividade09.view;

public class Triangulo extends Forma2D {

    private double base;
    private double altura;
    //Metodo construtor 
    public Triangulo(double nBase, double nAltura) {
        super("Triangulo");
        this.base = nBase;
        this.altura = nAltura;
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

    @Override
    public double obterArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "nome=" + getNome() + ", base=" + base + ", altura=" + altura + ", area=" + String.format("%.2f", obterArea()) + '}';
    }
}
