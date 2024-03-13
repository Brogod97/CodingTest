class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String i : s1) {
            for(String j : s2) {
                answer = i.equals(j) ? ++answer : answer;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
Set<String> set = new HashSet<>(Arrays.asList(s1));
return (int)Arrays.stream(s2).filter(set::contains).count();

// 다른 풀이
return (int) Arrays.stream(s1)
                   .map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s))
                   .filter(b -> b)
                   .count();

// 다른 풀이
return (int) Arrays.stream(s1)
                   .filter(s1Element -> Arrays.asList(s2).contains(s1Element))
                   .count();
