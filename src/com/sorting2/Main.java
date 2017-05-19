package com.sorting2;

public class Main {

    public static void main(String[] args) {
    int [] a = {2,-4,5,-4,10};
        boolean wasSwap;
        for (int i = 0; i <a.length ; i++) {
            wasSwap = false;
            for (int j = i; j <a.length ; j++) {
                if (a[i] < a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    wasSwap = true;
                }
            }
            if(!wasSwap) {
                break;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println("i = " + i + ", a[i] = " + a[i]);
        }
    }
}
