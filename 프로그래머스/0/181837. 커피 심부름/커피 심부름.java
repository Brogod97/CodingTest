class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String str : order) {
            switch(str) {
                case "iceamericano", "americanoice", "hotamericano", 
                     "americanohot", "americano", "anything" -> answer += 4500;

                case "icecafelatte", "cafelatteice", "hotcafelatte", 
                     "cafelattehot", "cafelatte" -> answer += 5000;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
int answer = 0;
for(String o : order) {
    if(o.contains("cafelatte")) {
        answer += 5000;
    } else {
        answer += 4500;
    }
}
return answer;

// 다른 풀이
int answer = 0;
for (String eachOrder : order) {
    if (eachOrder.contains("americano") || eachOrder.equals("anything"))
        answer += 4500;
    else 
        answer += 5000;
}
return answer;
