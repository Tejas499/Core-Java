package practiceQUE;
import java.util.Scanner;

// // Basic Level
// Odd-Even Sum: Write a program that takes a number N as input and calculates the sum of its odd and even digits separately.
// Factorial Calculator: Create a program to calculate the factorial of a number using both iterative and recursive methods.
// Prime Number Checker: Write a program to check if a number is prime or not.
// Reverse a String: Input a string and output the reversed version of it without using built-in functions.
// Fibonacci Series: Print the Fibonacci series up to a given number N.

public class BASIC {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
   
    public static void Fibbonaci(int n,int i,int j){
        
        if(n==0){
            return;
        }
        System.out.println(i);
       
        Fibbonaci(n-1,j,i+j);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //  int n=sc.nextInt();
    //  int evenSum=0;
    //  int oddSum=0;
    //  for(int i=0;i<n;i++){
    //     int j=sc.nextInt();
    //     if(j%2==0){
    //         evenSum+=j;
    //     }
    //     else{
    //         oddSum=j;
    //     }
    // }
    // System.out.println("EVENSUM:::"+ evenSum);
    
    // System.out.println("ODDSUM:::"+oddSum);
       
    //    System.out.println(factorial(n));

    //Fibbonaci(n,0,1);
    }
   
    

}
