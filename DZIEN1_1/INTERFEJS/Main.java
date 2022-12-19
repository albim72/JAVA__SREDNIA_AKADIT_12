public class Main {
    public static void main(String[] args) {

        Users usr = new Users();
        usr.info();
        System.out.printf("Rok: %d\n",IEkstra.rok);
        usr.opis(2300,0.88);
        System.out.println(usr.user("Jan","Kot"));
        usr.sekcja();


    }
}
