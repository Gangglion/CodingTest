import java.util.*;
import java.io.*;
// 단어 순서 뒤집기
public class bronze1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String[]> arr = new ArrayList<>();
            int count = Integer.parseInt(br.readLine());
            for(int i=0;i<count;i++){
                String[] splitStr = br.readLine().split(" ");
                arr.add(splitStr);
            }
            for(int i=0;i<arr.size();i++){
                Stack<String> st = new Stack<>();
                int loop = arr.get(i).length;
                for(int k=0;k<loop;k++){
                    st.push(arr.get(i)[k]);
                }
                System.out.print("Case #"+(i+1)+": ");
                while(!st.empty()){
                    System.out.print(st.peek()+" ");
                    st.pop();
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
