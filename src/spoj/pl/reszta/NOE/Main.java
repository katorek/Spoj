package spoj.pl.reszta.NOE;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by wojtas on 30.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        //not works, nioptymalny algorytm
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        while(sc.hasNext()){
            String number = sc.next();
            if(set.contains(number))set.remove(number);
            else set.add(number);
        }
        System.out.println(set.iterator().next());
        sc.close();
    }
}
