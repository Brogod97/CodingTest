class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        s..toLowerCase();
        for(String str : s.split("")) {
            if(str.equals("p")) {
                p++;
            } else if(str.equals("y")) {
                y++;  
            }
        }

        return p == y ? true : false;
    }
}

// 다른 풀이
s = s.toUpperCase();
return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

// 다른 풀이
s = s.toLowerCase();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) == 'p')
            count++;
        else if (s.charAt(i) == 'y')
            count--;
    }

    if (count == 0)
        return true;
    else
        return false;
}

// 다른 풀이
return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;












