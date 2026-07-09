/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
       ArrayList<Integer> ans = new ArrayList<>();
       ans.add(root.data);
       if(root.left==null && root.right==null) return ans;
       leftBoundary(root.left,ans);
       leafNode(root,ans);
       rightBoundary(root.right,ans);
        return ans;
    }
    public void leftBoundary(Node root, ArrayList<Integer> ans){
      while(root!=null){
          if(root.left==null && root.right==null) break;
          ans.add(root.data);
          if(root.left != null) root = root.left;
          else root = root.right;
      }
      
    }
    // public void leftBoundary(Node root, ArrayList<Integer> ans){
    //   if(root==null) return;
    //   if(root.left==null && root.right==null) return;
    //   ans.add(root.data);
    //   if(root.left != null) leftBoundary(root.left,ans);
    //   else if(root.right != null) leftBoundary(root.right,ans);
      
    // }
    
    public void leafNode(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        leafNode(root.left,ans);
        leafNode(root.right,ans);
    }
    public void rightBoundary(Node root, ArrayList<Integer> ans){
        ArrayList<Integer> ans2 = new ArrayList<>();
           while(root!=null){
          if(root.left==null && root.right==null) break;
          ans2.add(root.data);
          if(root.right != null) root = root.right;
          else root = root.left;
          
        }
        Collections.reverse(ans2);
        for(int ele : ans2){
            ans.add(ele);
        }
    }
    //  public void rightBoundary(Node root, ArrayList<Integer> ans){
    //   if(root==null) return;
    //   if(root.left==null && root.right==null) return;
    //   if(root.right != null) rightBoundary(root.right,ans);
    //   else  rightBoundary(root.left,ans);
    //   ans.add(root.data);
      
    // }
}
