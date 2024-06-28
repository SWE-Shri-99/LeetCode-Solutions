class Solution {
    public int countSeniors(String[] details) {

        int count = 0;
    
        for(String info : details) 
        {
            char ageTens = info.charAt(11);
            char ageOnes = info.charAt(12);
        
            if(ageTens > '6' || (ageTens == '6' && ageOnes > '0'))
                count++;  
        }
    
        return count;

    }
}
