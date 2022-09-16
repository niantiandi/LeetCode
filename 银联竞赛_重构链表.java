public class 银联竞赛_重构链表{
    public static void main(String[] args) {
        ListNode head=new ListNode(6);
        head.next=new ListNode(5);
        System.out.println(reContruct(head).val);
    }
    public static ListNode reContruct(ListNode head) {
        // if(head==null)
        // return null;
        // ListNode p1,p2;
        // p2=head;
        // p1=head.next;
        // while(p1!=null){
        //     if(p2.val%2==0){
        //         p2=p2.next;
        //         p1=p1.next;
        //     }
        //     else
        //     p2=p2.next;
        //     p1=p1.next
        // }

        if (head == null) return null;
        else
        {
        ListNode p,q;
        while (head.val%2==0) {
            q=head;
            head = head.next;
        }
        p = head;
        while (p.next!=null) {
            if (p.next.val % 2 == 0) {
                p.next = p.next.next;
            }
            else p = p.next;
        }
        return head;
        }
    }
}
class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
}

