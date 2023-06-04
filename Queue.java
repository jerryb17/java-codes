import java.util.*;
public class Queue {
    static class Queues{
        static int arr [];
        static int rear;
        static int size;
        Queues(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean IsEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if (rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear+1;
            arr[rear]= data;
        }
        public static int remove(){
            if (IsEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i=0; i<rear; i++){
                arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public static int peek(){
            if (IsEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.IsEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
