import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            int sum = 0;
            int add = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='O'){
                    add++;
                    sum += add;
                } else {
                    add = 0;
                }
            }
            System.out.println(sum);
        }
    }
}