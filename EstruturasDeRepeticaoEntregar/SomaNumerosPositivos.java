package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeroEntrada = 0;
        double soma = 0;

        System.out.println("DIGITE A QUANTIDADE DE NÚMEROS");
        int qtdeMedia = entrada.nextInt();

        for(int i = 0; i < qtdeMedia; i++) {
            System.out.println("Digite um número: ");
            numeroEntrada = entrada.nextDouble();

            if (numeroEntrada >= 0) {
                soma += numeroEntrada;
            }else if (numeroEntrada < 0){
                System.out.println("Número inválido.");
                break;
            }
            System.out.println("A soma é: " + soma);

            }

        }

    }

