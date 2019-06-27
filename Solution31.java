import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         
         ArrayList arraylist=new ArrayList();
         Array     array=new Array();
         int i=0;
         while(listNode!=null)
         {
              array[i]=listNode.val
              
              listNode=listNode.next;
              i++;
         }
          
        for(int ii=0;ii<array.length;ii++)
        {
            arraylist.add(array[array.length-i]);
        }
        return arraylist;
    }
}
