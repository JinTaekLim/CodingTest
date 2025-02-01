import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        // 이름 및 닉네임 저장
        for (int i = record.length - 1; i >= 0; i--) {
            String[] words = record[i].split("\\s+");
            if(!map.containsKey(words[1]) && words.length > 2) map.put(words[1], words[2]);
        }
        
        // 출력
        for (String s : record) {
            String[] words = s.split("\\s+");
            String nickname = map.get(words[1]);
            if(words[0].equals("Enter")) {
                answer.add(nickname + "님이 들어왔습니다.");
            }
            if(words[0].equals("Leave")) {
                answer.add(nickname + "님이 나갔습니다.");
            }
        }
        
        return answer.toArray(new String[0]);
    }
}