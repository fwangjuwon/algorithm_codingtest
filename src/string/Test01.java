package string;

import java.util.Scanner;

public class Test01 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println(str + " " + t);

        // for문
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == t) {
        // answer++;
        // }
        // }

        // foreach문으로 문자 하나하나를 대응해서 foreach문해야한다.
        // : 뒤에 오는 것들은 배열 or class형 프레임워크(arraylist...) 등이 와야한다.
        // str을 문자 배열로 만들어줘야한다. => toCharArray
        // str의 문자 하나하나를 나눠서 문자 배열을 만들어주는 것이다.
        // 0번 index부터 하나하나 들어가는 것이다.
        for (char x : str.toCharArray()) {
            if (x == t)
                answer++;
        }
        return answer;

    }

    public static void main(String[] args) {
        Test01 T = new Test01();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
