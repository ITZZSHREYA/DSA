class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        int left=0,maxlen=0;
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int right=0;right<n;right++)
        {
            char c=s.charAt(right);
            if(hm.containsKey(c))
            {
                left=Math.max(left,hm.get(c)+1);
            }
            hm.put(c,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
       
    return maxlen; 
    }
}