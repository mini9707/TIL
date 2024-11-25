class Solution {
    public int[] solution(int[] num_list) {
        int[] a = new int[num_list.length+1];
        
        for(int i=0; i<num_list.length; i++){
            a[i] = num_list[i];
        }
        
        int max = num_list[num_list.length-1];
        int max_1 = num_list[num_list.length-2];
        a[num_list.length] = max > max_1 ? (max - max_1) : (max * 2);
        
        return a;
    }
}