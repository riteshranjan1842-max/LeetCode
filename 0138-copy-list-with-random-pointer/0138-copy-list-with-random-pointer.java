class Solution {
    public Node copyRandomList(Node head1) {
        // Step 1: Creating Deep Copy without Random
        Node head2 = deepCopy(head1);
        // Step[ 2: Alternative Connect both LL
        merge(head1, head2);
        // Step 3 : Assingning a Random Pointer
        randomConnection(head1,head2);

        //Step 4: Spiltting the combine list
        split(head1);
        
        return head2;
    }
    public void split(Node head1){
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-1);
        Node temp2 = dummy2;
        Node temp = head1;   // merge list pe traverse
        while(temp != null){
            temp1.next = temp;
            temp1 = temp1.next;
            temp = temp.next;

            temp2.next = temp;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp1.next = null;
        head1 = dummy2.next;

    }
    public void randomConnection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;

            temp1 = temp1.next.next;
            if(temp2.next != null) temp2 = temp2.next.next;
        }
    }
    public void merge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2 != null){
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;

            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        head1 = dummy.next;
    }
    public Node deepCopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);
         Node temp2 = head2;
         while(temp1 != null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
         }
         return head2.next;
    }
}