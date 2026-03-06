import java.util.Scanner;
public class UseCase11PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        PalindromeService service=new PalindromeService();
        boolean result=service.checkPalindrome(input);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
class PalindromeService{
    public boolean checkPalindrome(String input){
        int start=0;
        int end=input.length()-1;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}