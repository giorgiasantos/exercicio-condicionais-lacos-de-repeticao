package EstruturasDeRepeticaoAula;

import java.util.Scanner;

public class LoopSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numeroUsuario = entrada.nextInt();
            somaNumeros += numeroUsuario;

        }
        System.out.println("A soma de todos os números é " + somaNumeros);
    }
}
