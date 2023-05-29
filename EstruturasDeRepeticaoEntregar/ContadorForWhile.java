package EstruturasDeRepeticaoEntregar;

public class ContadorForWhile {
    public static void main(String[] args) {

        // Contador com for
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Contador com while
        int i = 1;

        while(i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
