class Solution {
    public int solution(int num, int k) {
        int idx = 0;
        
        for(String str : ("" + num).split("")){
            idx++; 
            if(Integer.parseInt(str) == k) {
                return idx;
            }            
        }
        
        return -1;
    }
}

// 다른 풀이
return ("-" + num).indexOf(String.valueOf(k));
// "-" + num : "-"는 인덱스를 1부터 카운트하게 만들기 위함 ("-" 자체는 큰 의미가 없음, 부호 X)
// String.indexOf(String str) : 문자열(String)이나 배열(Array)에서 지정된 요소가 처음으로 나타나는 인덱스를 반환 (없으면 -1)

// 다른 풀이
String numStr = String.valueOf(num);
String kStr = String.valueOf(k);

int answer = numStr.indexOf(kStr);
return answer < 0 ? -1 : answer + 1 ;
