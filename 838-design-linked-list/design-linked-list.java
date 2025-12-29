class MyLinkedList {
     class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
     }
     private Node dummy;
     private int size;
    public MyLinkedList() {
        dummy = new Node(0);
        size =0;
    }
    
    public int get(int index) {
        Node curr = dummy.next;
        if(index >= size || index <0){
            return -1;
        }
        for(int i =0;i< index;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index <0 || index > size){
            return ;
        }
        Node prev = dummy;
        for(int i =0; i< index ;i++){
            prev = prev.next;
        }
        Node num = new Node(val);
        num.next = prev.next;
        prev.next = num;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        Node curr = dummy;
        if(index <0 || index >= size){
            return ;
        }
        for(int i =0;i < index;i++){
            curr= curr.next;
        }
       curr.next = curr.next.next;
       size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */