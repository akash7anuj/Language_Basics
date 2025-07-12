//1** stack by LinkedList  */

//2** stack by ArrayList   */

// import java.util.ArrayList;
// import java.util.Stack;

import java.util.Stack;

public class p_stack {

    // { last in, first out }
    
    /*  Operations in stack

        ->  push O(1)
        ->  pop O(1)
        ->  peek O(1)  {top}   */


/*
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }      
    }

    static class stack {
        private Node head;
        
        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public int pop(){
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
      
        public static void main(String[] args) {
            
            stack s = new stack();
    
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
    
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }

        }
    }   */

//2** stack by ArrayList   */

/* 
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public void push(int data){
            list.add(data);
        }

        // pop
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top;
        }

        // peek
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() -1);
        }


    }

    public static void main(String[] args) {
            
        // p_stack s = new p_stack();
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }       */

//3** Stack by Operations

/* 
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }       */


//4** questions

/*a**  Push at the bottom of stack */

/* 
    public static void pushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(6, s);
        pushAtBottom(7, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }       */


/*b**  reverse a stack   */

    public static void pushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        reverseStack(s);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    } 

    

}    



