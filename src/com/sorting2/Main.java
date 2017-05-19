package com.sorting2;

public class Main {

    public static void main(String[] args) {
    int [] a = {2,-4,5,-4,10};

        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j <a.length ; j++) {
                if (a[i] < a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println("i = " + i + ", a[i] = " + a[i]);
        }
    }
}
