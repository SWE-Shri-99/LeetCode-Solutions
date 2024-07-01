class Solution {
    public String firstPalindrome(String[] words) {

        String word = "";
        int flag = 1;

        for(int i = 0; i < words.length; i++)
        {
            word = words[i];
            
            flag = 1;

            for(int j = 0; j < word.length() / 2; j++)
            {
                if(word.charAt(j) != word.charAt(word.length() - 1 - j))
                {
                   flag = 0;
                   break;
                }
            }

            if(flag == 1)
               return word;
        }

        return "";
        
    }
}
