package bai11.thuchanh01;

public class GenericStackClient {
    private static void stackOfIsStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("two");
        stack.push("One");
        System.out.println("1.1 size of stack after push operationas: " + stack.size());
        System.out.println("1.2. Pop elements from stack: ");
        while ( !stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3. size of stack after pop opperations: " + stack.size() );
    }

    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 size of stack after push operationas: " + stack.size());
        System.out.println("1.2. Pop elements from stack: ");
        while ( !stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3. size of stack after pop opperations: " + stack.size() );

    }


        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntergers();
            System.out.println("\n2. Stack of Strings");
            stackOfIsStrings();
    }



}
