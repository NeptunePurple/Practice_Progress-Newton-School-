/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
    
    if(head.next==null)
    {
        return head;
    }

    Node temp = null;
    Node temp2 = head.next;

    while(temp2.next!=null)
    {
        head.next = temp;
        temp = head;
        head = temp2;
        temp2 = temp2.next;
    }
    head.next = temp;
    temp2.next = head ;

    return temp2;
		// return the head of the modified linked list
    }
