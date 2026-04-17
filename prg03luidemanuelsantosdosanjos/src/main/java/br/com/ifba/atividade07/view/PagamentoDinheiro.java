/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author LUID1.7
 */
public class PagamentoDinheiro implements Pagamento {
    private double valor;

    // Criando o metodo construtor
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor - (valor * 0.10); 
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("\n--- Recibo: Pagamento em Dinheiro ---");
        System.out.println("Valor original: R$ " + String.format("%.2f", valor));
        System.out.println("Desconto aplicado: 10%");
        System.out.println("Total a pagar: R$ " + String.format("%.2f", calcularTotal()));
        System.out.println("-------------------------------------");
    }
}
