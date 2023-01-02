// 셀프 넘버
// 함수 d(n)은 양의정수 n에 대해서 n과 n의 각 자리수를 더하는 함수. d(75) = 75+7+5 = 87
// n,d(n),d(d(n)) .. 과 같은 무한 수열을 만들 수 있다
// n은 d(n)의 생성자이다. 생성자가 없는 숫자를 셀프 넘버라고 함.
// 10000보다 작거나 같은 셀프 넘버를 한줄에 출력하는 프로그램 작성
import java.util.*;
public class Sliver5 {
    static ArrayList<Integer> arr;
    public static void main(String[] args) {
        arr = new ArrayList<>();
        // 시작시 1부터 10000까지 들어있는 배열 생성. 재귀함수로 10000을 입력하면 10000이 될때까지 함수 d(n) 실행. 
        for (int i = 0; i < 10000; i++)
            arr.add(i + 1);
        checkSelfNum();

    }
    static void checkSelfNum() {
        for (int i = 1; i <= 10000; i++) {
            int result = i;
            for (int k = 0; k < Integer.toString(i).length(); k++) {
                result += Integer.toString(i).charAt(k)-'0'; // char 로 잘랐을때 아스키코드 값이 아닌 온전한 숫자를 얻고 싶었음
            }
            if (arr.contains(result))
                arr.remove(Integer.valueOf(result)); // result가 int 이므로 index로 받아들여지기 때문에 result의 값 자체를 객체로 전달함
            else
                continue;
        }
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}