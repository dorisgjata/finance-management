package com.finance.management.models;

public class Comparator {
    private int intA;
    private int intB;
    private String sA;
    private String sb;
    private int[] arrA;
    private int[] arrB;

    public Comparator(int intA, int intB, String sA, String sb, int[] arrA, int[] arrB) {
        this.intA = intA;
        this.intB = intB;
        this.sA = sA;
        this.sb = sb;
        this.arrA = arrA;
        this.arrB = arrB;
    }

    public int getIntA() {
        return this.intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public int getIntB() {
        return this.intB;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }

    public String getSA() {
        return this.sA;
    }

    public void setSA(String sA) {
        this.sA = sA;
    }

    public String getSb() {
        return this.sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public int[] getArrA() {
        return this.arrA;
    }

    public void setArrA(int[] arrA) {
        this.arrA = arrA;
    }

    public int[] getArrB() {
        return this.arrB;
    }

    public void setArrB(int[] arrB) {
        this.arrB = arrB;
    }

    public boolean compare(int[] a, int[] b){
        if(a.length == b.length) {
          for (int i = 0; i < a.length; i++) {
              if( a[i] != b[i]){
                return false;
              }
          }
          return true;  
        }
        return false;
        
    }

}