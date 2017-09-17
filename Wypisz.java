/**
 * Created by Ernest on 17.09.2017.
 *
 * Wygenerować wektor liczb całkowitych,
 * wypisać te elementy wektora, które mieszczą się w przedziale określonym przez zmienne min i max.
 */
public class Wypisz {
    public static void main(String[] args) {
        int ilw = 10;
        int[] wek = new int[ilw];
        int i;
        int min = 30;
        int max = 70;

//generuje wektor 10-elementowy,z liczb od 0 do 99
        for (i=0;i<ilw;i++)
            wek[i]=(int)(100*Math.random());

//wypisuje wygenerowany wektor
        System.out.println("Wektor pierwotny:  ");
        for (i=0;i<ilw;i++)
            System.out.print(wek[i]+ "  ");
            System.out.println();
//przejście na poczatek nastepnego wiersza
//System.out.println();

//wypisuje elementy wektora spelniajace zadany warunek
        System.out.println("Wynik:");
        for (i=0;i<ilw;i++){
            if ((wek[i]>min) && (wek[i]<max))
                System.out.print(wek[i]+ "  ");
        }//for
    }//main
}//class
