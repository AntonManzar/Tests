package pack;

import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int r = s.nextInt();
        TreeSet<Integer> i = new TreeSet<>();
        i.add(a);
        i.add(b);
        i.add(c);
        if((i.last()-i.first())<=r) System.out.println("За работу, Солнце ещё высоко");
        else System.out.println("Ура, бастуем!");


    }
}