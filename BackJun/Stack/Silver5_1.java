import java.io.*;
import java.util.*;

// 실버5 - 자료구조는 정말 최고야
public class Silver5 {
    public static void main(String[] args) {
        // 첫 입력 받고 두번쨰 입력 받고, 세번쨰 입력 받을때 받은내용 배열 저장, 내림차순 확인. 아니면 바로 break, false면 No 출력
        try {
            // // 배열을 사용한 방법 - 조건을 만족하려면 내림차순이여야 하므로, 입력받은 배열과 그 배열을 내림차순한것을 비교하여
            // // 입력받은 배열이 내림차순인지 확인. 아니면 false 반환
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // boolean check = true;
            // String firstInput = br.readLine();
            // int bookN = Integer.parseInt(firstInput.split(" ")[0]);
            // int dummyN = Integer.parseInt(firstInput.split(" ")[1]);
            // for (int i = 0; i < dummyN; i++) {
            //     int d_bookN = Integer.parseInt(br.readLine());
            //     String[] input = br.readLine().split(" ");
            //     Integer[] int_input = new Integer[input.length];
            //     for (int k = 0; k < input.length; k++)
            //         int_input[k] = Integer.parseInt(input[k]);
            //     Integer[] temp = int_input.clone();
            //     Arrays.sort(temp, Comparator.reverseOrder());
            //     for (int k = 0; k < temp.length; k++) {
            //         if (int_input[k] == temp[k])
            //             continue;
            //         else {
            //             check = false;
            //             break;
            //         }
            //     }
            // }

            //// Stack 을 사용한 방법
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean check = true;
            Stack<Integer> st = new Stack<>();
            String firstInput = br.readLine();
            int bookN = Integer.parseInt(firstInput.split(" ")[0]);
            int dummyN = Integer.parseInt(firstInput.split(" ")[1]);
            for (int i = 0; i < dummyN; i++) {
                int d_bookN = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                for (int k = 0; k < input.length; k++)
                    st.push(Integer.parseInt(input[k]));
                int preVal = 0;
                while(!st.empty()){
                    if(preVal == 0)
                        preVal=st.peek();
                    else if(st.peek()<preVal){
                        check = false;
                    }
                    preVal = st.peek();
                    st.pop();
                }
            }
            if (check)
                System.out.println("Yes");
            else
                System.out.println("No");
        } catch (Exception err) {
            System.out.println(err.toString());
        }
    }
}
