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

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
        Node traveler = head;
        Node traverse = head;
        int len = 1;

        if(traveler.next==null)
        {
            head.val=-1;
            return head;
        }

        if(traveler.next.next==null)
        {
            traverse = traverse.next;
            traverse = null;
            head.next = null;
            return head;
        }



        while(traveler.next!=null)
        {
            traveler = traveler.next;
            len++;
        }
        //System.out.println("len = "+len);
        int middle=0;

        if(len%2==0)
        {
            middle = (len/2) +1;
        }
        else
        {
            middle = (len+1)/2;
        }

        //System.out.println("middle = "+middle);

        while(middle>1)
        {
            traverse = traverse.next;
            middle--;
        }
        //System.out.println("traverse = "+traverse.val);

        if(traverse.next.next==null)
        {
            traverse.val = traverse.next.val;
            traverse.next=null;
            //System.out.println("if loop");
            return head;
        }
        else
        {
            traverse.val = traverse.next.val;
            traverse.next=traverse.next.next;
            return head;
        }



    }
