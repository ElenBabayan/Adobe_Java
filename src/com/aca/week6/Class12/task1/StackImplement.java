package com.aca.week6.Class12.task1;

public class StackImplement {
    public static void main(String[] args) throws StackIsFullException, StackIsEmptyException {
/*      StackDefault<String> myStack = new StackDefault<>();
        myStack.push("obj1");
        myStack.pop();
        myStack.pop();
        myStack.push("obj2");
        myStack.push("obj3");
        myStack.push("obj4");
        myStack.push("obj5");
        myStack.push("obj6");*/
        //Ctrl + shift + /

        // GENERICS => TYPE SAFETY
        Stack<Integer> myStack = new StackDefault<>();
        myStack.push(1);
        final Integer popped = myStack.pop();
        System.out.println(popped);

        // Printer class
        // print(String[] objects)
        // print(Integer[] objects)
    }
}
