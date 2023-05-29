package EstruturasDeDecisao;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ENTRADA DE MÉDIAS
        System.out.println("DIGITE A SUA PRIMEIRA NOTA: ");
        double nota1 = entrada.nextDouble();
        System.out.println("DIGITE A SUA SEGUNDA NOTA: ");
        double nota2 = entrada.nextDouble();

        // CÁLCULO DE MÉDIA
        double mediaFinal = (nota1 + nota2) / 2;

        // CONDICIONAL

        if(mediaFinal >= 7 && mediaFinal < 10) {
            System.out.println("Você foi aprovado!");
        } else if (mediaFinal == 10) {
            System.out.println("Você foi aprovado com distinção! PARABÉNS!");
        } else {
            System.out.println("Você foi reprovado :( ");
        }


    }
}
