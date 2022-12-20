public class Main {
    public static void main(String[] args) {

        Twice<String,Integer> tw1 = new Twice<>("kolor nr",67);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,5.64);
        tw2.print();
    }
}
