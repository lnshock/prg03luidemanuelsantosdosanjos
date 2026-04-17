/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author LUID1.7
 */
public class PagamentoPix implements Pagamento {
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor; //Retornando valor total
    }

    @Override
    public void imprimirRecibo() {
        double cashback = valor * 0.02;
        System.out.println("\n--- Recibo: Pagamento via Pix ---");
        System.out.println("Valor pago: R$ " + String.format("%.2f", calcularTotal()));
        System.out.println("Parabéns! Você recebeu um cashback de R$ " + String.format("%.2f", cashback));
        System.out.println("---------------------------------");
    }
}