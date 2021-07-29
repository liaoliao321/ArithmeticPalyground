package LeetCode._102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();

//            为结果分层
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.remove();
                arrayList.add(node.val);

                if (node.left!=null)
                    queue.add(node.left);

                if (node.right!=null)
                    queue.add(node.right);
            }
            list.add(arrayList);
        }
        return list;
    }
}
