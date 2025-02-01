import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder(); 
        
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        
        for(int i=0; i<X.length(); i++) {    
            xCnt[X.charAt(i) - '0'] ++;
        }
        for(int i=0; i<Y.length(); i++) {
            yCnt[Y.charAt(i) - '0'] ++;
        }
        
        for(int i = 9; i >= 0; i--) {
            int commonCount = Math.min(xCnt[i], yCnt[i]);
            for(int j = 0; j < commonCount; j++) {
                answer.append(i);
            }
        }
        
        if(answer.length() == 0) return "-1";
        if (answer.charAt(0) == '0') return "0";
        return answer.toString();
    }
}