class Solution {
    public Node copyRandomList(Node head1) {
        // Step 1: Creating Deep Copy without Random
        Node head2 = deepCopy(head1);
        HashMap<Node, Node> map = new HashMap<>();
        Node temp1 = head1;
        Node temp2 = head2;
        map.put(null, null);
        while(temp1 != null){
            map.put(temp1, temp2);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1 = head1;
        while(temp1 != null){
            temp2 = map.get(temp1);
            temp2.random = map.get(temp1.random);
            temp1 = temp1.next;
        }
        return head2;
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



