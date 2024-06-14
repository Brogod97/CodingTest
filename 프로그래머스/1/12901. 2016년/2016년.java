import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public String solution(int a, int b) {
        DayOfWeek date = LocalDate.of(2016, a, b).getDayOfWeek();
        return date.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}