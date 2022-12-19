public class Main {
    public static void main(String[] args) {

        String name = "Janusz";
        int wiek = 33;
        double bmi = 27.9986;
        int n = 101;

        String s1 = String.format("imię zawodnika: %s",name);
        String s2 = String.format("wiek zawodnika: %d",wiek);
        String s3 = String.format("BMI ciała zawodnika: %8.5f",bmi);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.printf("Dane zawodnika -> \nimię: %s, wiek: %d, bmi: %3.12f\n",name,wiek,bmi);

        System.out.printf("format -> 1: %d\n2:[%10d]\n3:[%-10d]\n4:[% d]\n5:[%010d]",n,n,n,n,n);
    }
}
