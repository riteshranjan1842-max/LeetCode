class Solution {
    public boolean checkDivisibility(int n) {
        int  p = 1;
           int c = n;
           int s = 0;
        while(c!=0){
            s += c%10;
            p *= c%10;
            c /= 10;
        }
        if(n%(s+p)==0) return true;
        else return false;
    }
    // public int Sum(int n){
    //     int rev = 0;
    //     while(n!=0){
    //         rev += n%10;
    //         n /= 10;
    //     }
    //     if(n<10) return rev;
    //     else return Sum(rev);
    // }
}