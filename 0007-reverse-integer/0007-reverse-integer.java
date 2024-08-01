class Solution {
    public int reverse(int x) {
        boolean sign =true;
        if(x<0){
            sign=false;
        }
        x=Math.abs(x);
        int rem=0;
        long digit=0;
        while(x>0){
            digit=(digit*10)+(x%10); 
            x=x/10;
            if(digit>Integer.MAX_VALUE||digit<Integer.MIN_VALUE){
                return 0;
            }
        }
        if(!sign)
        return  -1*(int)digit;
        return (int) digit;
    }
}