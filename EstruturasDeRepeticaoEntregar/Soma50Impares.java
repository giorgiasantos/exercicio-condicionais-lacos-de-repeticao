package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class Soma50Impares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR DE INÍCIO: ");
        int numeroInicio = entrada.nextInt();
        int soma = 0;

        for(int i = numeroInicio; i <= 50; i++) {

            if(i % 2 == 0) {

            }else if (i % 2 != 0) {
                soma += i;
                System.out.println(i + " é ímpar.");

            }
        }
        System.out.println("A soma de todos os números ímpares é = "+ soma);
    }
}
