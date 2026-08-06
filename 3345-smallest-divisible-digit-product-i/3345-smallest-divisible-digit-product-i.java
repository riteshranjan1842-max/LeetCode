class Solution {
    public int smallestNumber(int n, int t) {
        while(n>0){
            int p = DigitProd(n);
            if(p%t==0) break;
            else n++;
        }
        return n;
    }
    public int DigitProd(int n){
        int p = 1;
        while(n!=0){
            p *= n%10;
            n /= 10;
        }
        return p;
    }
}