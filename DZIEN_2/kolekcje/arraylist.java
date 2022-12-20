import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=1;i<=15;i++){
            lista.add(i*3);
        }

        System.out.println(lista);
        lista.remove(5);
        System.out.println(lista);
    }
}
