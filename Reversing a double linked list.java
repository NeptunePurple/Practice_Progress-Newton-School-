/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
    Node rightend = head;
    Node leftend = head;
    int index = 1;
    while(rightend.next!=null)
    {
      rightend = rightend.next;
      index++;
    }
    index = index/2;

    while(index>0)
    {
      int temp = leftend.val;
      leftend.val = rightend.val;
      rightend.val = temp;

      leftend = leftend.next;
      rightend = rightend.prev;
      index--;
    }

    return head;
//complete this function
}
