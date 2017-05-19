package com.sorting2;

public class Main {

    public static void main(String[] args) {

        //bubble sort
        /*int [] a = {2,-4,5,-3,10};
        boolean wasSwap;
        for (int i = 0; i <a.length ; i++) {
            wasSwap = false;
            for (int j = i; j <a.length -1; j++) {
                if (a[i] < a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
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
*/
        int [] b = {5,1,12,-5,16,2,12,14};
        boolean wasSwap;
        for (int i = 0; i <b.length ; i++) {
            //find minimum starting from i
            int minindex = i;
            int min = b[i];
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < min) {
                    minindex = j;
                    min = b[j];
                }
            }
        // moving smallest element to the front and the element of index i to the index of minimal element
            int temp = b[i];
            b[i] = min;
            b[minindex] = temp;
        }

    }
}