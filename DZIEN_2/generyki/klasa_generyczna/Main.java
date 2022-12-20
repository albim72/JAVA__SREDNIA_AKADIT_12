public class Main {
    public static void main(String[] args) {

        Testowa<Integer> iObj = new Testowa<>(14);
        System.out.println(iObj.getObject());

        Testowa<String> sObj = new Testowa<>("to jest krótki test...");
        System.out.println(sObj.getObject());

        Testowa<Double> dObj = new Testowa<>(4.66556);
        System.out.println(dObj.getObject());
    }
}
