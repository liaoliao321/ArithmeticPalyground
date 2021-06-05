package LeetCode._206;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
//        存放排序好的节点
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
//            下一段待排序的节点
            ListNode nextFragment = curr.next;
//            迭代更新
            curr.next = prev;
            prev = curr;
//            排序下一段
            curr = nextFragment;
        }
        return prev;
    }
}
