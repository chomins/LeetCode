/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ArrayList<ListNode> list = new ArrayList();
        if(head==null){
            return null;
        }
        while(head.next != null){
            list.add(head);
            head = head.next;
            
            for(int i=0; i<list.size(); i++){
                if(head == list.get(i)){
                    return list.get(i);
                }
            }
        }
        return null;
    }
}