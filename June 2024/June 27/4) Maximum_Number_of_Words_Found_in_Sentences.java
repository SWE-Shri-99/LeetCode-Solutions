class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for(int i = 0; i < sentences.length; i++)
        {
            String sArr[] = sentences[i].split(" ");

            if(sArr.length > max)
               max = sArr.length;
        }

        return max;
        
    }
}
