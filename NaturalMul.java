package WhileLoop;

public class NaturalMul {
    public static void main(String[] args) {
        int n=4;
        int i =1;
        int mul=1;
        while(i<=n) {
           System.out.println("current value is "+i);
            i++;
            mul=mul*i;
        }
        System.out.println(mul);


    }
}
