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
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty()){
            ListNode newNode = new ListNode(stack.pop());
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }
}