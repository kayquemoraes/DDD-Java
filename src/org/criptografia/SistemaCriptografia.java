package org.criptografia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaCriptografia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de criptografia!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Decriptar uma frase");
            System.out.println("2 - Encriptar uma frase");
            System.out.println("0 - Sair");

            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (opcao == 0) {
                    System.out.println("Saindo do sistema...");
                    break;
                }

                MetodoCriptografia metodo = null;

                if (opcao == 1 || opcao == 2) {
                    System.out.println("\nEscolha um método de criptografia:");
                    System.out.println("1 - Cifra de César");
                    System.out.println("2 - Código Morse");

                    int metodoEscolhido = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (metodoEscolhido == 1) {
                        System.out.println("Digite a chave para a Cifra de César:");
                        int chave = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        metodo = new CifraDeCesar(chave);
                    } else if (metodoEscolhido == 2) {
                        metodo = new CodigoMorse();
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                    }
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                System.out.println("Digite a frase:");
                String frase = scanner.nextLine();

                String resultado;
                if (opcao == 1) {
                    resultado = metodo.descriptografar(frase);
                } else {
                    resultado = metodo.criptografar(frase);
                }

                System.out.println("Resultado:");
                System.out.println(resultado);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro válido.");
                scanner.nextLine(); // Limpar o buffer do Scanner
            }
        }

        scanner.close();
    }
}
