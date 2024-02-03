package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NewGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] grade = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
        }

        int big = grade[0];
        for (int i = 0; i < N; i++ ) {

            if (grade[i] > big) {
                big = grade[i];
            }
        }

        int all = 0;
        for (int i = 0; i < N; i++) {
            all = all + grade[i];
        }
        double average = 0;
        average = (double) all / big * 100 / N;
        System.out.println(average);

    }
}
