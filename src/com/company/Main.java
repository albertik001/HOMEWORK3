package com.company;

public class Main {

    public static void main(String[] args) {
        double[] tag = {45.5, -86.2, -88.3, -32.4, -48.8, -55.1, -66.7, -84.5, -23.6, -74.4, -36.2, -22.3, -73.1, 21.7, 22.8};
        double sum = 0;
        int kol = 0;
        boolean otr = false;
        for (double hat : tag) {
            if (hat < 0) {
                otr = true;
            } else {
                if (otr) {
                    kol++;
                    sum += hat;
                }

            }
        }
        System.out.println("Среднее арифметическое=\t"+ sum / kol);
    }
}






