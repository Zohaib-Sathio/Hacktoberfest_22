package Resubmitted_Problems;


import java.util.LinkedList;
import java.util.List;

public class BT_InOrderTraversal {
    public List<Integer> inorderTraversal(BinaryTreeClass.TreeNode root) {
        List<Integer> list = new LinkedList();

        return helper(root, list);
    }
    public static List<Integer> helper(BinaryTreeClass.TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
        return list;
    }
}
