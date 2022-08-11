package string;

import java.util.Scanner;

public class Test02 {

    public String solution(String str) {
        String answer = "";
        for (char a : str.toCharArray()) {

            if (a >= 97 && a <= 122) {
                answer += (char) (a - 32);
            } else {
                answer += (char) (a + 32);
            }
            // if (Character.isLowerCase(a))
            // answer += Character.toUpperCase(a);
            // else
            // answer += Character.toLowerCase(a);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test02 t = new Test02();
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        System.out.println(t.solution(x));
    }
}
