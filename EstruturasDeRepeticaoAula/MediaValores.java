package EstruturasDeRepeticaoAula;

import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        double numeroUsuario = 0;
        double soma = 0;

        System.out.println("Digite a quantidade de números que quer tirar a média: ");
        double n = entrada.nextDouble();

        while (i < n) {
            System.out.println("Digite um número: ");
            numeroUsuario = entrada.nextDouble();
            soma += numeroUsuario;
            i++;
        }

        double media = soma / n;
        System.out.println("A média é: " + media);


    }
}
