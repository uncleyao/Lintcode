/*
Check if two binary trees are identical. Identical means the two binary trees have the same structure and every identical position has the same value.

Example
Example 1:

Input:{1,2,2,4},{1,2,2,4}
Output:true
Explanation:
        1                   1
       / \                 / \
      2   2   and         2   2
     /                   /
    4                   4

are identical.
Example 2:

Input:{1,2,3,4},{1,2,3,#,4}
Output:false
Explanation:

        1                  1
       / \                / \
      2   3   and        2   3
     /                        \
    4                          4

are not identical.
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if (a==null && b==null){
            return true;
        } else if (a==null || b== null) {
            return false;
        } 
        
        if (a.val != b.val){
            return false;
        }
        
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}