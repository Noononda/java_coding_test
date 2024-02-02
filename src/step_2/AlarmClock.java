package step_2;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int time = (hour * 60) + minute - 45;
        int alarm = 1440;
        if (time < 0) {
            time = alarm + time;
        }
        System.out.println(time / 60);
        System.out.println(time % 60);
        }
    }

