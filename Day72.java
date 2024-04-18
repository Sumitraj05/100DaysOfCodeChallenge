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

 // recursively

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         if(list1!=null && list2!=null){
//         if(list1.val<list2.val){
//             list1.next=mergeTwoLists(list1.next,list2);
//             return list1;
//             }
//             else{
//                 list2.next=mergeTwoLists(list1,list2.next);
//                 return list2;
//         }
//         }
//         if(list1==null)
//             return list2;
//         return list1;
//     }
// }

// By using extra Space

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp1 = list1;
//         ListNode temp2 = list2;
//         ListNode head = new ListNode(100);
//         ListNode temp = head;
//         while(temp1!=null && temp2!=null){
//             if(temp1.val<temp2.val){
//                 ListNode a = new ListNode(temp1.val);
//                 temp.next = a;
//                 temp = a;
//                 temp1 = temp1.next;
//                 }
//             else{
//                 ListNode a = new ListNode(temp2.val);
//                 temp.next = a;
//                 temp = a;
//                 temp2 = temp2.next;
//             }
//         }
//         if(temp1==null){
//             temp.next = temp2;
//         }
//         else{
//             temp.next = temp1;
//         }
//         return head.next;
//     }
// }

//  Without using Extra Space

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;

                }
            else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next;
    }
}
