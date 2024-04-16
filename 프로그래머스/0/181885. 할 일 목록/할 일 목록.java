import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer.add(todo_list[i]);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}

// 다른 풀이
String str = "";

for(int i=0; i<finished.length; i++){
    str = finished[i]==false ? str+todo_list[i]+"," : str;
}

return str.split(",");

// 다른 풀이
return IntStream.range(0, todoList.length)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
                .filter(AbstractMap.SimpleEntry::getValue)
                .map(AbstractMap.SimpleEntry::getKey)
                .toArray(String[]::new);

// 다른 풀이
IntStream.range(0, finished.length)
         .filter(i -> !finished[i])
         .mapToObj(i -> todo_list[i])
         .toArray(String[]::new);


