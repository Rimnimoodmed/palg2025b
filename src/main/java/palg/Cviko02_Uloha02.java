package palg;

import java.io.IOException;
import java.util.Arrays;

public class Cviko02_Uloha02
{
    // Doplň metodu sumOfSmall (se dvěma vstupy), která vrátí součet čísel v daném poli,
    // která jsou nižší než daný limit.
    // Ze souboru southMoravia.txt zjisti, kolik lidí žije v obcích s méně než 1000 obyvatel.

    public static void main(String[] args)
    {
        
        try {
            var pole=Cviko02_FileUtils.integersFromFile("southMoravia.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static int sumOfSmall( int [] pole , int limit )
    {
        return Arrays.stream(pole).filter(i->i<limit).sum();
    }
}
