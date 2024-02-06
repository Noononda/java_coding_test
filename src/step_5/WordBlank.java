package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordBlank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        // 문자열을 먼저 받아오고, 그 문자열을 토크나이저로 쪼개준다.
        // 어차피 여러개의 문장 없으니까 그냥 한 문장 받아서 바로 처리해준다.
        StringTokenizer st = new StringTokenizer(words);

        // add라는 변수에다가 한 번 등장할때마다 1씩 더해준다.
        // hasMoreTokens()는 그다음 토큰이 없으면 false를 반환해준다.
//        int add = 0;
//        while(st.hasMoreTokens()) {
//            add++;
//        }
        // 처음에 이렇게만 했는데 무한반복이 되어서 왜그런지 생각해봤다.
        // 생각해보니 하나도 토큰을 꺼내주지 않아서 그런거였다.

        // 수정
        int add = 0;
        while(st.hasMoreTokens()) {
            String aWord = st.nextToken();
            add++;
        }

        System.out.println(add);
    }
}
