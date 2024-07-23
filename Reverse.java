package WhileLoop;

public class Reverse {
    public static void main(String[] args) {
        int n=987 ;
        int reverse=0;
        int lastdigit;
        while(n>0) {
            lastdigit = n%10;              // take it last digit out
            reverse=reverse*10+lastdigit; // store it in variable
            n=n/10;                       // elimanate the last digit
        }
        System.out.println(reverse);
    }
}
