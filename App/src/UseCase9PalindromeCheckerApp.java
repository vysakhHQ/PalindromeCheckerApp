import java.util.Scanner;

public class UseCase9PalindromeCheckerApp{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Input = ");
        String str=sc.nextLine();

        boolean result=check(str,0,str.length()-1);

        System.out.println("Is Palindrome? : "+result);

    }

    private static boolean check(String s,int start,int end){

        if(start>=end)
            return true;

        if(s.charAt(start)!=s.charAt(end))
            return false;

        return check(s,start+1,end-1);

    }

}