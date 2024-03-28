class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(String str : rsp.split("")) {
            switch(str) {
                case "0" -> answer += "5";
                case "2" -> answer += "0";
                case "5" -> answer += "2";
            }
        }
        
        return answer;
    }
}

// 다른 풀이
return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());

// 다른 풀이
Map<String, String> winNumbers = new HashMap<>();
winNumbers.put("2", "0");
winNumbers.put("0", "5");
winNumbers.put("5", "2");

StringBuilder answer = new StringBuilder();

for (int i = 0; i < rsp.length(); i++) {
    answer.append(winNumbers.get(rsp.substring(i, i+1)));
}

return answer.toString();
