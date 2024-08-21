import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int share[] = new int [10];
        int diff = 0;
        boolean flag;

        for (int i = 0; i < share.length; i++) {
            share[i] = sc.nextInt()%42;
        }
        for (int i = 0; i < share.length; i++) {
            flag = false;
            for (int j = i+1; j < share.length; j++) {
                if(share[i]==share[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                diff++;
            }
        }
        System.out.println(diff);
    }
}