import java.util.Arrays;
import java.util.Collections;

class Solution {    
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 내림차순 정렬
        Integer[] scoreObj = Arrays.stream(score)
                                       .boxed()
                                       .toArray(Integer[]::new);
        Arrays.sort(scoreObj, Collections.reverseOrder());
        
        // 계산
        int cnt = score.length / m * m;
        for(int i=0; i<cnt; i+=m) {
            int min = scoreObj[i+m-1];
            answer += min * m;
        }
        
        return answer;
    }
}