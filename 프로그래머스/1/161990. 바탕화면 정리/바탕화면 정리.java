import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        List<Integer> lux = new ArrayList<>();
        List<Integer> luy = new ArrayList<>();
        List<Integer> rdx = new ArrayList<>();
        List<Integer> rdy = new ArrayList<>();
        
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[i].length(); j++) {
                if (Character.toString(wallpaper[i].charAt(j)).equals("#")) {
                    lux.add(i);
                    rdx.add(i+1);
                    luy.add(j);
                    rdy.add(j+1);
                    
                }
            }
        }
        
        answer[0] = Collections.min(lux);
        answer[1] = Collections.min(luy);
        answer[2] = Collections.max(rdx);
        answer[3] = Collections.max(rdy);

        return answer;
    }
}