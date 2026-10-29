import java.util.Scanner;
public class PalindromeTest 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to see if it is a palindrome ");
        String current = sc.nextLine();
        Palindrome a = new Palindrome();
        System.out.println(a.isPalindrome(current));
    }
}
