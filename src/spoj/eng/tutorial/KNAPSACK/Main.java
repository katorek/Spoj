package spoj.eng.tutorial.KNAPSACK;

import java.util.Scanner;

/**
 * Created by wojtas on 16.08.2016.
 */
public class Main {

    public static int maxx(int a, int b){
        return (a>b)?a:b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt(), items = sc.nextInt();
        int[][] tab = new int[items+1][capacity+1];
        for(int i=0;i<items+1;++i)
            tab[i][0]=0;
        for(int i=0;i<capacity+1;++i)
            tab[0][i]=0;
        for(int j=1;j<items+1;++j){
            int size=sc.nextInt(), cap=sc.nextInt();
            for(int i=1;i<capacity+1;++i){
                if(i<size)tab[j][i]=tab[j-1][i];
                else{
                    tab[j][i]=maxx(tab[j-1][i], tab[j-1][i-size]+cap);
                }
            }
        }
        System.out.println(tab[items][capacity]);
        sc.close();
    }
}
