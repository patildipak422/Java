import java.math.BigInteger;
import java.util.Scanner;
public class FactorialUsingBigInteger{
    static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}