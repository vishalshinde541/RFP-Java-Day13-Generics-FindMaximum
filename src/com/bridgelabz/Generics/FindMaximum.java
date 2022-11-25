package com.bridgelabz.Generics;

public class FindMaximum<K extends Comparable<K>> {

    void getMax(K n1, K n2, K n3, K n4){
        K max=n1;
        if (n2.compareTo(max) > 0) max=n2;
        if (n3.compareTo(max) > 0) max=n3;
        if (n4.compareTo(max) > 0) max=n4;
        printMax(max);
    }
    void printMax(K value){
        System.out.println("maximum= "+value);
    }
    public static void main(String[] args) {

        FindMaximum maximum=new FindMaximum<>();

        Integer num1,num2,num3,num4;
        num1=5;num2=9;num3=7;num4=3;
        maximum.getMax(num1,num2,num3,num4);

        Float f1,f2,f3,f4;
        f1=5.1f;f2=6.2f;f3=10.5f;f4=2.35f;
        maximum.getMax(f1,f2,f3,f4);

        String s1,s2,s3,s4;
        s1="Apple"; s2="Peach"; s3="Banana"; s4="Mango";
        maximum.getMax(s1, s2, s3, s4);
    }
}