class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0,sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]<10)
            {
                sum+=nums[i];
            }
            else
            {
                sum2+=nums[i];

            }
        }
        System.out.println(sum);
         System.out.println(sum2);

        if(sum<sum2)
        {
            return true;
        }
        else if(sum2<sum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}