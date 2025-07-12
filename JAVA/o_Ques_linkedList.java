//1  Find & Delete the nth Node from the end of Linked List
//2  Check if a Linked List is a Palindrome
//3  Detect a Cycle in a Linked List + Trick to Remove the Cycle

public class o_Ques_linkedList {
    
//1  Find & Delete the nth Node from the end of Linked List

/*
    ListNode head;
    private int size;

    o_Ques_linkedList() {
        this.size = 0;
    }
    
    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
            size++;  
        }
    }

    public int getSize(){
        return size;
    }

    public ListNode removeNfromEnd(ListNode head, int n){
        if(head == null || head.next == null){
            return null;
        }
    // size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

    // previous node  { one node before from last node }
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 0;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;

    }

    // Method to add a node at the end of the list
    public void addLast(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Method to print the linked list
    public void printNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    
    }

    public static void main(String[] args) {
        
        o_Ques_linkedList list = new o_Ques_linkedList();
        // LinkedList<String> list = new LinkedList<>();

        list.addLast("0");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printNode();

        list.head = list.removeNfromEnd(list.head, 2);
        list.printNode();

        list.head = list.removeNfromEnd(list.head, 4);
        list.printNode();

    } */


//2  Check if a Linked List is a Palindrome

/*
    ListNode head;

    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode middle = findMiddle(head);  // 1st half ka end

        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;

        while (secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;     
    }

    public void add(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public static void main(String[] args) {
        
        o_Ques_linkedList list = new o_Ques_linkedList();
    
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("1");

        boolean result = list.isPalindrome(list.head);
        System.out.println(result);

    } */


//3  Detect a Cycle in a Linked List + Trick to Remove the Cycle

    ListNode head;

    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head){
        if (head == null) {
            return false;
        }

        ListNode hare = head;  // fast
        ListNode turtle = head; // slow

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }

        return false;
    }


    // Method to remove the cycle from the linked list, if it exists
    public void removeCycle(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode hare = head; // fast pointer
        ListNode turtle = head; // slow pointer
        boolean cycleDetected = false;

        // Detect cycle
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                cycleDetected = true;
                break;
            }
        }

        // If cycle is detected, remove it
        if (cycleDetected) {
            turtle = head; // Move slow pointer back to the start

            // If the cycle starts from the head
            if (hare == head) {
                while (hare.next != head) {
                    hare = hare.next;
                }
                hare.next = null; // Remove the cycle
                return;
            }

            // Find the start of the cycle
            while (turtle.next != hare.next) {
                turtle = turtle.next;
                hare = hare.next;
            }

            hare.next = null; // Remove the cycle
        }
    }


    // Helper method to add a node to the linked list
    public void addNode(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        
        o_Ques_linkedList list = new o_Ques_linkedList();

        list.addNode("A");
        list.addNode("B");
        list.addNode("C");
        list.addNode("D");

        // Creating a cycle for testing
        list.head.next.next.next.next = list.head.next; // D -> B

        // Detect cycle
        System.out.println("Cycle detected: " + list.hasCycle(list.head));

        // Remove cycle
        list.removeCycle(list.head);

        // Detect cycle after removal
        System.out.println("Cycle detected after removal: " + list.hasCycle(list.head));
    }
    


}

