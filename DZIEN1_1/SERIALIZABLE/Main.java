import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Content cn = new Content(4553,"takie tam ciekawe informacje....");

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cn);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Content b = (Content) ois.readObject();

        System.out.println(b.i + " - " + b.s);
        oos.close();
        ois.close();

    }
}
