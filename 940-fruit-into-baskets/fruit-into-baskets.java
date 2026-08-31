class Solution {
    public int totalFruit(int[] fruits) 
    {
        int n=fruits.length;
        int left=0,maxlen=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int right=0;right<n;right++)
        {
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            while(mp.size()>2)
            {
                int leftf=fruits[left];
                mp.put(leftf,mp.get(leftf)-1);
                if(mp.get(leftf)==0)
                {
                    mp.remove(leftf);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }

    return maxlen;
    }
}