package se.bahram.seb.eform.xml.beans;

public class SimpleBean {

    private int a = 1;

    private int b = 2;

    private String c = "c";

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
