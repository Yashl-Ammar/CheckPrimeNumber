package com.company;

import java.util.Scanner;

public class Main {

    public static void checkPrime(int number)
    {
        if(number < 0 )
        {
            System.out.println("The number can not be negative");
        }
        else if (number == 1 || number == 0)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            boolean b = true;
            for(int i = 2 ; i < number/2 ; i++)
            {
                if(number%i == 0)
                {
                    b = false;
                    System.out.println("Number is not prime");
                    break;
                }
            }
            if(b)
            {
                System.out.println("Number is prime");
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int number = sc.nextInt();

        checkPrime(number);


    }
}
