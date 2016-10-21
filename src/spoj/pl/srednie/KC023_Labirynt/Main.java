package spoj.pl.srednie.KC023_Labirynt;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by wojta on 28.08.2016.
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            boolean[][] t = przetworz(sc.next());
            System.out.println(reachable(t));
        }
        sc.close();
    }
    //84
    private static String reachable(boolean[][] t) {
        if(!t[0][0] || !t[9][9]) return "0";
        LinkedList<Integer> toProcess = new LinkedList<Integer>();
        toProcess.add(0);
        while(!toProcess.isEmpty()){
            int xy = toProcess.poll(), x=xy/10, y=xy%10;
            if(xy==99)return "1";
            if(t[x][y]) addAround(xy,toProcess,t);
            t[x][y]=false;
        }
        return "0";
    }

    private static void addAround(int xy, LinkedList<Integer> toProcess, boolean[][] t) {
        int x = xy/10, y = xy%10;
        if(x==0){
            if(y==0){
                if(t[0][1])toProcess.add(1);
                if(t[1][0])toProcess.add(10);
            }
            else if(y==9){
                if(t[0][8])toProcess.add(8);
                if(t[1][9])toProcess.add(19);
            }
            else{
                if(t[0][y-1])toProcess.add(y-1);
                if(t[0][y+1])toProcess.add(y+1);
                if(t[x+1][y])toProcess.add((x+1)*10+y);
            }
        }
        else if(x==9){
            if(y==0){
                if(t[9][1])toProcess.add(91);
                if(t[8][0])toProcess.add(80);
            }
            else if(y==9){
                if(t[9][8])toProcess.add(98);
                if(t[8][9])toProcess.add(89);
            }
            else{
                if(t[9][y-1])toProcess.add(90+y-1);
                if(t[9][y+1])toProcess.add(90+y+1);
                if(t[x-1][y])toProcess.add((x-1)*10+y);
            }
        }
        else {
            if(y==0){
                if(t[x-1][y])toProcess.add((x-1)*10+y);
                if(t[x][y+1])toProcess.add((x)*10+y+1);
                if(t[x+1][y])toProcess.add((x+1)*10+y);
            }
            else if(y==9){
                if(t[x-1][y])toProcess.add((x-1)*10+y);
                if(t[x][y-1])toProcess.add((x)*10+y-1);
                if(t[x+1][y])toProcess.add((x+1)*10+y);
            }
            else{
                if(t[x-1][y])toProcess.add((x-1)*10+y);
                if(t[x][y-1])toProcess.add((x)*10+y-1);
                if(t[x][y+1])toProcess.add((x)*10+y+1);
                if(t[x+1][y])toProcess.add((x+1)*10+y);
            }
        }
    }

    private static boolean[][] przetworz(String next) {
        boolean[][] t = new boolean[10][10];
        for(int i=0;i<100;++i){
            t[i/10][i%10]=(next.charAt(i)=='O')?true:false;
        }
        return t;
    }
}
