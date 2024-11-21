public class Main {
    public static void main(String[] args) {

        Function triple = new Function() {
            @Override
            public int apply(int arg) {
                return arg*3;
            }
        };


        Function square = new Function() {
            @Override
            public int apply(int arg) {
                return arg*arg;
            }
        };

        /*
        Function compose(final Function f1, final Function f2){
            return new Function() {
                @Override
                public int apply(int arg){
                    return f1.apply(f2.apply(arg));
                }
            };
        }
        */
        System.out.println(triple.apply(56));
        System.out.println(square.apply(56));

        System.out.println(triple.apply(square.apply(56))); //czy to jest złożenie funckji??


    }
}
