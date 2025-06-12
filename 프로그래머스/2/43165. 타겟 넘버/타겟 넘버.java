class Solution {
    
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    public void dfs(int[] numbers, int target, int index, int result) {
        if(numbers.length == index) {
            if(target == result) count ++;
            return;
        }
        
        
        // 다음 인덱스
        int nextIndex = index + 1;
        
        // 덧셈
        dfs(numbers, target, nextIndex, result + numbers[index]);
        // 뺄셈
        dfs(numbers, target, nextIndex, result - numbers[index]);
        
    }
}