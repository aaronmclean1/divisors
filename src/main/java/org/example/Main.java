package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 220;
        int sums = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // checks if i divides evenly into number
                //System.out.println(i);
                sums += i;
            }
        }
        System.out.println("Sums of divisors of " + number + " is:");
        System.out.println(sums);
    }
}
