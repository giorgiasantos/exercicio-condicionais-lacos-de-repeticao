package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O SEU NÚMERO: ");
        int numero = entrada.nextInt();

        for(int i = numero; i > 1; i--) {
            numero *= i - 1;
        }
        System.out.println("O fatorial é: " + numero);

    }
}
