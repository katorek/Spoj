package spoj.pl.srednie.JGGHACK_Lamacz_gg;

import java.util.Scanner;

/**
 * Created by wojtas on 21.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alfabet ="ABCDEFGHIJKLMNOP";
        while(sc.hasNext()){
            String str = sc.next();
            for(int i=0;i<str.length();i+=2){
                Character a=str.charAt(i), b=str.charAt(i+1);
                int a2=0, b2=0;
                for(int j=0;j<alfabet.length();++j){
                    if(a.equals(alfabet.charAt(j))){
                        a2=j;
                    }
                    if(b.equals(alfabet.charAt(j))){
                        b2=j*16;
                    }
                }
                char c = (char)(a2+b2);
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}
