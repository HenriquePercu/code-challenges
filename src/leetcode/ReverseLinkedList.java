package leetcode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {

    public ListNodeReversed reverseList(ListNodeReversed head) {
        if(head == null){
            return null;
        }

        Stack<ListNodeReversed> stack = new Stack<>();
        ListNodeReversed currentNode = head;

        while (currentNode.next != null) {
            stack.push(currentNode);
            currentNode = currentNode.next;
        }
        stack.push(currentNode); // adding last value that does not have next.

        ListNodeReversed currentReversedNode = stack.pop();

        ListNodeReversed responseHead = currentReversedNode;

        while(!stack.empty()){
            var auxNode = stack.pop();
            System.out.println(auxNode.val);
            currentReversedNode.next = auxNode;
            currentReversedNode = auxNode;
        }

        currentReversedNode.next = null;

        return responseHead;
    }

    class ListNodeReversed {
        int val;
        ListNodeReversed next;

        ListNodeReversed() {
        }

        ListNodeReversed(int val) {
            this.val = val;
        }

        ListNodeReversed(int val, ListNodeReversed next) {
            this.val = val;
            this.next = next;
        }
    }

}


