package step_5;
// ㅁㅊ역대급

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class SangSu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 토크나이저로 쪼개줌. 배열을 만들때 길이가 필요하기 때문에 먼저 string 타입으로 받아오고
        // 그걸 다시 int로 바꿔서 비교할 수 있게 함
        // 문제를 잘못 이해했다.. 바뀐 숫자중에서 큰 수를 구하라는 거였다..
        String A = st.nextToken();
        String B = st.nextToken();

        // 어차피 숫자일 필요 없으니까 그냥 문자열로 배열을 만들어 준다.
        char[] bigA = A.toCharArray();
        char[] bigB = B.toCharArray();

        char temp = 0;
        // 숫자 바꾸기
        for (int i = 0; i < (A.length() / 2); i++) {
            temp = bigA[i];
            bigA[i] = bigA[A.length() - 1 - i];
            bigA[A.length() - 1 - i] = temp;
            // A의 길이에서 하나를 빼야 인덱스 범위에 맞고, i만큼을 빼줘야 대칭이 맞다.
        }
        // 숫자 바꾸기
        for (int i = 0; i < (B.length() / 2); i++) {
            temp = bigB[i];
            bigB[i] = bigB[A.length() - 1 - i];
            bigB[A.length() - 1 - i] = temp;
            // A의 길이에서 하나를 빼야 인덱스 범위에 맞고, i만큼을 빼줘야 대칭이 맞다.
        }
        int afterA = contains(bigA);
        int afterB = containers(bigB);

        if (afterA > afterB) {
            System.out.print(afterA);
        } else {
            System.out.print(afterB);
        }
    }
    public static int contains(final char[] bigA) {
        int numberA = Integer.parseInt(new String(bigA));
        return numberA;
    }

    public static int containers(final char[] bigB) {
        int numberB = Integer.parseInt(new String(bigB));
        return numberB;
    }
}





