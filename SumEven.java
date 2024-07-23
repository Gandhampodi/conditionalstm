package WhileLoop;

public class SumEven {
    public static void main(String[] args) {
        int n=100;
        int i=2;
        int sum=0;
        while(i<=n) {
            if(i%2==0) {
                System.out.println(i);
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
