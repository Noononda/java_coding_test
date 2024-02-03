package step_3;

import java.io.*;
import java.util.StringTokenizer;


public class FastAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String all = br.readLine();
            StringTokenizer st = new StringTokenizer(all);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            bw.write(sum + "\n");


        }
        bw.flush();
        bw.close();

    }

}

