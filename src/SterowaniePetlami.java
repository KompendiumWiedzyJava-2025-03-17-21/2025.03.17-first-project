public class SterowaniePetlami {
    public static void main(String[] args) {
        duzaPetla: for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == 5 && j == 5) {
                    continue duzaPetla;
                }
                System.out.println("I: " + i + " J: " + j);
            }
        }
    }
}
