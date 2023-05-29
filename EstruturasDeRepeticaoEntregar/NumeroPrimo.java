package EstruturasDeRepeticaoEntregar;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O NÚMERO: ");
        int numero = entrada.nextInt();
        int ehPrimo = 0;

        for(int i = 2; i < numero; i++) {
            if(numero % i != 0)  {
                ehPrimo += 1;
            }
        }

        if (numero % 2 != 0) {
            System.out.println("Esse número é primo.");
        } else if (ehPrimo == 0){
            System.out.println("Esse número não é primo.");
        }
    }
}
