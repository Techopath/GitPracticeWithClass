package strinsAnsLoops;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class task3_Palindrome {

    public static void main(String[] args) {

        String str = "zooz";
        String newStr ="";

        //1st way
        for (int i = str.length()-1; i >= 0 ; i--) {

            newStr = newStr + str.charAt(i);
        }

        if (str.equals(newStr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a Palindrome");
        }


        //2nd way, using stringBuilder
        StringBuilder s = new StringBuilder(str);
        StringBuilder a = s.reverse();
        if (s.equals(s)){
            System.out.println(s + " "+ a);
        }else {
            System.out.println(s + " "+ a);

        }


        boolean check = true;

        for (int i = 0; i <str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                check = false;
                break;
            }
        }
        System.out.println(check ? "Palindrome" : "Not Palindrome");



    }



}
