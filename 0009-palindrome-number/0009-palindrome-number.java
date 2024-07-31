class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,digit=0;int original=x;
        while(x>0){
            rem=x%10;
            digit=(digit*10)+rem;
            x/=10;

        }
         return(digit==original)?true:false;
        
    }
}