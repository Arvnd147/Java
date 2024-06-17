package linkedlist;

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}

public class LinkedListOpr {

    public static int length(Node head){
        int counter = 0;
        //Node temp = head;
        while(head!=null){
            counter++;
            head = head.next;
        }
        return counter;
    }

    public static int middleFinder(Node head, int mid){
        Node temp = head;
        while(mid!=0){
            temp = temp.next;
            mid--;
        }
        return temp.value;
    }

    public static int middleFinder2(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }
    public static void main(String[] args) {
        // int arr[] = new int[20]
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(30);

        int len = LinkedListOpr.length(head);
        System.out.println(len);

        int mid = len/2;

        System.out.println(middleFinder(head, mid));
        System.out.println(middleFinder2(head));
    }
}
// tc- O(n) n is the number of nodes

// find middle element: 
/*
 approach-1 : 
 find length, len/2, find len/2 th element 

 approach-2 : using fast&slow pointer
(more efficient)
-> both will be at head init
-> slow is as usual pointer -> one step at a time
-> fast = fast.next.next -> two step at a time
=> when fast reaches the end, slow will exactly be at the middle.
 */

 /* Cycle Detection - anomaly
    if slow == fast -> do dry run and see
  */

/* Reversing a linkedList 
 * 10->20->30->null
 * |
 * 30->20->10->null
 * 
 * most efficient: using 3 pointers
 * 1. prev
 * 2. curr
 * 3. post
 * 
 * init all 3 at head
 * 
 * post = post.next
 * curr.next = prev
 * prev  = curr
 * curr  = post
 * 
 * condition to be checked:
 * curr != null
 * 
 * at last head = prev
*/

/*
 * 1. fast/slow 
 * 2. find middle element
 * 3. find cycle existence
 * 4. reversing a linked list
 * 5. 3 pointers approch
 */