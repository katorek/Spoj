package spoj.pl.srednie.OI15_PLA_Plakatowanie;

import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), bud=0;
        LinkedList<Integer> lista= new LinkedList<Integer>();
        while(t-->0){
            int x = sc.nextInt(),
                    y = sc.nextInt();
            while(x-->0){
                lista.add(y);++bud;
            }
        }
        int plakat=0;
        while(bud>0){
            int idx = 0;
            while(idx <lista.size() && lista.get(idx)==0)idx++;
            int poczatek=idx;
            if(idx==lista.size())break;
            int min = lista.get(idx);
            while(idx<lista.size() && lista.get(idx)!=0){
                min = (min < lista.get(idx))?min:lista.get(idx);
                ++idx;
            }
            ++plakat;
            int koniec = idx;
            for(int i=poczatek;i<koniec;++i){
                lista.set(i,lista.get(i)-min);
                if(lista.get(i)==0)--bud;
            }
        }
        System.out.println(plakat);
    }
}