class Solution {
    public int solution(String[] spell, String[] dic) {
        
        boolean result = false;
        
        for(String word : dic) {
            
            boolean status = true;
            
            for(String spe : spell) {
                if(!word.contains(spe)) status = false;
                
            }
            
            if(status) {
                return 1;
            }
        }
        
        return 2;
    }
}