public class PalindromeCheckerApp{
    public static void main(String[] args){
        String input="madam";
        String reversed="";
        for(int i=input.length()-1;i>=0;i--){
            reversed=reversed+input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is NOT a Palindrome");
        }
    }
}