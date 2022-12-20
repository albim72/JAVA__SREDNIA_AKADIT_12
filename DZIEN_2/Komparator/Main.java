import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111,"Zenobiusz","ul.Złota 5 Kraków"));
        ar.add(new Student(121,"Ziuta","ul.Koralowa 34 Kraków"));
        ar.add(new Student(156,"Olga","ul.Złota 67 Kraków"));
        ar.add(new Student(455,"Olek","ul.Złota 12/56 Tarnów"));
        ar.add(new Student(234,"Gienio","ul.Kasztelańska 4, Kraków"));

        System.out.println("Nieposortowane: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar,new SortByRoll());
        System.out.println("Posortowane po nr albumu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar,new SortByName());
        System.out.println("Posortowane po imieniu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
