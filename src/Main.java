import java.util.*;

class Main {

    // # = 1, * = 0
    // 10진수 화 한다.
    // 아스키번호 -> 문자로 변환
    // A=65~Z=90
    // #****###**#####**#####**##**
    // 1000011 1001111 1001111 1001100
    // 2의 6승 + 2 + 1 = 67
    // 64 + 8 + 4 + 2 + 1 = 79
    // 79
    // 64 + 8+ 4 = 76

    public String Solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.Solution(n, str));
    }
}
