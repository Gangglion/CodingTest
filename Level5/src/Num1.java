public class Num1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
class Test{
    long sum(int[] a){
        long sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}