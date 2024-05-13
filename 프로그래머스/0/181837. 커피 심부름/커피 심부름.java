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