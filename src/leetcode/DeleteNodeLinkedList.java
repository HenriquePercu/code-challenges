package leetcode;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
public class DeleteNodeLinkedList {

    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node = node.next;
        }
    }


}

class ListNode {
    int val;
    ListNode next;
}