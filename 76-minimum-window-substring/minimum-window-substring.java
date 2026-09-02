class Solution {
    public String minWindow(String s, String t) {
        int[] have = new int[256];
        int[] need = new int[256];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int minlen = Integer.MAX_VALUE;
        int low = 0,startindex=-1;

        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;
            while (isvalid(have, need)) {
                int curlen = high - low + 1;
                if (curlen < minlen) {
                    minlen = curlen;
                    startindex=low;

                }
                have[s.charAt(low)]--;
                low++;
            }

        }
    return startindex==-1? "":s.substring(startindex,minlen+startindex);
    }

    private boolean isvalid(int[] have, int[] need) {

        for (int i = 0; i < 256; i++) {
            if (have[i] < need[i]) {
                return false;

            }
        }
        return true;
    }
}