class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arrSize = arr1.length;
        int arrSize2 = arr1[0].length;
        int[][] answer = new int[arrSize][arrSize2];
        
        for(int i=0; i<arrSize; i++) {
            for(int j=0; j<arrSize2; j++) {
                int a = arr1[i][j];
                int b = arr2[i][j];            
                answer[i][j] = a + b;
            }
        }
        return answer;
    }
}