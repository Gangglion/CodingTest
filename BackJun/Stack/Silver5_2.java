/**
 * Silver5_2
 */

// 실버5 - 기술 연계 마스터 임스
import java.util.*;
import java.io.*;

public class Silver5_2 {
    public static void main(String[] args) throws IOException {
        // 기술이 1~9, L, R, S, K가 있다. 1~9는 조건없이 발동 가능하고,
        // R은 L을 무조건 발동해야 발동 가능하고, K는 S를 무조건 발동해야 발동이 가능하다.
        // 즉 2개 스택을 주고 L과 S는 서로 다른 스택에 저장, 1~9가 입력되면 카운트 증가,
        // R이면 스택에 L이 있는지 검사, S면 스택에 K가 있는지 검사. 있다면 카운트 증가, 없다면 발동불가하므로 카운트 증가x
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int skillCount = 0;
        int act_skill = Integer.parseInt(br.readLine());
        Stack<Character> st_LR = new Stack<>();
        Stack<Character> st_SK = new Stack<>();
        String skillName = br.readLine();
        for (int i = 0; i < act_skill; i++) {
            char temp = skillName.charAt(i);
            if (temp >= 49 && temp <= 57)
                skillCount++;
            if (temp == 'L' || temp == 'R')
                st_LR.push(temp);
            if (temp == 'S' || temp == 'K')
                st_SK.push(temp);
        }
        String lr = st_LR.peek().toString();
        st_LR.pop();
        lr += st_LR.peek();
        st_LR.pop();
        String sk = st_SK.peek().toString();
        st_LR.pop();
        lr += st_LR.peek();
        st_LR.pop();
        if (st_LR == "RL")
            skillCount++;
        if (st_LR == "KS")
            skillCount++;
        System.out.println(skillCount);
    }
}