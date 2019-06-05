public class Solution {
    public ListNode FindKthToTail(ListNode list,int k) {
if (list == null)   return list;
 
        ListNode node = list;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;
 
        ListNode p = list;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }
         
        return p;
    }
}
