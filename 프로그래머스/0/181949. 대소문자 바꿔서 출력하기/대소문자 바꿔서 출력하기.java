import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String c="";
        
        for(int i=0; i<a.length(); i++){
            b = a.charAt(i);
            
            if(Character.isUpperCase(b)){
                c += Character.toLowerCase(b);
            } else {
                c += Character.toUpperCase(b);
            }
        }
        System.out.println(c);
    }
}