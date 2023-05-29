package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class MediaNumerosInt {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE NÚMEROS QUE QUER TIRAR A MÉDIA: ");
        int qtdeNumeros = entrada.nextInt();

        double numero = 0;
        double soma = 0;

        for(int i = 0; i < qtdeNumeros; i++) {
            System.out.println("DIGITE UM NÚMERO: ");
            numero = entrada.nextDouble();
            soma += numero;
        }
        double media = soma / qtdeNumeros;
        System.out.println("A média é : " + media);


    }
}
