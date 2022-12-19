import java.io.*;
import java.util.*;

// 실버5 - 자료구조는 정말 최고야
public class Silver5 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] firstInput = br.readLine().split(" ");
            int bookN = Integer.parseInt(firstInput[0]);
            int dummyN = Integer.parseInt(firstInput[1]);
            boolean result = true;
            ArrayList<Stack> ar = new ArrayList<>(dummyN);
            for(int i=0;i<dummyN;i++){
                Stack<Integer> st = new Stack<>();
                int secondInput = Integer.parseInt(br.readLine());
                String[] thirdInput = br.readLine().split(" ");
                st.clear();
                for(int k=0;k<thirdInput.length;k+=2){
                    int temp = Integer.parseInt(thirdInput[k]);
                    if(st.empty())
                        st.push(temp);
                    else if(temp>=st.peek()){
                        result = false;
                        break;
                    }
                }
                ar.add(st);
                bookN-=secondInput;
                if(bookN == 0)
                    break;
                else
                    result = false;
            }
            // for(int i=0;i<ar.size();i++){
            //     if(!result)
            //         break;
            //     Stack<Integer> temp = ar.get(i);
            //     int start = 0;
            //     while(!temp.empty()){
            //         if(start==0){
            //             start = temp.peek();
            //             temp.pop();
            //         }else if(start<temp.peek()){
            //             start = temp.peek();
            //             temp.pop();
            //         }else{
            //             result = false;
            //             break;
            //         }
            //     }
            // }
            if(result)
                System.out.println("Yes");
            else
                System.out.println("No");
        }catch(

    Exception e)
    {
        System.out.println(e.toString());
    }
}}
