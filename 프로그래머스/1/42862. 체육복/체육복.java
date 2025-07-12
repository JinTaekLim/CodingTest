import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);    
        Arrays.sort(reserve);
        
        int answer = n - lost.length;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : reserve) {
            map.put(i, true);
        }

        List<Integer> newLost = new ArrayList<>();
        for (int i : lost) {
            if (map.getOrDefault(i, false)) {
                map.put(i, false);
                answer++;
            } else {
                newLost.add(i);   
            }
        }

        for (int i : newLost) {
            int a = i - 1;
            int b = i + 1;

            if (map.getOrDefault(a, false)) {
                map.put(a, false);
                answer++;
            } else if (map.getOrDefault(b, false)) {
                map.put(b, false);
                answer++;
            }
        }

        return answer;
    }
}
