class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            left.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String right = left.reverse().toString();
        return left.reverse().append("0").append(right).toString();
    }
}
