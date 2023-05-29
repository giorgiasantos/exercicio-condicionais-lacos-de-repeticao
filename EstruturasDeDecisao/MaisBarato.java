package EstruturasDeDecisao;

import java.util.Scanner;

public class MaisBarato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double produto1 = entrada.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        double produto2 = entrada.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        double produto3 = entrada.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println("Você deve comprar o terceiro produto.");
        } else {
            System.out.println("Todos os produtos têm valor igual.");
        }

    }
}
