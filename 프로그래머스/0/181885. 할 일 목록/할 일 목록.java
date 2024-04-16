import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        int size = 0;
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer.add(todo_list[i]);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}