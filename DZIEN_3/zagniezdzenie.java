public class Main {
    static void fun(){
        try{
            throw new NullPointerException("info");
        } catch (NullPointerException e){
            System.out.println("Uchwyt wyjątku wewnątrz fun()");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Uchwyt wyjątku w metodzie main()");
        }

    }
}
