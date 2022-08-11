package string;

import java.util.Scanner;

public class Test03 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos); // 0번지부터 pos 번지 전까지
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
        }
        return answer;
        // String[] s = str.split(" ");
        // for (String x : s) {
        // int len = x.length();
        // if (len > m) {
        // m = len;
        // answer = x;
        // }
        // }
        // return answer;
    }

    public static void main(String[] args) {
        Test03 t = new Test03();
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        System.out.println(t.solution(x));
    }
}
