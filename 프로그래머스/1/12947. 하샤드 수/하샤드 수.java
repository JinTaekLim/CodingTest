class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String num = String.valueOf(x);
        int length = num.length();
        
        int add = 0;
        for (int i=0; i<length; i++) {
            add += num.charAt(i) - '0';
        } 
        
        if(x%add != 0) answer = false;

        return answer;
    }
}