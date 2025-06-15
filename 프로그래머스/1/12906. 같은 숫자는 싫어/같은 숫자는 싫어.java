import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) {
            if(stack.isEmpty() || stack.peek() != i) stack.push(i);

        }
        
        int[] answer = new int[stack.size()];
        int stackSize = stack.size();
        for(int i = 0; i < stackSize; i++) {
            answer[stackSize - 1 - i] = stack.pop();
        }
        


        return answer;
    }
}