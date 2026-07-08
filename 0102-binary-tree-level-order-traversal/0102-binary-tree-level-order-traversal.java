class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return ans;
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            List<Integer> t = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode curr =  q.remove();
                t.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            ans.add(t);
        }
        return ans;
    }
}

//Method 1
// class Pair {
//     TreeNode node;
//     int level;
//     Pair(TreeNode node, int level) {
//         this.node = node;
//         this.level = level;
//     }
// }
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Queue<Pair> q = new LinkedList<>();
//         if (root == null) return ans;
//         q.add(new Pair(root, 0));
//         while (q.size() > 0) {
//             int n = q.size();
//             List<Integer> t = new ArrayList<>(); 
//             while(n > 0){
//                 Pair front = q.remove();
//                 TreeNode node = front.node;
//                 int level = front.level;
//                   t.add(node.val);
//                   if(node.left != null) q.add(new Pair(node.left, level + 1));
//                   if(node.right != null) q.add(new Pair(node.right, level + 1));
//                   n--; 
//             }
//             ans.add(t);
//         }
//         return ans;
//     }
// }
