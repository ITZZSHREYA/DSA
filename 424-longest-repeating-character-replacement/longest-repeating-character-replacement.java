class Solution {
    public int find(int[] freq)
    {
        int maxcount=0;
        for(int i=0;i<freq.length;i++)
        {
            maxcount=Math.max(maxcount,freq[i]);

        }
        return maxcount;
    }
    public int characterReplacement(String s, int k) 
    {
        int low=0,res=0;
        int[] freq=new int[256];
        for(int high=0;high<s.length();high++)
        {
            freq[s.charAt(high)]++;
            int max=find(freq);
            int len=high-low+1;
            int diff=len-max;
            while(diff>k)
            {
                freq[s.charAt(low)]--;
                low++;

                max=find(freq);
                len=high-low+1;
                diff=len-max;

            }
            len=high-low+1;
            res=Math.max(res,len);
        }
    return res;
    }
}