// 브론즈4
// 숫자의 합 - N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
import java.util.*;

public class Num2 {
    public int solution(int len,String str) {
        int answer = 0;
        char[] c = str.toCharArray();
        for (char x : c) {
            answer+=Character.digit(x,10);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num2 t = new Num2();
        int len = sc.nextInt();
        String str = sc.next();
        System.out.println(t.solution(len,str));
    }
}
