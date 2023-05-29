package EstruturasDeDecisao;

import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número equivalente ao dia da semana: ");
        int diaDaSemana = entrada.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-feira");
                break;
            case 3:
                System.out.println("3 - Terça-feira");
                break;
            case 4:
                System.out.println("4 - Quarta-feira");
                break;
            case 5:
                System.out.println("5 - Quinta-feira");
                break;
            case 6:
                System.out.println("6 - Sexta-feira");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;
            default:
                System.out.println("Você digitou um valor inválido. Digite um número entre 1 e 7.");

        }



    }
}
