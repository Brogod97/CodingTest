class Solution {
    public int solution(String binomial) {

        String[] Arr = binomial.split(" ");
        int a = Integer.parseInt(Arr[0]);
        int b = Integer.parseInt(Arr[2]);
        
        return switch(Arr[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}