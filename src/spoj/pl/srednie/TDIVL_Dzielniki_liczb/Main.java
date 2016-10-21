package spoj.pl.srednie.TDIVL_Dzielniki_liczb;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by wojtas on 21.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            BigInteger a = new BigInteger(sc.next()),
                    b = new BigInteger(sc.next());
            System.out.println((a.mod(b)==BigInteger.ZERO)?"TAK":"NIE");
        }
    }
}
