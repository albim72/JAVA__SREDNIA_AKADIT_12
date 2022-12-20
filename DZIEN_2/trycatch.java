public class Main {
    public static void main(String[] args) {
        int a = 102;
        int b = 0;

        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("po prostu zwykłe dzielenie przez 0");
        }

        System.out.println("ciąg dalszy");

    }
}
