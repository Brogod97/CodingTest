class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();

		for (int i = 0; i < t.length() - len + 1; i++) {
			long diff = Long.parseLong(t.substring(i, i + len));
            
            if (diff <= Long.parseLong(p)) {
                answer++;
            }
		}
		return answer;
    }
}

// 다른 풀이
long targetNumber = Long.parseLong(p);
int targetNumberLength = p.length();

return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
			.mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
			.mapToLong(Long::parseLong)
			.filter(number -> number <= targetNumber)
			.count();
