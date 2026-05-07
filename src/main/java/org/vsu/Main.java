package org.vsu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 2, 5, 6, 4 }));
    }

    public static int maxProfit(int[] arr) {
        int maxDiff = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int el : arr) {
            minPrice = Math.min(el, minPrice);
            int profit = el - minPrice;
            maxDiff = Math.max(profit, maxDiff);
        }

        return maxDiff;
    }
}
