package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo os números
        System.out.println("Digite o multiplicando: ");
        int multiplicando = sc.nextInt();

        System.out.println("Inicio do intervalo: ");
        int inicioIntervalo = sc.nextInt();

        System.out.println("Final do intervalo: ");
        int finalIntervalo = sc.nextInt();

        // Testando as entradas e imprimindo
        if (multiplicando < 0 || multiplicando > 3000) {
            System.out.println("O multiplicando deve estar entre 0 e 3000!");
        }
        else if (inicioIntervalo < 0 || inicioIntervalo > 3000) {
            System.out.println("O início do intervalo deve estar entre 0 e 3000!");
        }
        else if (finalIntervalo < 0 || finalIntervalo > 3000) {
            System.out.println("O final do intervalo deve estar entre 0 e 3000!");
        }
        else if ((finalIntervalo - inicioIntervalo) >= 10 ) {
            System.out.println("O intervalo não pode ter uma diferença maior que 10!");
        }
        else if (inicioIntervalo >= finalIntervalo) {
            System.out.println("O inicio do intervalo deve ser menor que o final!");
        }
        else {
            for (int i = inicioIntervalo; i <= finalIntervalo; i++) {
                System.out.println(multiplicando + " x " + i + " = " + (multiplicando*i));
            }
        }

        sc.close();
    }

}
