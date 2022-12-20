import javax.swing.text.SimpleAttributeSet;
import java.util.Stack;

public class Main {

    static void stack_push(Stack<Integer> stack){
        for (int i=0;i<5;i++){
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("opercja zdejmowania ze stosu...");
        for (int i=0;i<5;i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("Element na górze stosu: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);
        if(pos==-1){
            System.out.println("element nie został znaleziony");
        }
        else {
            System.out.println("Element został znaleziony na pozycji: " + pos);
        }
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        System.out.println(stack);

        stack_peek(stack);
        stack_search(stack,2);
        stack_search(stack,6);
        stack_pop(stack);

        Stack mojstos = new Stack();
        mojstos.push(90);
        mojstos.push("abc");
        mojstos.push(true);

        System.out.println(mojstos);
    }
}
