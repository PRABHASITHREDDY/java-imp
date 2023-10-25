import java.util.Scanner;

class Node{
    int val;
    Node next = null;
    Node(int val){
        this.val = val;
    }
}
class linkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Linked List : ");
        int n = sc.nextInt();
        Node temp = new Node(0);
        Node head = temp;
        for(int i=0;i<n;i++){
            System.out.print("Enter Value of Node " + (i+1) +" : ");
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        int counter = 1;
        while(head.next !=null){
            System.out.println("value " + counter++ + ": " +head.next.val);
            head = head.next;
        }
        sc.close();

    }
}


