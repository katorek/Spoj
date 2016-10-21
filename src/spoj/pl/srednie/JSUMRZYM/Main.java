package spoj.pl.srednie.JSUMRZYM;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by wojtas on 25.08.2016.
 */
public class Main {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    private final static TreeMap<String, Integer> map2= new TreeMap<String,Integer>();

    static {
        map.put(1000,"M");map2.put("M",1000);
        map.put(900,"CM");map2.put("CM",900);
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
    }

    public final static String toRoman(int number){
        int l = map.floorKey(number);
        if(number == l){
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

    private static int toArabic(String roman){
        int number = 0;
        for(int i=0;i<roman.length();++i){
            if(i==roman.length()-1){
                number+=(romanValue(roman.charAt(i)));
            }
            else if(romanValue(roman.charAt(i+1)) > romanValue(roman.charAt(i))){
                number+=(romanValue(roman.charAt(i+1))-romanValue(roman.charAt(i)));
                i++;
            }else{
                number+=(romanValue(roman.charAt(i)));
            }
        }
        return number;
    }
    private static int romanValue(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    private int AtoR(String str){
        int sum = 0;

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] array= {"I","IV","V","CMXCVIII"};
//        for(String c: array){
//            int i;
//            System.out.println((i=toArabic(c)) + "\t"+toRoman(i));
//        }
        while(sc.hasNext()){
            String a = sc.next(), b = sc.next();
            System.out.println(toRoman(toArabic(b)+toArabic(a)));
        }
        sc.close();
    }
}
