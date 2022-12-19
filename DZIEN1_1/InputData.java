import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Temp\\superdane.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Błąd!!! Nie znaleziono pliku");
            System.exit(1);
        }
        int bajt = 0;
        try{
            bajt = fis.read();
            while (bajt != -1){
                System.out.print((char)bajt);
                bajt = fis.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
