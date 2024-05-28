class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        for(String num : Integer.toString(x).split("")) {
            sum += Integer.parseInt(num);
        }
        
        return x % sum == 0 ? true: false; // 애초에 boolean 타입으로 반환됨
    }
}

// 다른 풀이 
int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
return x % sum == 0;
