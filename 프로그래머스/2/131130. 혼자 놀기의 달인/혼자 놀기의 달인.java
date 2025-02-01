import java.util.Collections;
import java.util.Arrays;


class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int[] cnt = new int[cards.length];
        int idx = 0;
        
        for(int i=0; i<cards.length; i++) {
            
            for(int j=0; j<cards.length; j++) {
                int pos = idx;
                if(cards[idx] == 0) break;
                idx = cards[idx] - 1;
                cards[pos] = 0;
                cnt[i] ++;
            }
            
            for(int j=0; j<cards.length; j++) {
                if(cards[j] != 0) {
                    idx = j;
                    break;
                };
                if(j == cards.length) return 0;
            }
            
        }
        
        Integer[] cntObj = Arrays.stream(cnt)
                          .boxed()
                          .toArray(Integer[]::new);
        
        Arrays.sort(cntObj, Collections.reverseOrder());
        answer = cntObj[0] * cntObj[1];
        return answer;
    }
}