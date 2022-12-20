public class Main {
    public static void main(String[] args) {

        KlientKlubu os = new KlientKlubu("Jan","Kot",45,89,173,"Siłacz",
                "Rzeszów",2345.8);
        System.out.println(os.getOsoba());
        System.out.println(os.wiek_za_N_lat(18));
        System.out.println("Czy osoba jest pracownikiem? -> " + os.czypracownik());
        System.out.println("_________________________________________________");
        os.InfoKlub();
        System.out.printf("\nBMI ciała osoby: %.2f\n",os.policzbmi());
        System.out.printf("opis wyniku BMI: %s\n",os.opisbmi());
        System.out.printf("zapotrzebowanie energetyczne: %.2f kcal",os.policzPPM("facet"));
    }
}
