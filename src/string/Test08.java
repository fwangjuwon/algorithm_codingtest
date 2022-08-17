package string;

import java.util.Scanner;

public class Test08 {
    public String Solution(String s) {
        String answer = "No";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        // System.out.println(s);
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            answer = "Yes";
        }
        return answer;
    }

    public static void main(String[] args) {
        Test08 T = new Test08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.Solution(str));
    }
}
