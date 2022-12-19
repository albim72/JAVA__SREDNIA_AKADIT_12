public class Main {
    public static void main(String[] args) {

        double waganaZiemi = 88;
        double waga = waganaZiemi/ EPlaneta.ZIEMIA.przeliczGrawitacje();

        for (EPlaneta p:EPlaneta.values())
            System.out.printf("Masa człowieka X na %s wynosi %f kg\n",p,p.przeliczWagi(waga));
    }
}
