/**
 * Created by Ernest on 18.09.2017.
 *
 * Należy rozdzielić elementy parzyste od nieparzystych umieszczając parzyste
 * od początku nowego wektora a nieparzyste – od końca.
 *
 */
public class Rozdzielpn {
    public static void main(String[] args) {

       int ilw = 10;
       int[] wek = new int[ilw];
       int[] nwek = new int[ilw];
       int i,j,k;

       //wypełniam tablicę liczbami pseudolosowymi

        for (i = 0;i < ilw;i++){
            wek[i] = (int)(20 * Math.random());
        }
        //wypisuję wygenerowaną tablicę

        System.out.println("Zawartość tablicy pierwotnej :");
        for (i = 0;i < ilw;i++){
            System.out.print(wek[i] + " ");
        }
        System.out.println();
        //sprawdzam parzystość i przenoszę parzystę od początku tablicy, a nieparzyste od końca

        j = 0;
        k = ilw - 1;

        for (i = 0;i < ilw;i++){
            if(wek[i] % 2 ==0){
                nwek[j] = wek[i];
                j++;
            }
            else {
                nwek[k] = wek[i];
                k--;
            }
        }

        //wypisuję tablicę wynikową
        System.out.println("Tablica wynikowa :");
        for (i = 0;i < ilw;i++){
            System.out.print(nwek[i] + " ");
        }

    }//main
}//class
