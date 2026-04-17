/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author LUID1.7
 */
    public class PagamentoCartao implements Pagamento {
        private double valor;

        public PagamentoCartao(double valor) {
            this.valor = valor;
        }

        @Override
        public double calcularTotal() {
            return valor + (valor * 0.05); 
        }

        @Override
        public void imprimirRecibo() {
            System.out.println("\n--- Recibo: Pagamento no Cartão ---");
            System.out.println("Valor original: R$ " + String.format("%.2f", valor));
            System.out.println("Taxa da maquininha: 5%");
            System.out.println("Total a pagar: R$ " + String.format("%.2f", calcularTotal()));
            System.out.println("-----------------------------------");
        }
    }