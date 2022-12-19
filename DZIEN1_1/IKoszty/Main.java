public class Main {
    public static void main(String[] args) {

        double litry = 46.45;
        double cenazalitr = 7.65;
        double odleglosc = 515.67;

        Pojazd p = new Pojazd();
        System.out.printf("spalanie [l/100km]: %.3f\n",p.spalanie100(odleglosc,litry));
        System.out.printf("koszt przejazdu na trasie %.2f km: %.2f zł\n",
                odleglosc,p.kosztyPrzejazdu(odleglosc,litry,cenazalitr));
    }
}
