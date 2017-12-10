package com.skizim.homework.lesson02;

public class A {
    int i;
    double d;
    boolean b;
    String s;
    char a;

    A(int i, double d, boolean b, String s, char a) {
        this.i = i;
        this.d = d;
        this.b = b;
        this.s = s;
        this.a = a;
    }

    A() {
        this.i = 1;
        this.d = 2.3;
        this.b = true;
        this.s = "TestString";
        this.a = 't';
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }
    public boolean getB() {
        return b;
    }

    public String getS() {
        return s;
    }

    public char getA() {
        return a;
    }


}
