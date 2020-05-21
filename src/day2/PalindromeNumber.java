package day2;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome2(12030021));
    }

    public static void isPalindrome(long num){
        //String numStr = String.valueOf(num);

        String s ="";
        long lastDigit = num;
        while (lastDigit != 0){
            lastDigit = num%10;
            System.out.println(lastDigit);
            s = s+lastDigit;

        }
        System.out.println(s);


    }


    public static boolean isPalindrome2(long num){

        long remain = num; //12321
        long rev = 0; //1

        while (remain != 0){
            long digit = remain % 10;  //1
            rev = rev * 10 + digit; //0*10+1 = 1
            remain /= 10; //1232
        }

        return num == rev;
    }
}
