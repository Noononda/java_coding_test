package step_2;

import java.util.Scanner;
public class DuckAlarm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int time = (A * 60) + B + C;

        int hour = time / 60 % 24 ;
        int minute = time % 60;
        System.out.print(hour);
        System.out.print(" ");
        System.out.print(minute);
        }

    }


