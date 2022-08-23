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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){

    Node ans = new Node(0);

    Node fans = ans;

    while(head1!=null && head2!=null)
    {
        if(head1.val<=head2.val)
        {
            ans.next = head1;
            ans = ans.next;
            head1 = head1.next;
        }
        else
        {
            ans.next = head2;
            ans = ans.next;
            head2 = head2.next;
        }
    }

    while(head1!=null)
    {
        ans.next = head1;
        ans = ans.next;
        head1 = head1.next;
    }

    while(head2!=null)
    {
        ans.next = head2;
        ans = ans.next;
        head2 = head2.next;
    }

    fans = fans.next;
    return fans;
//Enter your code here
}
