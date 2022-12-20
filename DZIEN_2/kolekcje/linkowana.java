import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> imiona = new LinkedList<>();
        imiona.add("Janusz");
        imiona.add("Olga");
        imiona.add("Olaf");
        imiona.add("Anna");
        imiona.add("Sylwek");
        imiona.add(2,"Joanna");

        System.out.println(imiona);

        imiona.remove("Olaf");
        imiona.remove(0);
        imiona.removeFirst();
        imiona.removeLast();

        imiona.set(1,"Kunegunda");
        imiona.add(0,"Karol");
        imiona.addLast("Ula");

        System.out.println(imiona);

        for(int i=0;i< imiona.size();i++){
            System.out.printf("Osoba: %s\n",imiona.get(i));
        }
        System.out.println("_____________________________________");
        for(String st:imiona){
            System.out.printf("Osoba: %s\n",st);
        }

        Object[] linked_do_array = imiona.toArray();
        System.out.println(linked_do_array);

        for(Object element: linked_do_array){
            System.out.println(element);
        }

    }
}
