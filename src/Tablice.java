public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int[10];
        tab[0] = 1;
        tab[1] = 5;
        tab[2] = 15;

        System.out.println(tab[0]);

        System.out.println(tab[5]);

        String[] strings = new String[10];
        char[] chars = new char[10];
        boolean[] booleans = new boolean[10];

        System.out.println(booleans[0]);
        System.out.println(chars[0]);

        System.out.println(strings[0]);

        int[] liczby = {2,4,6,8,10};

        System.out.println(liczby[0]);
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);
        System.out.println(liczby[3]);
        System.out.println(liczby[4]);

        int x = 5;
        int[] tab3 = new int[10];
        int[][] tab2D = new int[5][5];
        int[][][] tab3D = new int[3][3][3];

        tab2D[2][3] = 66;

        System.out.println(tab2D[2][3]);


        int[][] tab2D2 = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        System.out.println(tab2D2[0][1]);

        int[] y = tab2D2[0];
    }
}
