class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        String sanswer;
        
        if(Integer.parseInt(sa+sb)>Integer.parseInt(sb+sa)){
            sanswer = sa + sb;
            answer = Integer.parseInt(sanswer);
        } else {
            sanswer = sb + sa;
            answer = Integer.parseInt(sanswer);
        }
        
        return answer;
    }
}