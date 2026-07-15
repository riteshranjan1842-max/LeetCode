 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
 }
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(new Pair(root,0));
        boolean flag = (root.val%2==1) ? true : false;
        if(!flag) return false; 
        while(q.size()>0){
            int n = q.size();
            List<Integer> arr = new ArrayList<>();
            while(n>0){
                Pair temp = q.remove();
                TreeNode t = temp.node;
                int level = temp.level;
                arr.add(t.val);
                if(t.left != null) q.add(new Pair(t.left,level+1));
                if(t.right != null) q.add(new Pair(t.right, level+1));
                n--;
            }
            ans.add(arr);
        }
        for(int i = 1; i<ans.size(); i++){
            if(check(ans.get(i), i)) continue;
            else{
                flag = false; break;
            }
        }
        return flag;
    }
    public boolean check(List<Integer> arr, int level){
        boolean flag = true;
           int prev = arr.get(0);
           if(level%2==0){
             if(prev%2 != 1) return false;
           }
           else{
             if(prev%2 != 0) return false;
           }
           
           for(int i = 1; i<arr.size(); i++){
              int num = arr.get(i);
               if(level%2==0){
                    if(num%2 != 1 || prev >= num) flag = false;
               }
               else{
                  if(num%2 != 0 || prev <= num) flag = false;
               }
               prev = num;
           }
           return flag;
    }
}


    //     int even = 0;
    //     int odd = 0;
    //     boolean flag = (root.val%2==1) ? true : false;
    //     while(q.size() != 0){
    //         Pair temp = q.remove();
    //         TreeNode t = temp.node;
    //         int level = temp.level;
    //         if(currLevel != level) currLevel = level + 1;
    //         else{
    //             if(currLevel%2==0){
    //                   if(t.val%2 != 1 || odd > t.val){ // matlab ki even
    //                     flag = false; break;
    //                   } 
    //                    odd = t.val;
    //             }
    //             else{
    //                 if(t.val%2 != 0 || even < t.val) { // matlab ki odd 
    //                     flag = false; break;
    //                 }
    //                  even = t.val;
    //             } 
    //         }
    //       even = 0;
    //       odd = 0;
            // if(t.left != null) q.add(new Pair(t.left,level+1));
            // if(t.right != null) q.add(new Pair(t.right, level+1));
    //     }
    //     return flag;  
    // }