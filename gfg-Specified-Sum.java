class Solution {
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        sum(root,sum,arr, ans);
        return ans;
        
    }
    public void sum(Node root, int target,ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
      if(root == null) return;
      arr.add(root.key);
      if(root != null){
        if(target==root.key){
            ans.add(new ArrayList<>(arr));
        } 
    }
        sum(root.left,target-root.key, arr, ans);
        sum(root.right,target-root.key, arr, ans); 
        arr.remove(arr.size()-1);
    }
}
