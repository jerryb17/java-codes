import java.util.*;
public class Linklist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
            return;
        }
        //new node --> head (address of previous 1st node) coz head contain address of 1st node
        newNode.next = head;
        //head--> new node
        head= newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null){
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if (head == null){
            System.out.println(" ll is empty ");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void addMiddle(int idx , int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            // next -> next ref of node
            next = curr.next;
            // curr node-->prev (refer node of prev node) 2--->1
            curr.next = prev;
            // curr becomes prev node
            prev = curr;
            // next node becomes curr node
            curr = next;
        }
        // after null.. last value of node becomes head
        head = prev;
    }
    public void deletenTHNode(int n){
        int size= 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        if (n == size){
            head = head.next; // if nth term is head then it remove 1st node
            return;
        }
        // if size-n = val (prev node of nth node )
        int i = 1;
        int prevToFind = size-n;
        Node prev = head;
        while (i<prevToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }
    public Node findMID(Node head){ // healder
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid value
    }
    public boolean isLLpalindrome(){
        if (head == null && head.next == null){
            return true;
        }
        // find mid
        Node midNode = findMID(head);
        // reverse LL
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left =head;
        // check palindrome
        while (right !=null){
            if (left.data!= right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String[] args){
        Linklist list = new Linklist();

        list.addFirst(2);

        list.addFirst(1);

        list.addLast(2);

        list.addLast(1);


        list.print();
        System.out.print(list.isLLpalindrome());



    }
}
