// 레벨 1 : 최소직사각형 문제
class Solution {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int[] max_size = new int[sizes.length];
        int[] min_size = new int[sizes.length];
        int max_ms = 0;
        int min_ms = 0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                max_size[i] = sizes[i][0];
                min_size[i] = sizes[i][1];
            }
            else{
                max_size[i] = sizes[i][1];
                min_size[i] = sizes[i][0];
            }
        }
        for(int i=0;i<max_size.length;i++){
            if(max_size[i]>max_ms)
                max_ms = max_size[i];
            if(min_size[i]>min_ms)
                min_ms = min_size[i];
        }
        answer = max_ms * min_ms;
        return answer;
    }
    public static void main(String[] args) {
        int[][] data = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(data));
    }
}