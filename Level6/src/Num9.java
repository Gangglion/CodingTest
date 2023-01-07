// 2941번(실버5) : 크로아티아 알파벳
// 문제 참고 : https://www.acmicpc.net/problem/2941
// 해시맵 단점 - 저장순서가 보장되지 않아 넣어진 데이터가 랜덤으로 나오게 된다.
// String.contains()는 인자에 charSequence 형이 들어가야 한다고 나와있지만, String 형이 들어가도
// 해당 문자열이 포함되는지 여부를 확인할 수 있다.

import java.util.*;

public class Num9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        hm.put("c=", "1");
        hm.put("c-", "1");
        hm.put("dz=", "1");
        hm.put("d-", "1");
        hm.put("lj", "1");
        hm.put("nj", "1");
        hm.put("s=", "1");

        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (String x : hm.keySet()) {
                if(str.contains(x))
                if (str.indexOf(x) != -1)
                    str = str.replaceAll(x, hm.get(x));
            }
        }
        if (str.indexOf("z=") != -1)
            str = str.replaceAll("z=", "1");
        System.out.println(str.length());
        sc.close();
    }
}
