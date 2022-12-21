/**
 * Silver5_2
 */

// 실버5 - 기술 연계 마스터 임스
import java.util.*;
import java.io.*;

public class Silver5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int skillCount = 0;
        int act_skill = Integer.parseInt(br.readLine());
        Stack<Character> st_L = new Stack<>();
        Stack<Character> st_S = new Stack<>();
        String skillName = br.readLine();
        for (int i = 0; i < act_skill; i++) {
            char temp = skillName.charAt(i);
            if (temp >= '1' && temp <= '9')
                skillCount++;
            else if (temp == 'L')
                st_L.push(temp);
            else if(temp == 'S')
                st_S.push(temp);
            if(temp == 'R'){
                if(st_L.empty())
                    break;
                else if(!st_L.empty()){
                    st_L.pop();
                    skillCount++;
                }
            }
            else if(temp=='K'){
                if(st_S.empty())
                    break;
                else if(!st_S.empty()){
                    st_S.pop();
                    skillCount++;
                }
            }
        }
        System.out.println(skillCount);
    }
}
