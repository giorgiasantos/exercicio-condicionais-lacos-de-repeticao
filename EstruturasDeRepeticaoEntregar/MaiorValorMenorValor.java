package EstruturasDeRepeticaoEntregar;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class MaiorValorMenorValor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = Integer.MAX_VALUE;

        for(int i = 1; i <= 10; i++) {
            System.out.println("DIGITE SEU NUMERO");
            int numero = entrada.nextInt();
            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
