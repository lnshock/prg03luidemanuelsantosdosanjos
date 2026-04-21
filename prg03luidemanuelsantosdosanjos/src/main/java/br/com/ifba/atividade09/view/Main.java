
package br.com.ifba.atividade09.view;

public class Main {

    public static void main(String[] args) {

        //Criando vetor
        Forma[] formas = new Forma[6];

        // Formas 
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(6.0, 3.0);
        formas[3] = new Esfera(3.0);
        formas[4] = new Cubo(2.0);
        formas[5] = new Piramide(4.0, 6.0, 5.0);

        //Pegando dados do vetor
        for (Forma forma : formas) {
            //Mostra os toString
            System.out.println(forma);

            // Verifica o tipo e mostra area ou area e volume
            if (forma instanceof Forma2D) {
                Forma2D f2d = (Forma2D) forma;
                System.out.println("  Tipo: FormaBidimensional");
                System.out.println("  Area: " + String.format("%.2f", f2d.obterArea()));

            } else if (forma instanceof Forma3D) {
                Forma3D f3d = (Forma3D) forma;
                System.out.println("  Tipo: FormaTridimensional");
                System.out.println("  Area: " + String.format("%.2f", f3d.obterArea()));
                System.out.println("  Volume: " + String.format("%.2f", f3d.obterVolume()));
            }

            System.out.println();
        }
    }
}
