package spoj.pl.srednie.OSTSIL_Ostania_niezerowa_cyfra_silni;

import java.util.Scanner;

/**
 * Created by wojtas on 21.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab[] = new int[1001];
        tab[0]=1;
        for(int i=1, b=1; i < tab.length; ++i){
            b=b*i;
            while(b%10==0)b/=10;
            b=b%10000;
            tab[i]=b;
        }
        int n= sc.nextInt();
        for(int i=0; i < n;++i){
            System.out.println(tab[sc.nextInt()]%10);
        }
    }
}
