import java.util.*;

class Solution {
    
    int cost = 200;
    Integer maxAlp = 0;
    Integer maxCop = 0;
    int minAlp = 150;
    int minCop = 150;
    int[][] memo;
    
    public int solution(int alp, int cop, int[][] problems) {
        
        
        for(int[] i : problems) {
            maxAlp = Math.max(maxAlp, i[0]);
            maxCop = Math.max(maxCop, i[1]);
        }
                
        cost = Math.max(0, maxAlp - alp) + Math.max(0, maxCop - cop);
        
        memo = new int[maxAlp + 2][maxCop + 2];
        for (int[] row : memo) Arrays.fill(row, Integer.MAX_VALUE);
        
        repeat(alp, cop, problems, 0);
        return cost;
    }
    
    public void repeat(int alp, int cop, int[][] problems, int curruntCost) {
        
        alp = Math.min(alp, maxAlp + 1);
        cop = Math.min(cop, maxCop + 1);
        
        // 기존의 Cost 보다 현재 Cost 가 더 크면 종료
        if(curruntCost >= cost) return;
        
        // 동일한 alp, cop 를 더 적은 비용으로 온 경우 종료
        if (memo[alp][cop] <= curruntCost) return;
        memo[alp][cop] = curruntCost;

        
        // 모든 문제를 풀 수 있으면 갱신 후 종료
        if (alp >= maxAlp && cop >= maxCop) {
            cost = Math.min(cost, curruntCost);
            minAlp = Math.min(alp, minAlp);
            minCop = Math.min(cop, minCop);
            return;
        }
        
        // 풀 수 있는 문제를 풀었을 때의 분기 나눔
        for (int[] i : problems) {
            int reqAlp = i[0];
            int reqCop = i[1];
            
            if (alp >= reqAlp && cop >= reqCop) {
                int addAlp = alp + i[2];
                int addCop = cop + i[3];
                int addCost = curruntCost + i[4];
            
                repeat(addAlp, addCop, problems, addCost);
            }
        }
        
                
        // 5. 개인 공부를 했을때 분기 나눔
        if (minAlp > alp) repeat(alp + 1, cop, problems, curruntCost + 1);
        if (minCop > cop) repeat(alp, cop + 1, problems, curruntCost + 1);
    }
}