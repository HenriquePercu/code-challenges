package leetcode;

import java.util.Stack;

public class RemoveNthFromList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        var currentNode = head;
        Stack<ListNode> stack = new Stack<>();

        stack.push(currentNode);
        System.out.println(currentNode.val);
        while(currentNode.next != null) {
            stack.push(currentNode.next);
            currentNode = currentNode.next;
            System.out.println(currentNode.val);
        }

        if(n == stack.size()){
            return head.next;
        }

        for (int i = 0; i <n;i++) {
            currentNode = stack.pop();
            System.out.println(currentNode.val);
        }

        // switch
        var previous = stack.pop();
        if(n == 1) {
            previous.next = null;
        }else{
            previous.next = currentNode.next;
        }

        return head;
    }

}
