package LeetCode.Basic;

public class Palindrome {
    public static void main(String[] args) {

        boolean res = isPalindrome(121);
        if (res){
            System.out.println(" is a palindrome");
        } else{
            System.out.println(" is not a palindrome");
        }

    }
    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        int y = x;
        int temp = 0;
        while(y != 0){
            temp = (temp * 10) + y%10;
            y = y/10;
        }
        if(x == temp){
            return true;
        }
        return false;
    }
}
