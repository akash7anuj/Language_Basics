

public class o_linked_List {
    
    /*  Property 
            Variable Size  { can add unlimited memory }
            Non-contiguous Memory  { no continues steps }
            Insert in O(1)  { time complexcity }
            Search in O(n)  { ,, }  */


    /*
        data -- next {reference ya pointer for linking }

        node --> it's one data  {data + next = node}  
        
        ->  last node is empty or null node  */


    /*  Type of linked List
            singular
            double
            circular  */


// singular LinkedList

 
    Node head;
    private int size;

    o_linked_List(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;  
        }
    }

    // add at first position
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add at last position
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // delete at first position
    public void deleteFirst(){
        if(head == null){
            System.out.println("this list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // delete at last position
    public void deleteLast(){
        if(head == null){
            System.out.println("this list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;            
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode =  lastNode.next;
            secondLast = secondLast.next;            
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    // reverse linkedLink by iteration { loop }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode; 

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
        
    }

    // reverse linkedLink by recursion { loop }
    public Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }


    public void printNode(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

       System.out.println("NULL");
    }

    

    public static void main(String[] args) {
        
        o_linked_List list = new o_linked_List();

    /*  list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addLast("4");
        list.addLast("5");

        list.printNode();
        
        list.deleteFirst();
        list.printNode();

        list.deleteLast();
        list.printNode();


        System.out.println(list.getSize());
        list.addFirst("anuj");
        list.printNode();
        System.out.println(list.getSize());  */

    /*  list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printNode();

        list.reverseIterate();
        list.printNode();  */


        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printNode();

        list.head = list.reverseRecursion(list.head);
        list.printNode();


    }  
     

    // this this from collection framework { function }  [ short-cut ]

/*  public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        
        list.addFirst("a");  // addFirst()
        list.addFirst("is");
        System.out.println(list);

        list.addLast("good");  // addLast()
        list.addLast("boy");
        list.add("and");     // add()
        System.out.println(list);

        System.out.println(list.size()); // size()

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");     // get()
        } System.out.println("nul");


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == "is"){      // for search value
                System.out.println("yes");
            }
        }

        list.removeFirst();  // delete first
        System.out.println(list);

        list.removeLast();   // delete last
        System.out.println(list);

        list.remove(1);  // delete index value
        System.out.println(list);


    }  */
     
     
}
