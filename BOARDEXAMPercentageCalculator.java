package com.company;

//WAP TO CALCULATE THE PERCENTAGE OF BOARD EXAM:-
import java.util.Scanner;
public class Exercise1_PercentageCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Maximum Marks of all the subjects: ");
        float a = sc.nextFloat();
        System.out.println("Enter the marks obtained in the subjects: ");
        System.out.println("In Computer Science: ");
        float b = sc.nextFloat();
        System.out.println("In English: ");
        float c = sc.nextFloat();
        System.out.println("In Math: ");
        float d = sc.nextFloat();
        System.out.println("In Chemistry: ");
        float e = sc.nextFloat();
        System.out.println("In Physics: ");
        float f = sc.nextFloat();
        float total = b+c+d+e+f;
        System.out.println("Total marks of the student out of maximum marks:"+total);
        float percentage = (total/a)*100;
        System.out.println("Percentage of the student in board exam: "+percentage);
    }
}
