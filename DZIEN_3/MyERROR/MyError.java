public class MyError extends Exception {
    private static int accno[] = {1001,1002,1003,1004};
    private static String name[] = {"Benek","Anna","Olaf","Leon","Nadia"};
    private static double bal[] = {10000.00,12000.00,5230.00,999.00,1100.55};

    
    public MyError(){}
    public MyError(String message) {
        super(message);
    }
}
