package string;

import java.util.Scanner;

public class Test09 {
    public int Solution(String s) {
        String answer = "";
        // for (char x : s.toCharArray()) {
        // if (x >= 48 && x <= 57) {
        // answer = answer * 10 + (x - 48);
        // }
        // }

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Test09 T = new Test09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
