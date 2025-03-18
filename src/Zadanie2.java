public class Zadanie2 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab[row][col] = (row + 1) * (col + 1);
                System.out.print(tab[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
