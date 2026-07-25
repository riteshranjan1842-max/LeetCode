class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n>0){
            int d = n%10;
            if(max<=d){
                max2 = max;
                max = d;
            }
            else if(d<max && d>max2){
                max2 = d;
            }
            n /= 10;
        }
        return max*max2;
    }
}