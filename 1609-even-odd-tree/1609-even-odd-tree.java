
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
            for(int i = 0; i<n; i++){
                TreeNode temp = q.remove();
                int num = temp.val;
                if(flag){
                    if(num%2 != 1 || prev >= num) return false;
                }
                else{
                    if(num%2 != 0 || prev <= num) return false;
                }
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                prev = num;
            }
            flag = !flag;
        }
        return true;
    }
}


// Method 1 
//  class Pair{
//     TreeNode node;
//     int level;
//     Pair(TreeNode node, int level){
//         this.node = node;
//         this.level = level;
//     }
//  }
// public boolean isEvenOddTree(TreeNode root) {
//         Queue<Pair> q = new LinkedList<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         q.add(new Pair(root,0));
//         boolean flag = (root.val%2==1) ? true : false;
//         if(!flag) return false; 
//         while(q.size()>0){
//             int n = q.size();
//             List<Integer> arr = new ArrayList<>();
//             while(n>0){
//                 Pair temp = q.remove();
//                 TreeNode t = temp.node;
//                 int level = temp.level;
//                 arr.add(t.val);
//                 if(t.left != null) q.add(new Pair(t.left,level+1));
//                 if(t.right != null) q.add(new Pair(t.right, level+1));
//                 n--;
//             }
//             ans.add(arr);
//         }
//         for(int i = 1; i<ans.size(); i++){
//             if(check(ans.get(i), i)) continue;
//             else{
//                 flag = false; break;
//             }
//         }
//         return flag;
//     }
//     public boolean check(List<Integer> arr, int level){
//         boolean flag = true;
//            int prev = arr.get(0);
           
//            if(level%2==0){
//              if(prev%2 != 1) return false;
//            }
//            else{
//              if(prev%2 != 0) return false;
//            }

//            for(int i = 1; i<arr.size(); i++){
//               int num = arr.get(i);
//                if(level%2==0){
//                     if(num%2 != 1 || prev >= num) flag = false;
//                }
//                else{
//                   if(num%2 != 0 || prev <= num) flag = false;
//                }
//                prev = num;
//            }
//            return flag;
//    }


    