package linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class LinkedList {

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node create(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(n);
        Node temp = head;
        while(true){
            n = sc.nextInt();
            if(n==-1) break;
            temp.next = new Node(n);
            temp = temp.next;
        }
        sc.close();
        return head;
    }
    public static void main(String[] args) {
        Node head = create();
        display(head);
    }
}
