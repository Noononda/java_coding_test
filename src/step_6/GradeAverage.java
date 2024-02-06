package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GradeAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double [] ave = new double[20];
        String [] grade = new String[20];
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double subave = Double.parseDouble(st.nextToken());
            String subgrade = st.nextToken();
            if (subgrade.equals("P")) {
                ave[i] = 0;
                grade[i] = "null";
            } else {
                ave[i] = subave;
                grade[i] = subgrade;
            }
        }

        double [] intgrade = new double[20];
        for (int i = 0; i < 20; i++) {
            if (grade[i].equals("A+")) {
                intgrade[i] = 4.5;
            } else if (grade[i].equals("A0")) {
                intgrade[i] = 4.0;
            } else if (grade[i].equals("B+")) {
                intgrade[i] = 3.5;
            } else if (grade[i].equals("B0")) {
                intgrade[i] = 3.0;
            } else if (grade[i].equals("C+")) {
                intgrade[i] = 2.5;
            } else if (grade[i].equals("C0")) {
                intgrade[i] = 2.0;
            } else if (grade[i].equals("D+")) {
                intgrade[i] = 1.5;
            } else if (grade[i].equals("D0")) {
                intgrade[i] = 1.0;
            } else if (grade[i].equals("F")) {
                intgrade[i] = 0.0;
            } else if (grade[i].equals("null")){
                intgrade[i] = 0.0;
            }
        }
        double sum = 0;
        double count = 0;
        for (int i = 0; i < 20; i++) {
            if (grade[i].equals("null") == false) {
                sum = sum + (ave[i] * intgrade[i]);
                count = count + ave[i];
            }
        }
        System.out.println(sum/count);
    }
}
