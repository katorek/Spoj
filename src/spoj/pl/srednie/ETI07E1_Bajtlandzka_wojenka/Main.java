package spoj.pl.srednie.ETI07E1_Bajtlandzka_wojenka;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wojta on 20.08.2016.
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> kartyBajtka = new LinkedList<>(),
                kartyPrzeciwnik = new LinkedList<>();
        for (int i = 0; i < 26; ++i)
            kartyBajtka.add(sc.nextInt());
        for (int i = 1; i <= 52; ++i) if (!kartyBajtka.contains(i)) kartyPrzeciwnik.add(i);
        Collections.sort(kartyBajtka);
        Collections.sort(kartyPrzeciwnik);
        int win = 0;
        for (int i : kartyBajtka) {
            if (i > kartyPrzeciwnik.get(0)) {
                kartyPrzeciwnik.remove(0);
                ++win;
            }
        }
        System.out.println(win);
    }
}
