package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char [] original = S.toCharArray();
        char [] fake = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            fake[i] = original[original.length - 1 - i];
        }

        String soriginal = new String(original);
        String sfake = new String(fake);

        if (soriginal.equals(sfake)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
