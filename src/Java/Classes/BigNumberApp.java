package Java.Classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a =  new BigInteger("2000000000000000000000");
        BigInteger b =  new BigInteger("3000000000000000000000");

        BigInteger c = a.add(b);
        System.out.println(c);
        System.out.println(" ");
        BigInteger d = c.min(a);
        System.out.println(d);
    }
}
