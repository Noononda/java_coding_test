package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] EnglishWord = s.toCharArray();
        int[] intWord = new int[EnglishWord.length];

        // intWord에 값을 넣어준다.
        for (int i = 0; i < EnglishWord.length; i++) {
            if (EnglishWord[i] >= 65 && EnglishWord[i] <= 90) {
                intWord[i] = EnglishWord[i] + 32;
            } else {
                intWord[i] = EnglishWord[i];
            }
        }
        // intWord의 값을 오름차순 정렬
        Arrays.sort(intWord);

        if (intWord.length == 1) {
            if (EnglishWord[0] >= 65 && EnglishWord[0] <= 90) {
                System.out.println(Character.toString((char) intWord[0]));
            } else {
                System.out.println(Character.toString((char) intWord[0] - 32));
            }
        } else {
            // 서로 다른 숫자가 몇 개 있는지 센다.
            int firstcount = 1;
            int firstorigin = intWord[0];
            for (int i = 1; i < intWord.length; i++) {
                if (firstorigin != intWord[i]) {
                    firstcount++;
                    firstorigin = intWord[i];
                }
            }

            // 숫자 종류만큼 있는 배열, 숫자 종류가 써있는 배열 두 개를 만든다.
            int[] counting = new int[firstcount];
            int[] sort = new int[firstcount];
            int[] number = new int[firstcount];

            // 배열을 채워준다.
            int secondcount = 1;
            int secondorigin = intWord[0];
            int temp = 0;
            for (int i = 1; i < intWord.length; i++) {
                if (secondorigin == intWord[i]) {
                    secondcount++;
                } else if (secondorigin != intWord[i]) {
                    counting[temp] = secondcount;
                    number[temp] = secondcount;
                    sort[temp] = secondorigin;
                    temp++;
                    secondcount = 1;
                    secondorigin = intWord[i];
                }
                counting[counting.length - 1] = secondcount;
                number[counting.length - 1] = secondcount;
                sort[sort.length - 1] = secondorigin;
            }

            int best = counting[0];
            int bestchar = sort[0];
            int same = 0;

            Arrays.sort(number);

            if (number[number.length - 1] == number[number.length - 2]) {
                same = 1;
            } else {
                for (int i = 1; i < sort.length; i++) {
                    if (best < counting[i]) {
                        best = counting[i];
                        bestchar = sort[i];
                    }
                }
            }

            if (same == 1) {
                System.out.println("?");
            } else {
                System.out.println(Character.toString((char) bestchar - 32));
            }
        }
    }
}