class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(n,0,0,"",list);
        return list;
    }
     private static void generateParenthesis(int n,int left,int right,String str,List<String> res) {
        if(right==n){
            res.add(str); return;
        }
        if(left<n) generateParenthesis(n,left+1,right,str+"(", res);
        if(right<left) generateParenthesis(n,left,right+1,str+")", res);
    }
}