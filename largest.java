package com.jit.thirdsem;

import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter three numbers:");
        for (int i = 0; i < 10;i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}

