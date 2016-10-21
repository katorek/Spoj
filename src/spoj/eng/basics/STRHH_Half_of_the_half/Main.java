package spoj.eng.basics.STRHH_Half_of_the_half;

import java.util.*;
import java.lang.*;

class Main {

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            String str = sc.next();
            for(int i=0;i<str.length()/2;i+=2)
                System.out.print(str.charAt(i));
            System.out.println();
        }

        sc.close();
    }
}