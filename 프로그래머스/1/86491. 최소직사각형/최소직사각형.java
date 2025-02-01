class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
 
        int max = 0;
        int y = 0;
        
        // 가장 긴 값 선정
        for(int i=0; i<sizes.length; i++) {
            max = Math.max(sizes[i][0], max);
            max = Math.max(sizes[i][1], max);
        }
        
        // Y 값 선정
        for(int i=0; i<sizes.length; i++) {
            // 0,1 모두 Y보다 크면서 max보다 작은 값이 존재하면 Y값을 업데이트
            if (y <= sizes[i][0] && sizes[i][0] <= max && y <= sizes[i][1] && sizes[i][1] <= max) {
                y = Math.min(sizes[i][0], sizes[i][1]);
            }
        }
        answer += max * y;
        return answer;
    }
}