package org.waspec;

public class Main {

    public static void main(String[] args) {
        int x=6;
        int y=-4;
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(5.0/0);
        System.out.println(-5.0/-0);
        System.out.println(1+2+"ABC"+'D');
        int a=100;
        int b=200;
        System.out.println(a++>100 && b-->200);
        System.out.println(a);
        System.out.println(b);
        int x1=100;
        int x2=100;
        int x3=200;
        System.out.println(x1 += x2 += x3 *=100);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
