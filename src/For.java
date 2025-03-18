public class For {
    public static void main(String[] args) {
        int[] tab = new int[100];

        for(int i = 0; i < 100; i++) {
            tab[i] = i*3;
        }


        for(int element : tab) {
            System.out.println(element);
        }
    }
}
