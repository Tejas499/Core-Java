package practiceQUE;
import java.util.Scanner;
// Array Rotation: Rotate an array N times to the right or left as specified by the user.
// Word Frequency Counter: Write a program to count the frequency of words in a given string.
// Matrix Multiplication: Implement matrix multiplication for two user-input matrices.
// Bank Account Simulation: Create a class BankAccount with methods for deposit, withdraw, and balance inquiry. Allow multiple accounts.
// Palindrome Checker: Check if a string or number is a palindrome.
public class INTERMIDIATE {
    static Scanner sc=new Scanner(System.in);
    static void Rotate(int []arr,int n){
        int []res=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            res[(i+n)%arr.length]=arr[i];
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    static boolean isPalindrome(StringBuilder s){
        
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }
    

    public static void main(String[] args) {
        int []arr=new int[4];
        // int n=sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        //Rotate(arr,n);
        StringBuilder s=new StringBuilder(sc.nextLine());
        
        // System.out.println(isPalindrome(s));
    }
    
}
