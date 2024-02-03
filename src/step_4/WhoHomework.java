package step_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WhoHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] students = new int[30];
        int[] homework = new int[28];

        for (int i = 0; i < 28; i++) {
            homework[i] = scan.nextInt();
        }

        for (int j = 1; j <= 30; j++) {
            for (int i = 0; i < 28; i++) {
                if (j == homework[i]) {
                    students[j - 1] = 0;
                    break;
                } else if (j != homework[i]){
                    students[j - 1] = 1;

                }
                }
            }

            for (int i = 0; i < 30; i++) {
                if (students[i] == 1) {
                    System.out.println(i + 1);
                }
            }
        }
    }
