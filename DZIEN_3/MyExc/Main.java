public class Main {
    public static void main(String[] args) {

        try {
            throw new MyException("To jest moj wyjątek!");
        } catch (MyException e) {
            System.out.println("Uchwyt");
            System.out.println(e.getMessage());
        }
    }
}
