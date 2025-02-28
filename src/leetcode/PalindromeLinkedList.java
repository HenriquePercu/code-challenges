package leetcode;

import java.util.Stack;

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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;

        Stack<Integer> s = new Stack<Integer>();
        while(current != null){
            s.push(current.val);
            System.out.println(current.val);

            current = current.next;
        }

        current = head;
        while(current != null){
            int value = s.pop();

            if(value != current.val){
                return false;
            }
            current = current.next;
        }

        return true;
    }
}
