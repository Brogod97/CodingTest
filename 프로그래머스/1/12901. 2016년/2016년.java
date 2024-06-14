import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public String solution(int a, int b) {
        DayOfWeek date = LocalDate.of(2016, a, b).getDayOfWeek();
        return date.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}

// 다른 풀이
String answer = "";
String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
int allDate = 0;
for (int i = 0; i < a - 1; i++) {
    allDate += date[i];
}
allDate += (b - 1);
answer = day[allDate % 7];

return answer;

// 다른 풀이
Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
                .setDate(2016, month - 1, day).build();
return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();

// 다른 풀이
return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
