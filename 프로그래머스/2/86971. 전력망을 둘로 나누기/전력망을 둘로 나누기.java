import java.util.*;

class Solution {
  public int solution(int n, int[][] wires) {

    Integer maxCount = null;

    for (int i = 0; i < wires.length; i++) {
      int[][] newWires = removeIndex(i, wires);
      int start = wires[i][0];
      int result = dfs(start, n, newWires);



      int 결과 = Math.abs(result - (n-result));
      System.out.printf("왼쪽 = %d | 오른쪽 %d | 왼쪽 - 오른쪽 = %d%n", result, n- result, 결과);

      if (maxCount == null) maxCount = 결과;
      else if (maxCount > 결과) maxCount = 결과;
    }

    return maxCount;
  }

  public int[][] removeIndex(int removeIndex, int[][] wires) {
    return Arrays.stream(wires)
        .filter(w -> !Arrays.equals(w, wires[removeIndex]))
        .toArray(int[][]::new);
  }

  public int dfs(int num, int n, int[][] wires) {

    // 방문 여부 확인을 위한 리스트 생성
    Set<Integer> index = new HashSet<>(n + 1);
    index.add(num);

    // 첫 번째
    while (true) {

      int size = index.size();

      for (int[] wire : wires) {
        int a = wire[0];
        int b = wire[1];


        if (index.contains(a)) index.add(b);
        if (index.contains(b)) index.add(a);
      }

      if (size == index.size()) { break; }

    }

    return index.size();
  }

}