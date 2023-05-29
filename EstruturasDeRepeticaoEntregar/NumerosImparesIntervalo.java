package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class NumerosImparesIntervalo {
    public static void main(String[] args) {
        // ENTRADAS
        Scanner entrada = new Scanner(System.in);
        int somaImpares = 0;
        System.out.println("DIGITE O NÚMERO DE INÍCIO DO INTERVALO: ");
        int comeco = entrada.nextInt();
        System.out.println("DIGITE O NÚMERO FINAL DO INTERVALO: ");
        int numeroFinal = entrada.nextInt();

        // CONDICIONAL DE NÚMEROS VÁLIDOS
            if(numeroFinal <= comeco) {
                System.out.println("Intervalo de valores inválido. ");
                return;
            // LOOP
            } else if (numeroFinal > comeco) {
                for (int i = comeco; i <= numeroFinal; i++) {
                    if(i % 2 == 0) {
                        System.out.println(i + " não é ímpar.");
                    } else if (i % 2 != 0) {
                        System.out.println(i +" é impar.");
                        somaImpares += i;
                    }
                }
            }
        // PRINT DE SAÍDA DA SOMA DOS ÍMPARES
        System.out.println("A soma dos números ímpares é = " + somaImpares);

    }
}
