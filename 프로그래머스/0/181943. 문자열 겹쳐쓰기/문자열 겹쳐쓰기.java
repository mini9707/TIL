class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int l = my_string.length();
        int l2 = overwrite_string.length();
        
        answer += my_string.substring(0,s) + overwrite_string + my_string.substring(l2+s, l);
            
        return answer;

        // 다른 사람 답 goat
        // String before = my_string.substring(0, s);
        // String after = my_string.substring(s + overwrite_string.length());
        // return before + overwrite_string + after;
    }
}
