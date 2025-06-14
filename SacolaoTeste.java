package gf.oracle.programacao;

import java.util.Scanner;

public class SacolaoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sacolao sacolao = new Sacolao();

        int opcao;

        do {
            sacolao.mostrarMenu();
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Quantas unidades deseja comprar? ");
                int quantidade = scanner.nextInt();
                sacolao.comprar(opcao, quantidade);
            } else if (opcao != 6) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        System.out.println("Obrigado por comprar no sacolão!");
        scanner.close();
    }
}
