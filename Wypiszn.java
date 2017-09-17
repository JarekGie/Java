/**
 * Created by Ernest on 17.09.2017.
 *
 * Wygenerujmy długi, powiedzmy 200-elementowy wektor i wyświetlmy go po 15 elementów w każdym wierszu.

 */
public class Wypiszn {
    public static void main(String[] args) {
        int ilw = 200;
        int[] tablica = new int[ilw];
        int i;
        int signPerline = 15;
        int counter;

//generuje wektor 200-elementowy,z liczb od 0 do 20
        for (i=0;i<ilw;i++)
            tablica[i]=(int)(20*Math.random()+1);

        counter=0;
        System.out.println("Wektor:");
        for (i=0;i<ilw;i++){
            System.out.print((counter+1) + ") " + tablica[i]+ "  ");
            counter++;
            if (counter == signPerline){
                System.out.println();
                counter = 0;
            }
        }
    }//main
}//class
