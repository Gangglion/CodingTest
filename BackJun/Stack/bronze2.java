import java.util.*;

// 막대기
/**
 * bronze2
 */
public class bronze2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 1;
        Stack<Integer> st = new Stack<>();
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            st.push(sc.nextInt());
        }
        int last = st.peek();
        while(!st.empty()){
            if(last<st.peek()){
                last = st.peek();
                answer++;
                st.pop();
            }
            else
                st.pop();
        }
        System.out.println(answer);
        sc.close();
    }
}