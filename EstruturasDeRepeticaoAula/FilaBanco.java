package EstruturasDeRepeticaoAula;

import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantas pessoas tem na fila: ");

        for (int i = entrada.nextInt(); i >= 0; i--) {
            System.out.println("Tem " + i + " pessoa(s) na fila.");
        }
    }
}
