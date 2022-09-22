package 数据结构;

/*
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。在链表类中实现这些功能：get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
/*
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 * linkedList.get(1);            //返回2
 * linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 * linkedList.get(1);            //返回3
 */
class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    Node head=new Node(0);
    int size=1;
    public MyLinkedList() {
        
    }
     
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        else{
            Node trans_1=this.head;
            for (int i = 0; i <= index; i++) {
                trans_1=trans_1.next;
            }
            return trans_1.val;
        }
    }
     
    public void addAtHead(int val) {
        Node new_node=new Node(val);
        new_node.next=this.head;
        this.head=new_node;
        size++;
    }
     
    public void addAtTail(int val) {
        if(size==0){
            this.head=new Node(val);
            head.next=null;
            size++;
        }
        else{
            Node new_node2=new Node(val);
            new_node2.next=null;
            Node trans_2=this.head;
            while(trans_2.next!=null){
                trans_2=trans_2.next;
            }
            trans_2.next=new_node2;
            size++;
        }
    }
     
    public void addAtIndex(int index, int val) {
        Node new_node3=new Node(val);
        if(index<=0){
            new_node3.next=this.head;
            new_node3=this.head;
            size++;
        }
        else if(index>0&&index<=size){
            Node trans_3=this.head;
            for (int i = 0; i < index-1; i++) {
                trans_3=trans_3.next;
            }
            new_node3.next=trans_3.next;
            trans_3.next=new_node3;
            size++;
        }
    }
     
    public void deleteAtIndex(int index) {
        if(size==1){
            this.head=null;
            size--;
        }
        else{
            if(index>=0&&index<=size){
                Node trans_4=this.head;
                for (int i = 0; i < index-1; i++) {
                    trans_4=trans_4.next;
                }
                trans_4.next=trans_4.next.next;
                size--;
            }
        }
    }
 }
 
 /*
  !Your MyLinkedList object will be instantiated and called as such:
  * MyLinkedList obj = new MyLinkedList();
  * int param_1 = obj.get(index);
  * obj.addAtHead(val);
  * obj.addAtTail(val);
  * obj.addAtIndex(index,val);
  * obj.deleteAtIndex(index);
  */