package palg;

import java.io.IOException;

public class Cviko02_Uloha03
{
    // Chytré hodinky zaznamenávají každý den počet hodin strávených sportem (smartSportData.txt).
    // Doplň metodu maxZeroIntervalLength, která zjistí, kolik nejvýše dní za sebou bylo zaznamenáno zcela beze sportu.

    public static void main(String[] args) throws IOException
    {
        int[] sporty;
        sporty=Cviko02_FileUtils.integersFromFile("smartSportData.txt");

        System.out.println(maxZeroIntervalLength(sporty));
    }

   public static int maxZeroIntervalLength( int[] values )
   {    
    int x=0;
    int y = 0;
        for (int i : values) {
            if (i == 0){
                x++;
            }
            else{
                y=x;
                x=0;
                System.out.println(y);
            }
        }
       return y;
   }
}
