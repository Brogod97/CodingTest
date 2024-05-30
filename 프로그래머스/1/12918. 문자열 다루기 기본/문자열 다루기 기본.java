class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(String str : s.split("")) {
            if(!(s.length() == 4 || s.length() == 6)){
                answer = false;
            }
            
            if(!Character.isDigit(str.charAt(0))) {
                answer = false;
            }
        }
        
        return  answer;
    }
}

// 다른 풀이
 if(s.length() == 4 || s.length() == 6){
  try{
      int x = Integer.parseInt(s);
      return true;
  } catch(NumberFormatException e){
      return false;
  }
}
else return false;

// 다른 풀이
if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
return false;

