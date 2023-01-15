import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sNum = sc.nextInt(); // 돌상의 개수
        int[] sDirection = new int[sNum]; // 돌상의 방향
        for(int i=0;i<sNum;i++){
            sDirection[i]=sc.nextInt();        
        }
        HashMap<Integer, Integer> hs = new HashMap<>(); // hs.size() => 깨달음을 얻을 수 있는 총 횟수
        hs.put(1,1); // 1개칠할때 깨달음을 얻을 수 있는 경우의 수 1
        for(int i=2;i<sNum;i++){ // 돌상의 개수만큼 칠할수 있는 경우의 수(1개 칠할때 깨달을 수 있는 횟수는 1이므로 2개칠할때부터 카운트)
            int Ls = 0;
            int Rs = 0;
            for(int k=0;k<sNum-i;k++){ // 각 색칠하는 갯수 당 이웃한 돌상이 나올수 있는 경우의 수만큼 반복. 2개칠할때부터 4, 3, 2, 1번
                int[] tmp = Arrays.copyOfRange(sDirection, k, k+i);
                for(int p=0;p<tmp.length;p++){
                    if(tmp[p]==1) Ls++;
                    else Rs++;
                    int count = Math.abs(Ls-Rs);
                    if(!hs.containsKey(count)) hs.put(i,count);
                }
            }
        }
        System.out.println(hs.size());
    }
}
