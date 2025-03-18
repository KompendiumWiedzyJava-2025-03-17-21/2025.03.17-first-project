import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        /*Random losowacz = new Random();
        int losowaLiczba = losowacz.nextInt(100);
        System.out.println(losowaLiczba);*/

        Random losowacz = new Random();
        int[] tab = new int[100];
        tab[0] = losowacz.nextInt(1000);
        System.out.print(tab[0] + " ");
        int max = tab[0];
        for(int i = 1; i < 100; i++) {
            tab[i] = losowacz.nextInt(1000);
            System.out.print(tab[i] + " ");
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println();
        System.out.println("Max value: " + max);
    }
}
