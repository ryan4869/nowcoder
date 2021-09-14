package class04;
/*
打印两个有序链表的公共部分
【题目】给定两个有序链表的头指针head1和head2，打印两个链表的公共部分
【要求】如果两个链表的长度之和为N，时间复杂度要求O(N)，额外空间复杂度要求为O(1)
 */
public class Code06 {



    public static class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public static void getUnion(Node head1, Node head2){
        Node cur1 = head1;
        Node cur2 = head2;
        while (cur1!=null && cur2!=null){
            if (cur1.value == cur2.value){
                System.out.println(cur1.value);
                cur1 = cur1.next;
                cur2 = cur2.next;
            }else if (cur1.value < cur2.value){
                cur1 = cur1.next;
            }else {
                cur2 = cur2.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(6);

        Node head2 = new Node(2);
        head2.next = new Node(6);
        getUnion(head1,head2);
    }

}
