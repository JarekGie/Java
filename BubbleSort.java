/**
 * Created by Ernest on 17.09.2017.
 *
 * Wygenerować tablicę 10 elementową i posortować elementy
 */
public class BubbleSort {
    public static void main(String[] args) {
        int i,j,temp;
        int ilw = 10;
        int[] tablica = new int[ilw];

        //wypełnienie tablicy liczbami pseudolosowymi

        for(i = 0; i < ilw;i++){
            tablica[i] = (int)(20 * Math.random());
        }


        System.out.println("Tablica przed posortowaniem: ");
        for (i = 0;i < ilw;i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("Tablica po posortowaniu");

        for (i = 0;i < ilw;i++){
            for(j = 0;j < ilw;j++){
                if(tablica[i] != tablica[j]){
                    if(tablica[i] < tablica[j]){
                        temp = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = temp;
                    }
                }
            }
        }
        for (i = 0;i < ilw;i++){
            System.out.print(tablica[i] + " ");
        }
    }//main
}//class
