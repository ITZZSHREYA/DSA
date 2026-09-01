class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n=nums.length;
        int sum=0,low=0,ans=Integer.MAX_VALUE;
        for(int high=0;high<n;high++)
        {
            sum+=nums[high];
            while(sum>=target)
            {
                int len=high-low+1;
                ans=Math.min(ans,len);
                sum-=nums[low];
                low++;

            }
        }

    return ans==Integer.MAX_VALUE?0:ans;
        
        
    }
}