class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a != b && a != c && b != c) {
            answer = a + b + c;
        } else if(a == b && b == c) {
            answer = (a + b + c) * powNum(a, b, c, 2) * powNum(a, b, c, 3);
        } else {
            answer = (a + b + c) * powNum(a, b, c, 2);
        }
        
        return answer;
    }
    
    public int powNum(int a, int b, int c, int power) {
        return (int)(Math.pow(a , power) + Math.pow(b , power) + Math.pow(c , power));
    }
}

// 다른 풀이
public int solution(int a, int b, int c) {
    int answer = 1;

    int count = 1;
    if(a == b || a == c || b == c) {
        count++;
    }

    if(a == b && b == c) {
        count++;
    }

    for(int i = 1; i <= count; i++) {
        answer *= (pow(a,i)+pow(b,i)+pow(c,i));
    }

    return answer;
}

private int pow(int a, int b) {
    if(b == 0) return 1;
    return a * pow(a, b-1);
}

// 다른 풀이
Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());
return (a + b + c) *
        (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
        (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
