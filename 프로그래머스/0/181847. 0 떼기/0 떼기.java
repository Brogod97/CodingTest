class Solution {
    public String solution(String n_str) {
        
        for(String str: n_str.split("")){
            if(str.equals("0"))
                n_str = n_str.replaceFirst("0", "");
            else
                return n_str;
        }
        
        return n_str;
    }
}

// 다른 풀이
return ""+Integer.parseInt(n_str);
// parseInt를 사용하면 좌측에 붙은 0은 제거됨
//    - 문자열을 char 단위로 순회하며 *10 하여 자릿수 올림 수행 후 더함
// https://www.inflearn.com/questions/415221/parseint%EA%B0%80-0%EC%9D%84-%EC%A0%9C%EC%99%B8%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0
