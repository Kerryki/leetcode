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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode result = null;

        // Traverse both lists and merge them
        while (current1 != null && current2 != null) {
            if (current1.val == current2.val) {
                result = AddToTail(result, current1.val);
                result = AddToTail(result, current1.val);
                current1 = current1.next;
                current2 = current2.next;
            } else if (current1.val < current2.val) {
                result = AddToTail(result, current1.val);
                current1 = current1.next;
            } else {
                result = AddToTail(result, current2.val);
                current2 = current2.next;
            }
        }

        // Handle remaining elements in list1 if list2 is exhausted
        while (current1 != null) {
            result = AddToTail(result, current1.val);
            current1 = current1.next;
        }

        // Handle remaining elements in list2 if list1 is exhausted
        while (current2 != null) {
            result = AddToTail(result, current2.val);
            current2 = current2.next;
        }

        return result;
    }

    public ListNode AddToTail(ListNode list, int val) {
        // If the list is empty, return a new ListNode with the given value
        if (list == null) {
            return new ListNode(val);
        }
        
        // Otherwise, traverse to the last node and add a new node
        ListNode current = list;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val); // Add the new node at the tail
        return list;
    }
}