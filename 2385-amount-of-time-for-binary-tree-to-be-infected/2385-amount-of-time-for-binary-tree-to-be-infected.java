class Pair{
    TreeNode node;
    int level = 0;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    static TreeNode start;
    HashMap<TreeNode, TreeNode> parent;
    public int amountOfTime(TreeNode root, int target) {
         parent = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burned = new HashSet<>();
        dfs(root, target);
        q.add(new Pair(start, 0));
        burned.add(start);
        int time  = 0;
        while(q.size()>0){
              Pair front = q.poll();
              int level = front.level;
              TreeNode node = front.node;
              time = Math.max(time, level);
              if(node.left != null && !burned.contains(node.left)){
                  q.add(new Pair(node.left, level+1));
                  burned.add(node.left);
              }
             if(node.right != null && !burned.contains(node.right)){
                q.add(new Pair(node.right, level+1));
                burned.add(node.right);
             }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node), level+1));
                burned.add(parent.get(node));
            }
        }
        return time;
    }
    public void dfs(TreeNode root,  int target){
        if(root== null) return;
        if(root.val==target) start  = root;
        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);
        dfs(root.left, target);
        dfs(root.right, target);
    }
}