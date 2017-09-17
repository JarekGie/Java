/**
 * Created by Ernest on 17.09.2017.
 *
 * Wykorzystując wygenerowany wektor obliczyć jego sumę przy użyciu kolejno pętli for,  while i do...while.

 */
public class Suma {
    public static void main(String[] args) {
        int ilw = 10;
        int [] tab = new int[ilw];
        int i;
        int suma;

//generowanie wektora
        for (i=0;i<ilw;i++)
            tab[i]=(int)(20*Math.random());

//wypisuje wygenerowany wektor
        System.out.println("Wektor:");
        for (i=0;i<ilw;i++)
            System.out.print(tab[i]+ "  ");
        System.out.println();

//for: warunek jest sprawdzany przed wejściem do pętli
        suma = 0;
        for (i=0;i<ilw;i++)
            suma += tab[i];
        System.out.println("Suma 'for' wynosi: " +suma);

//while: warunek jest sprawdzany przed wykonaniem instrukcji
        suma = 0;
        i = 0;
        while (i<ilw) {
            suma += tab[i];
            i++;
        }
        System.out.println("Suma 'while' wynosi: " +suma);

//do...while: warunek jest sprawdzany po wykonaniu
//instrukcji - jest ona wykonywana przynajmniej raz
        suma = 0;
        i = 0;
        do {
            suma +=  tab[i];
            i++; }
        while (i<ilw);
        System.out.println("Suma do..while     wynosi: " +suma);
    }//main
}//class
