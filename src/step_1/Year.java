package step_1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int minus = 2541 - 1998 ;
        System.out.println(year - minus);
    }
}
