import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger prev1 = BigInteger.ONE;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger curr;
        BigInteger sum = BigInteger.valueOf(2);

        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
            curr = prev1.add(prev2);
            System.out.println(curr);
            sum = sum.add(curr);
            prev1 = prev2;
            prev2 = curr;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}