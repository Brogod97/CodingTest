class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for(int i = 0; i < code.length(); i++){
            String str = code.charAt(i) + "";
            
            if(str.equals("1")) {
                mode = !mode;
                continue;
            }
            
            if(mode) {
                if(i % 2 == 1) {
                    ret += str;
                }
            } else {
                if(i % 2 == 0) {
                    ret += str;
                }
            }   
        }
        
        return ret.equals("") ? "EMPTY" : ret;
    }
}

// 다른 풀이
StringBuilder answer = new StringBuilder();
int mode = 0;
for (int i = 0; i < code.length(); i++) {
    char current = code.charAt(i);
    if (current == '1') {
        mode = mode == 0 ? 1 : 0;
        continue;
    }

    if (i % 2 == mode) {
        answer.append(current);
    }
}
return answer.length() == 0 ? "EMPTY" : answer.toString();
