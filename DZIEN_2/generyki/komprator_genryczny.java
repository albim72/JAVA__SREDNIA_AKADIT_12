public class Main {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum z %d, %d i %d to %d\n\n",13,4,67,maximum(13,4,67));
        System.out.printf("Maximum z %f, %f i %f to %f\n\n",6.67,0.4566,87.324,maximum(6.67,0.4566,87.324));
        System.out.printf("Maximum z %s, %s i %s to %s\n\n","gruszka","arbuz","kiwi",maximum("gruszka","arbuz","kiwi"));

    }
}
