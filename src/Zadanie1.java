public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        String wholeTab = "";
        String numbers = "";
        for(int i = 0; i < 100; i++) {
            tab[i] = i;
            wholeTab = wholeTab + i + " ";
            if(tab[i] % 5 == 0) {
                numbers = numbers + tab[i] + " ";
            }
        }

        System.out.println(wholeTab);
        System.out.println(numbers);
    }
}
