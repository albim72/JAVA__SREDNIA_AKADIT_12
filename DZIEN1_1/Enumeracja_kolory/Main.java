public class Main {
    public static void main(String[] args) {

        EKolor arr[] = EKolor.values();
        for(EKolor col:arr){
            System.out.println(col + " o indeksie " + col.ordinal());
        }

        System.out.println(EKolor.valueOf("GRAY"));
    }
}
