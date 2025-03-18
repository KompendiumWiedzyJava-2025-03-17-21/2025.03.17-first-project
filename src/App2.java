public class App2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        double d = x;
        int i = (int) d;

        var wynik = x + y;
        System.out.println(wynik);

        String s1 = "Mateusz";
        String s2 = "Bereda";

        System.out.println(s1 + " " + s2);

        boolean wynik2 = x >= y;
        System.out.println(x >= y);
        /*System.out.println(((double) x) / (double) y);*/

        /*int i2 = 60000;
        short s = (short) i2;

        System.out.println(s);*/

        var z = funkcja();


        var z2 = funkcja();


        var z3 = funkcja();



        boolean b1 = true;
        boolean b2 = false;

        System.out.println(!b1);
    }

    public static int funkcja() {
        return 6;
    }
}
