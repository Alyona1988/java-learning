package lv.acodemy;

public class PracticeLoop {
    public static void main(String[] args) {

        // 1. Use a loop to calculate the sum of numbers from 1 to 20.
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to 20 = " + sum);

        // 2. Write a program to print the multiplication table from 1 to 10.

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }


        // 3. Print numbers in reverse order from 10 to 1.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 4. Print the following pattern using nested loops:
        //*
        //**
        //***
        //****
        //*****

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5.Use a loop to print the squares of numbers from 1 to 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }

        // 6. Write a loop that prints the cumulative sum at each step for numbers from 1 to 10

        int cumulativeSum = 0;
        for (int i = 1; i <= 10; i++) {
            cumulativeSum += i;
            System.out.println("Step" + i + ": " + cumulativeSum);
        }

        // 7.Create an int array and use a loop to print each element.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 8. Write a loop to count down from 100 to 0, decrementing by 5 each time.

        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

}





