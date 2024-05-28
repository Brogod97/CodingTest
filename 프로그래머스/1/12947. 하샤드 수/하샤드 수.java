class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        for(String num : Integer.toString(x).split("")) {
            sum += Integer.valueOf(num);
        }
        
        return x % sum == 0 ? true: false;
    }
}