package spoj.pl.srednie.JSZYFR2_Szyfrowanie2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wojta on 20.08.2016.
 */

//        A  Z
//        65 90

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list;
        int testy = sc.nextInt();
        while(testy-->0){
            int words = sc.nextInt();
            list = generatePrimes();
            List letters = new LinkedList<Integer>();
            while(words-->0){
                int letter = sc.nextInt();
                letters.add(letter);
                for(int i=0;i<list.size();++i){
                    int res = letter%list.get(i);
                    if(res<65 || res>90){
                        list.remove(i--);
                    }
                }
            }
            if(list.size()!=1)System.out.println("NIECZYTELNE");
            else {
                System.out.println(list.get(0)+ " "+ decode(list.get(0), letters));
            }
        }
        sc.close();
    }

    private static String decode(Integer key, List<Integer> letters) {
        String str="";
        for(int i: letters){
            str += Character.toString ((char)(i%key));
        }
        return str;
    }

    private static List<Integer> generatePrimes() {
        List<Integer> list = new LinkedList<>();
        list.add(127);
        list.add(131);
        list.add(137);
        list.add(139);
        list.add(149);
        return list;
    }


}
