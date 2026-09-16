class Solution {
    public int sqr(int no)
        {

            int sum=0;
            while(no>0)
            {
                int d=no%10;
                no=no/10;
                sum=sum+d*d;

            }
            return sum;
            
        }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        
        while(slow!=1)
        {
            slow=sqr(slow);
            fast=sqr(fast);
            fast=sqr(fast);
            if(slow==fast && fast!=1)
            {
                return false;
            }
            
        }
        fast=1;
    return true; 
    }
}