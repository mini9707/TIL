class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // String str = ;
        int add = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int mul = 2 * a * b;
        
        if(add > mul) {
            answer = add;
        } else if (add == mul) {
            answer = add;
        } else {
            answer = mul;
        }
        
        
        
        return answer;
    }
}