/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse=null;
        ListNode list=head;
        Stack<Integer>stack= new Stack<>();
        while(list!=null){
            stack.add(list.val);
            list=list.next;
        }
            while(!stack.isEmpty()){
                reverse=addtoEnd(reverse, stack.pop());
            }
        

        return reverse;
    }

    public ListNode addtoEnd(ListNode list, int val){
        ListNode current=list;
        if(list==null){
            return new ListNode(val);
        }

        while(current.next!=null){
            current=current.next;
        }

        current.next=new ListNode(val);
        return list;
    }
}