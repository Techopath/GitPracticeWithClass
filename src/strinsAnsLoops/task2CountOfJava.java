package strinsAnsLoops;

import java.util.Arrays;

public class task2CountOfJava {
    public static void main(String[] args) {
        System.out.println(countOfJava("javaajavais un java"));

        System.out.println(countOfWordWithSplit("java is fun. actually it is notjava fun java"));


        //find how many times a word appears in any string given
        //1st way
        int java = 0;
        String str = "java is java ";
        System.out.println(str);
        while (str.contains("java")){
            java++;
            str = str.replaceFirst("java","");
            System.out.println("after replacement: "+str);
        }
        System.out.println(java);


    }

    ///2nd way, using substring method
    public static int countOfJava(String str){

        int count  =0 ;

        for (int i = 0; i < str.length()-3; i++) {
           String newstr =  str.substring(i,i+4);
            if (newstr.equals("java")){
                count ++;
            }
        }

        return count;
    }

    //3rd way, using split method and storing the splitted words into an array of strings.
    public static int countOfWordWithSplit(String str){

        int count =0;
        String [] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        for (String each:array) {
            if (each.equals("java")){
                count++;
            }
        }

        return count;
    }



}
