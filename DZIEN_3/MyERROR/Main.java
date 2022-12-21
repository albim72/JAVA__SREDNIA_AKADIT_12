public class Main extends Exception {

    private static int accno[] = {1001,1002,1003,1004};
    private static String name[] = {"Benek","Anna","Olaf","Leon","Nadia"};
    private static double bal[] = {10000.00,12000.00,5230.00,999.00,1100.55};


    public Main() {
    }

    public Main(String message) {
        super(message);
    }

    public static void main(String[] args) {


        try {
            System.out.printf("NR_KONTA\tKLIENT\tBILANS\n");
            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);

                if (bal[i] < 1000) {
                    Main me = new Main("Bilans nie może być mniejszy nie 1000 zł");
                    throw me;
                }
            }

        } catch (Main e) {
            System.out.println(e);
        }

    }
}
