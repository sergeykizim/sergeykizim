package com.skizim.homework.lesson02;

public class Lesson2 {

    public static void main(String[] args) {
        A a = new A ();
        System.out.println(a.getI());
        System.out.println(a.getD());
        System.out.println(a.getB());
        System.out.println(a.getS());
        System.out.println(a.getA());
        A a1 = new A (33, 17.5, false, "My new test string", 'q');
        System.out.println(a1.getI());
        System.out.println(a1.getD());
        System.out.println(a1.getB());
        System.out.println(a1.getS());
        System.out.println(a1.getA());
        B b = new B ();
        System.out.println(b);
    }
}
