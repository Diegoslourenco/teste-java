package exercicio2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo os valores de peso e valor da carga
        System.out.println("Digite os valores da carga\nValor: ");
        double valor = sc.nextDouble();

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        // Instanciando
        Vagao vagao = new Vagao(valor, peso);
        Caminhao caminhao = new Caminhao(valor, peso);

        //Imprimindo valores de frete para o usuario
        System.out.println("Os valores de frete para a carga informada\nVagao: ");
        System.out.println(vagao.calculaFrete());

        System.out.println("Caminhao: ");
        System.out.println(caminhao.calculaFrete());

        sc.close();
    }
}
