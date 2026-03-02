package com.java.collections_framework.stack;

import java.util.Stack;

public class Main {
//stack
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.add(1); //add import vector 1st element
        stack.add(2); //not recommend     2nd element
        stack.add(3); // 3

        stack.push(4); //push import stack 4
        stack.push(5); //8 5 2
        stack.push(6); // 6
        stack.push(4); //push import stack 7
        stack.push(5); // 8
        stack.push(6); // 9
        stack.push(4); //push import stack 10
        stack.push(5); //  11 2
        stack.push(6); // 12
        System.out.println(stack);
        System.out.println(stack.search(5)); //
    }
}
