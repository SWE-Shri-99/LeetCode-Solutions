class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indices = new ArrayList<>();

        String word = "";

        for(int i = 0; i < words.length; i++)
        {
            word = words[i];

            for(int j = 0; j < word.length(); j++)
            {
                if(word.charAt(j) == x)
                {
                   indices.add(i);
                   break;
                }
            }
        }

        return indices;
        
    }
}
