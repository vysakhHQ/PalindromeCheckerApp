import java.util.Scanner;
public class UseCase13PalindromeCheckerApp{
    public static boolean isPalindrome(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String input=sc.nextLine();
        long startTime=System.nanoTime();
        boolean result=isPalindrome(input);
        long endTime=System.nanoTime();
        long executionTime=endTime-startTime;
        System.out.println("Is Palindrome : "+result);
        System.out.println("Execution Time : "+executionTime+" ns");
    }
}