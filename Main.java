package com.samarth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int k=0;
        int[] arr= {18,12,9,14,77,50};
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number to search= ");
        int a=sc.nextInt();
        for(int i=0;i<6;i++)
        {
            if(arr[i]==a)
            {
                System.out.println("the number is present in the array");
                break;

            }
            else
            {
                k=k+1;
            }
            if(k==6)
            {
                System.out.println("sorry it isnt in the array");
            }
        }
    }

}
