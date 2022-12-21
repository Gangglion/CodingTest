import java.io.IOException;
import java.io.InputStreamReader;

// 실버4 - 괄호
import java.util.*;
import java.io.*;

public class Sliver4_1 {
    public static void main(String[] args) throws IOException {
        // 괄호를 스택에 저장. (는 저장 )가 나오면 pop. 전체 문자열의 길이만큼 반복. 반복이 끝났을때 스택이 비어있으면 true
        // 아니면 false
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<>();
        ArrayList<String> result_ar = new ArrayList<>();
        for(int i=0;i<loop;i++){
            String inputStr = br.readLine();
            for(int k=0;k<inputStr.length();k++){
                if(inputStr.charAt(k)=='(')
                    st.push(inputStr.charAt(k));
                else{
                    if(!st.empty() && st.contains('('))
                        st.pop();
                    else
                        st.push(inputStr.charAt(k));
                }
            }
            if(st.empty())
                result_ar.add("YES");
            else
                result_ar.add("NO");
            st.clear();
        }
        for(String s:result_ar)
            System.out.println(s);
    }
}
