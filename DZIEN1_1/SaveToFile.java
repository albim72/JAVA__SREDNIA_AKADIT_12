import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] linie = {"pierwsza linia tekstu do zapisania","druga linia - 4957634975834975",
        "trzecia linia: fbjkjdsaofvmflkgmbdls;", "czwarta...."};

        FileWriter fw = null;

        try {
            fw = new FileWriter("c:\\Temp\\superdane.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            for(int i=0; i<linie.length; i++){
                bw.write(linie[i]);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("dokonano zapisu danych z listy linie do pliku: superdane.txt");

    }
}
