import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void print(int a){
        if(a>=18){
            System.out.println("osoba pełnoletnia");
        }
        else {
            throw new IllegalArgumentException("osoba niepełnoletnia");
        }
    }

    public static void main(String[] args) {

        Main.print(19);
        Main.print(14);

        System.out.println("_____pierwszy blok try_____");
        try{
            String a = null;
            //System.out.println(a.charAt(0));
            String x = "To jest fragment tekstu";
            //char c = x.charAt(35);
            //System.out.println(c);

            File plik = new File("D:\\jaakistam\\plik.txt");
            FileReader fr = new FileReader(plik);

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException se){
            System.out.println(se);
        } catch (FileNotFoundException ef) {
            System.out.println(ef);
        }


        System.out.println("_____drugi blok try_____");

        try {
            int tab[] = new int[5];
            //tab[7] = 89;
            Scanner scan = new Scanner("Dane wejściowe");
            System.out.println(scan.nextLine());
            System.out.println("Wyjątek: " + scan.ioException());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
