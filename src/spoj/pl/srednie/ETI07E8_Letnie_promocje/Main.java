package spoj.pl.srednie.ETI07E8_Letnie_promocje;

import java.util.*;

/**
 * Created by wojtas on 25.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wyrazy = sc.nextInt(), liczb = sc.nextInt();
        HashMap<String,HashSet<String>> slownik = new HashMap<String,HashSet<String>>();
        while(wyrazy-->0) {
            String str = sc.next();
            add(slownik, keyNumber(str),str);
//            slownik.put(keyNumber(str),str);
        }
        while(liczb-->0){
            wypisz(slownik, sc.next());
        }

        sc.close();
    }

    private static void add(HashMap<String, HashSet<String>> slownik, String key, String value) {
        HashSet<String> values = slownik.get(key);
        if(values == null) values = new HashSet<String>();
        values.add(value);
        slownik.put(key,values);
    }

    private static void wypisz(HashMap<String, HashSet<String>> slownik, String key) {
        if(!slownik.containsKey(key))System.out.println("BRAK");
        else {
            TreeSet<String> lista = new TreeSet<String>();
            lista.addAll(slownik.get(key));
//            LinkedList<String> lista = new LinkedList<String>();
//            lista.addAll(slownik.get(key));
//            HashSet<String> wyrazy = slownik.get(key);
//            TreeSet<String> treeSet = new TreeSet<String>();
//            treeSet.addAll(wyrazy);

//            while(slownik.containsKey(next)) lista.add(slownik.get(next));
//            Collections.sort(lista);
            while(!lista.isEmpty())System.out.print(lista.pollFirst()+" ");
            System.out.println();
        }
    }

    private static String keyNumber(String wyraz) {
        String result ="";
        for(char c: wyraz.toCharArray())
            result+=keyNumber(c);
        return result;
    }

    private static String keyNumber(char c) {
        if("abc".indexOf(c) !=-1) return "2";
        else if("def".indexOf(c) !=-1) return "3";
        else if("ghi".indexOf(c) !=-1) return "4";
        else if("jkl".indexOf(c) !=-1) return "5";
        else if("mno".indexOf(c) !=-1) return "6";
        else if("pqrs".indexOf(c) !=-1) return "7";
        else if("tuv".indexOf(c) !=-1) return "8";
        else if("wxyz".indexOf(c) !=-1) return "9";
        else return "";
    }

}
