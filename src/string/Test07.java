package string;

import java.util.Scanner;

public class Test07 {

    public String Solution(String str) {
        // String answer = "YES";
        // str = str.toUpperCase();
        // int len = str.length();
        // for (int i = 0; i < len / 2; i++) {
        // if (str.charAt(i) != str.charAt(len - i - 1)) {
        // answer = "NO";
        // }
        // }
        // return answer;

        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Test07 T = new Test07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
