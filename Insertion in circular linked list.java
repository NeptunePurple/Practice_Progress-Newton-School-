/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node Insertion(Node head, int K){

    Node object = head;
    Node addinlist = new Node(K);
    while(object.next!=null)
    {
        object = object.next;
        if(object.next==head)
        {
            break;
        }
    }
    object.next = addinlist;
    addinlist.next = head;

    return head;
//Enter your code here      
}
