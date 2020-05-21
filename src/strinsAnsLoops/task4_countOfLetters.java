package strinsAnsLoops;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task4_countOfLetters {

    public static void main(String[] args) {
        String str ="javajj";
        String check = "";


        int count =0;
        for (int i = 0; i < str.length() ; i++) {
            if (check.contains(str.charAt(i)+"")) continue;
            count =0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) count ++;


            }

            System.out.println(str.charAt(i) + " "+count);

            check += str.charAt(i);
        }




    }
}
