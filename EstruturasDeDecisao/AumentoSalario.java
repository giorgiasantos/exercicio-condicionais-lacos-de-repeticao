package EstruturasDeDecisao;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário atual: ");
        double salarioAntes = entrada.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("O seu salário era de R$ " + salarioAntes);

        if(salarioAntes <= 280) {
            double valorReajuste = salarioAntes * 0.2;
            double salarioDepois = salarioAntes + valorReajuste;
            System.out.println("Você tem direito a 20% de aumento, equivalente a R$ " + valorReajuste);
            System.out.println("Seu novo salário é de R$ " + salarioDepois);
        } else if (salarioAntes > 280 && salarioAntes <= 700) {
            double valorReajuste = salarioAntes * 0.15;
            double salarioDepois = salarioAntes + valorReajuste;
            System.out.println("Você tem direito a 15% de aumento, equivalente a R$ " + valorReajuste);
            System.out.println("Seu novo salário é de R$ " + salarioDepois);
        } else if (salarioAntes > 700 && salarioAntes <= 1500) {
            double valorReajuste = salarioAntes * 0.1;
            double salarioDepois = salarioAntes + valorReajuste;
            System.out.println("Você tem direito a 10% de aumento, equivalente a R$ " + valorReajuste);
            System.out.println("Seu novo salário é de R$ " + salarioDepois);
        } else if (salarioAntes > 1500) {
            double valorReajuste = salarioAntes * 0.05;
            double salarioDepois = salarioAntes + valorReajuste;
            System.out.println("Você tem direito a 5% de aumento, equivalente a R$ " + valorReajuste);
            System.out.println("Seu novo salário é de R$ " + salarioDepois);
        }

    }
}
