package spoj.pl.srednie.TMUL_NotSoFastMultiplication;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wojtas on 26.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = sc.nextInt();
        while(par-->0){
            BigInteger  b1 = new BigInteger(sc.next()),
                        b2 = new BigInteger(sc.next());
            System.out.println(b1.multiply(b2));
        }
        sc.close();
    }
}
