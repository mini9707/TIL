import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        String result = "";
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]+1 == a[i+1]){
                result = "ascending";
            } else if (a[i]-1 == a[i+1]) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);



    }
}