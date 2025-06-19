package day07_relation_operators;

public class OPeratorsPractice2 {
    public static void main(String[] args) {
        int t = 100;

        int p = ++t; // assign(use) + update
        // ++t --- > t = t+1
        // 1. update: t = t + 1; t = 101
        // 2. assign(use): p = 101

        System.out.println(t); // 101
        System.out.println(p); // 101
    }
}

