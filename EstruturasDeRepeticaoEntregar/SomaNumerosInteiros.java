package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class SomaNumerosInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // VARIAVEIS
        double numeroEntrada = 0;
        double soma = 0;
        // ENTRADA DE QUANTIDADE DE NÚMEROS
        System.out.println("DIGITE A QUANTIDADE DE NÚMEROS QUE QUER SABER A MÉDIA: ");
        double entradaMedia = entrada.nextInt();

        // LOOP
        for(int i = 0; i < entradaMedia; i++) {
            System.out.println("DIGITE UM NÚMERO: ");
            numeroEntrada = entrada.nextDouble();
            soma += numeroEntrada;

        }
        // MÉDIA
        double media = soma / entradaMedia;
        System.out.println("A média é: " + media);




    }
}
