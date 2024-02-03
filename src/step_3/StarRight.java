package step_3;

import java.util.Scanner;
public class StarRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();

        for(int i =1; i<=cnt; i++) {
            for(int j=1; j<=cnt ; j++) {
                if(j>cnt-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}


