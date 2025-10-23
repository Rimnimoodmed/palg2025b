package palg;

public class Cviko02_Uloha00 {
    public static void main(String[] args)
    {
        int a= 0;
        int b= 0;
        double c = 0;
        double d = 0;
        int e1 = 0;
        int e2=0;
        System.out.println(a > a + 1); // Doplň hodnotu a aby se vypsalo true
         b= Integer.MIN_VALUE;
        System.out.println(b < 0 && Math.abs(b) == b); // Doplň hodnotu b aby se vypsalo true
         c = 9;
        System.out.println( 3 * c / 10 != 0.3 * c); // Doplň hodnotu c aby se vypsalo true
         d = Double.NaN;
        System.out.println( !(d >= 0) && !(d <= 0) ); // Doplň hodnotu d aby se vypsalo true
         e1 = 26;
         e2 = 12;
        System.out.println((8 & e1) == 8); // Doplň hodnotu e1 aby se vypsalo true
        System.out.println((6 | e2) == 14); // Doplň hodnotu e2 aby se vypsalo true


    }
}
