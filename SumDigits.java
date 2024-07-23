package WhileLoop;

public class SumDigits {
    public static void main(String[] args) {
    int n=689;
    int sum=0;
    while(n>0){
           int temp = n%10;
           sum=sum+temp;
           n=n/10;
           System.out.println("Sum of digits is "+sum);

    }
}
}
