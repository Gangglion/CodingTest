// 레벨1 : 가장 가까운 같은 글자
import java.util.*;
class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> strMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!strMap.containsKey(s.charAt(i)))
                answer[i] = -1;
            else
                answer[i] = i-strMap.get(s.charAt(i));
            strMap.put(s.charAt(i),i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = solution("banana");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i!=array.length-1)
                System.out.print(", ");
        }
        System.out.println("");
    }
}