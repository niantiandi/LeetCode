public class 两数相加 {

    public static void main(String[] args) {
        ListNode_2 l1=new ListNode_2(1);
        ListNode_2 l2=new ListNode_2(2);
        System.out.println(addTwoNumbers(l1,l2));
    }


    public static ListNode_2 addTwoNumbers(ListNode_2 l1, ListNode_2 l2) {
        ListNode_2 result_node=new ListNode_2(0);
        ListNode_2 trans_node=result_node;
        int flag=0;
        while (l1!=null||l2!=null||flag!=0){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;

            int sum=x+y+flag;
            flag=sum/10;
            ListNode_2 trans_2node=new ListNode_2(sum%10);
            trans_node.next=trans_2node;
            trans_node=trans_2node;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return result_node.next;
    }
}
class ListNode_2 {
    int val;
    ListNode_2 next;
    ListNode_2() {}
    ListNode_2(int val) { this.val = val; }
    ListNode_2(int val, ListNode_2 next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode_2{" +
                "val=" + val +
                '}';
    }
}